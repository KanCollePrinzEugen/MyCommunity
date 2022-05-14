import axios from "axios";
import {ElMessage} from "element-plus";

let baseUrl = "http://localhost:80"

axios.interceptors.response.use(success => {
    if (success.status === 200){
        let data = success.data;
        if (data.code == 0){
            return data.data;
        } else {
            ElMessage.error({message: data.msg})
            return ;
        }
    } else {
        ElMessage.error({message: "访问错误,错误号" + success.status})
        return ;
    }
    // eslint-disable-next-line no-unreachable
    console.log(success);
    return success;
});

axios.interceptors.response.use(success => {

})

export const getReq = (url, data) => {
    return axios({
        url: baseUrl + url,
        method: 'GET',
        params: data
    });
}
export const postReq = (url, data) => {
    return axios({
        url: baseUrl + url,
        method: 'POST',
        params: data
    });
}