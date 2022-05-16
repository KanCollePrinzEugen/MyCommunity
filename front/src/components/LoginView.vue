<template>
  <h1>欢迎使用本系统</h1>
  <div class="container">
    <el-form
        v-model="formData"
        label-width="70px"
    >
      <h2>请输入登录信息</h2>
      <el-form-item label="用户名" prop="name">
        <el-input v-model="formData.loginName"></el-input>
      </el-form-item>
      <el-form-item label="登录密码" prop="password">
        <el-input v-model="formData.loginPwd" type="password"></el-input>
      </el-form-item>
      <el-form-item label="验证码">
        <el-input v-model="formData.validCode" style="width: 52%"></el-input>
        <el-image :src="captchaUrl"></el-image>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="submitForm">登录</el-button>
        <el-button>取消</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
// import axios from 'axios'
import {ElMessage} from "element-plus";
export default {
  name: "LoginView",
  data(){
    return{
      captchaUrl: '',
      formData:{
        loginName: '',
        loginPwd: '',
        validCode: '',
      }
    }
  },
  mounted() {
    this.$getReq('/captcha').then(response =>{
      if (response.code === 0){
        let data = response.data;
        this.captchaUrl = "data:image/jpeg;base64," + data;
      } else {
        ElMessage.error(response.msg)
      }
    });
    // axios.get("http://localhost:80/captcha").then(response =>{
    //   if (response.status === 200){
    //     this.captchaUrl = "data:image/jpeg;base64," + response.data
    //   } else {
    //     console.log(response)
    //   }
    // })
  },
  methods:{
    submitForm(){
      let data ={
        loginName: this.formData.loginName,
        loginPwd: this.formData.loginPwd,
        validCode: this.formData.validCode
      }
      // axios.post("/doLogin", data).then(response => {
      //   if (response.code === 0){
      //     let data = response.data;
      //     console.log(data);
      //   } else {
      //     ElMessage.error(response.msg)
      //   }
      // })
      this.$postReq('/doLogin', data).then(response =>{
        if (response.code === 0){
          let data = response.data;
          console.log(data);
        } else {
          ElMessage.error(response.msg)
        }
      });
    }
  }
}
</script>

<style scoped>
  .container{
    width: 300px;
    margin: auto;
    background-color: aliceblue;
    border-radius: 5px;
    box-shadow: 4px 4px 5px #363636;
    color: black;
    padding: 1em;
  }
  h1{
    text-align: center;
  }
  el-form-item{
    margin: auto;
  }
</style>