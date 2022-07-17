import VueRouter from "vue-router";
import HelloWorld from "@/components/HelloWorld";
// import Home from "@/components/Home";
import About from "@/components/About";
import Login from "@/views/Login";
import Vue from "vue";

Vue.use(VueRouter)
//创建并暴露一个路由器
export default  new VueRouter({
    routes:[
        {
            path:'/',
            component:Login
        },
        {
            path:'/about',
            component:About
        },
        {
            path:'/home',
            component:HelloWorld
        }
    ]
})