import axios from "axios";
import {ElMessage} from "element-plus";
// import router from '@/router'

let baseUrl = "http://localhost:80"

axios.interceptors.response.use(
    success => {
        console.log(success)
        if (success.status && success.status === 200 && success.data.code !== 0) {
            ElMessage.error({message: success.data.msg});
            return;
        }
        if (success.data.message) {
            ElMessage.success({message: success.data.msg})
        }
        return success.data;
    },
    error =>{
        if (error.response.status === 504 || error.response.status === 404){
            ElMessage.error({message : "未找到请求的资源"})
        } else if (error.response.status === 403){
            ElMessage.error({message : "无访问权限"})
        } else if (error.response.status === 401){
                ElMessage.error({message : "请先登录"})
            } else {
            if (error.response.data.msg){
                ElMessage.error({message : error.response.data.msg + '(' +  error.response.status + ')'})
            } else {
                ElMessage.error({message : '未知错误' + '(' +  error.response.status + ')'})
            }
        }
    }
);


export const getReq = (url, data) => {
    return axios({
        url: baseUrl + url,
        method: 'get',
        params: data
    });
}
export const postReq = (url, data) => {
    return axios({
        url: baseUrl + url,
        method: 'POST',
        data: data
    });
}
