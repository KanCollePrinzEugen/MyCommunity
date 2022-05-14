<template>
  <div class="container">
    <el-form
        v-model="formData"
        label-width="70px"
    >
      <h2>请输入注册信息</h2>
      <el-form-item label="用户名" prop="name">
        <el-input v-model="formData.loginName"></el-input>
      </el-form-item>
      <el-form-item label="登录密码" prop="password">
        <el-input v-model="formData.loginPwd" type="password"></el-input>
      </el-form-item>
      <el-form-item label="验证密码" prop="confirmPassword">
        <el-input v-model="formData.loginConfirmPwd" type="password"></el-input>
      </el-form-item>
      <el-form-item label="邮箱" prop="email">
        <el-input v-model="formData.loginEmail"></el-input>
      </el-form-item>
      <el-form-item label="电话" prop="tel">
        <el-input v-model="formData.loginTel"></el-input>
      </el-form-item>
      <el-form-item label="验证码">
        <el-input v-model="formData.validCode" style="width: 52%"></el-input>
        <el-image :src="captchaUrl"></el-image>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="submitForm">注册</el-button>
        <el-button>取消</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import axios from 'axios'
export default {
  name: "RegisterView",
  data(){
    return{
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
    axios.get("http://localhost:80/captcha").then(response =>{
      if (response.status == 200){
        this.captchaUrl = "data:image/jpeg;base64," + response.data
      } else {
        console.log(response)
      }
    })
  },
  methods:{
    submitForm(){
      let data ={
        loginName: this.formData.loginName,
        loginPwd: this.formData.loginPwd,
        loginConfirmPwd: this.formData.loginConfirmPwd,
        loginEmail: this.formData.loginEmail,
        loginTel: this.formData.loginTel,
        validCode: this.formData.validCode
      }
      axios.post("http://localhost:80/doRegister", data).then(response => {
        if (response.status == 200){
          let data = response.data;
          console.log(data);
        }
      })
    }
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