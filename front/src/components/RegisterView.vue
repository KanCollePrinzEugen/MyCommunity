<template>
  <h1>社区平台</h1>
  <div class="container">
    <el-form :model="formData"
        label-width="70px"
             ref="formData"
             v-loading="Loading"
    >
      <h2>请输入注册信息</h2>
      <el-form-item label="用户名" prop="name">
        <el-input v-model="formData.loginName" autocomplete="off" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="登录密码" prop="password">
        <el-input v-model="formData.loginPwd" type="password" autocomplete="off" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item label="验证密码" prop="confirmPassword">
        <el-input v-model="formData.loginConfirmPwd" type="password" autocomplete="off" placeholder="请确认密码"></el-input>
      </el-form-item>
      <el-form-item label="邮箱" prop="email">
        <el-input v-model="formData.loginEmail" autocomplete="off" placeholder="请输入邮箱"></el-input>
      </el-form-item>
      <el-form-item label="电话" prop="tel">
        <el-input v-model="formData.loginTel" autocomplete="off" placeholder="请输入电话"></el-input>
      </el-form-item>
      <el-form-item label="验证码">
        <el-input v-model="formData.validCode" style="width: 52%" autocomplete="off" placeholder="请输入验证码"></el-input>
        <el-image :src="captchaUrl" style="cursor: pointer" @click="updateVerifyCode"></el-image>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="submitForm">注册</el-button>
        <el-button v-on:click="toLogin">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import {ElMessage} from "element-plus";
export default {
  name: "RegisterView",
  data(){
    return{
      loading:false,
      captchaUrl: '',
      formData:{
        loginName: '',
        loginEmail: '',
        loginTel: '',
        loginPwd: '',
        loginConfirmPwd: '',
        validCode: '',
      }
    }
  },
  mounted() {
    this.updateVerifyCode();
  },
  methods:{
    toLogin(){
      let path = this.$route.query.redirect;
      this.$router.replace((path === '/' || path === undefined)? '/login': path)
    },
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
          this.$postReq('/doRegister', this.formData).then(response =>{
            this.loading = false;
            if (response.code === 0){
              let data = response.data;
              console.log(data);
            } else {
              ElMessage.error(response.msg)
            }
          });
          let path = this.$route.query.redirect;
          this.$router.replace((path === '/' || path === undefined)? '/login': path)
        }
      })
    },
  }
}
</script>

<style scoped>
.container{
  width: 20%;
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
</style>
