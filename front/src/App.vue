<template>
  <router-view></router-view>
  <div class="link-box">
    <router-link to="/Login">登录</router-link>&nbsp;&nbsp;
    <router-link to="/Register">注册</router-link>&nbsp;&nbsp;
    <router-link to="/SysAdmin">管理员列表</router-link>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
.link-box{
  margin-top: 60px;
}
</style>
