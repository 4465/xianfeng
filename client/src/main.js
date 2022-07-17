import Vue from 'vue'
import App from './App.vue'
import './plugins/element.js'

//引入VueRouter
import VueRouter from "vue-router"
//引入路由器
import router from "@/router";



//关闭生产提示
Vue.config.productionTip = false
//应用插件
Vue.use(VueRouter)


//client分支
new Vue({
  render: h => h(App),
  router:router,
}).$mount('#app')
