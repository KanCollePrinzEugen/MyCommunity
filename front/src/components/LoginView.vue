<template>
  <h1>社区平台</h1>
  <div class="container">
    <el-form :model="formData"
        label-width="70px"
        ref="formData"
        v-loading="Loading"
    >
      <h2>请输入登录信息</h2>
      <el-form-item label="用户名" prop="name">
        <el-input v-model="formData.username" autocomplete="off" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="登录密码" prop="password">
        <el-input v-model="formData.password" type="password" autocomplete="off" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item label="验证码" prop="code" autocomplete="off" placeholder="请输入验证码">
        <el-input v-model="formData.code" style="width: 52%"></el-input>
        <el-image :src="captchaUrl" style="cursor: pointer" @click="updateVerifyCode"></el-image>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="submitForm">登录</el-button>
        <el-button v-on:click="toRegister">注册</el-button>
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
      loading:false,
      captchaUrl: '',
      formData:{
        username: '',
        password: '',
        code: '',
      },
      rules: {
        username: [{required: true, message: "请输入用户名", trigger: 'blur'}],
        password: [{required: true, message: "请输入密码", trigger: 'blur'}],
        code: [{required: true, message: "请输入验证码", trigger: 'blur'}]
      }
    }
  },
  mounted() {
    this.updateVerifyCode();
    // axios.get("http://localhost:80/captcha").then(response =>{
    //   if (response.status === 200){
    //     this.captchaUrl = "data:image/jpeg;base64," + response.data
    //   } else {
    //     console.log(response)
    //   }
    // })
  },
  methods:{
    updateVerifyCode(){
      this.$getReq('/captcha').then(response =>{
        if (response.code === 0){
          let data = response.data;
          this.captchaUrl = "data:image/jpeg;base64," + data;
        } else {
          ElMessage.error(response.msg)
        }
      });
    },
    submitForm(){
      this.$refs.formData.validate((valid) => {
        if (valid){
          this.loading = true;
          this.$postReq('/login', this.formData).then(response =>{
            this.loading = false;
            if (response.code === 0){
              let data = response.data;
              console.log(data);
            } else {
              ElMessage.error(response.msg)
            }
          });
              let path = this.$route.query.redirect;
              this.$router.replace((path === '/' || path === undefined)? '/home': path)
        }
      })
      // let data ={
      //   loginName: this.formData.username,
      //   loginPwd: this.formData.password,
      //   validCode: this.formData.code
      // }
      // axios.post("/doLogin", data).then(response => {
      //   if (response.code === 0){
      //     let data = response.data;
      //     console.log(data);
      //   } else {
      //     ElMessage.error(response.msg)
      //   }
      // })
      // this.$postReq('/login', this.formData).then(response =>{
      //   if (response.code === 0){
      //     let data = response.data;
      //     console.log(data);
      //     let path = this.$route.query.redirect;
      //     this.$router.replace((path === '/' || path === undefined)? '/home': path)
      //   } else {
      //     ElMessage.error(response.msg)
      //   }
      // });
    },
    toRegister(){
      let path = this.$route.query.redirect;
      this.$router.replace((path === '/' || path === undefined)? '/register': path)
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
