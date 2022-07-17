<template>
  <div>
    <el-form :rules="rules" ref="loginForm" :model="loginForm" class="loginContainer">
      <h3>系统登录</h3>
      <el-form-item prop="username">
        用户名：<el-input type="text" v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item prop="password">
        密码：<el-input type="password" v-model="loginForm.password" placeholder="请输入密码"></el-input>
      </el-form-item>

      <el-button type="primary" @click="submitLogin">登录</el-button>
    </el-form>
  </div>
</template>

<script>
import {postRequest} from "@/utils/api";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Login",
  data(){
    return {
      captchaUrl:'',
      loginForm:{
        username:'admin',
        password:'123',
        code:''
      },
      checked: true,
      rules:{
        username: [{required:true, message:"请输入用户名",trigger:"blur"}],
        password: [{required:true, message:"请输入密码",trigger:"blur"}]
      }
    }
  },
  methods: {
    submitLogin(){
      this.$refs.loginForm.validate((valid)=>{
        if(valid){
          postRequest('/login', this.loginForm).then(resp=>{
            alert(resp);
          })
        }else{
          this.$message.error("请输入所有字段!")
          return false;
        }
      });
    }
  }

}
</script>

<style scoped>
  .loginContainer{
    border-radius: 15px;
    background-clip: padding-box;
    margin: 190px auto;
    width: 350px;
    padding: 15px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eee;
    box-shadow: 0 0 25px #42b983;
  }

  .loginTitle{
    margin: 0px auto 40px auto;
    text-align: center;
  }
</style>