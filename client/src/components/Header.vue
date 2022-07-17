<template>
  <div>
    <el-container>
      <el-header>
        <div style="font-size: 36px" >先锋笔记</div>
        <el-menu
            mode="horizontal"
            class="el-menu--popup-bottom-start"
            background-color="#545c64"
            text-color="#fff"
            router
            :default-active="this.$route.path"
        >
          <el-menu-item >首页</el-menu-item>
          <el-submenu>
            <template slot="title">游客，您好</template>
            <el-menu-item>注册</el-menu-item>
            <el-menu-item>登录</el-menu-item>
          </el-submenu>
          <el-submenu>
            <template slot="title">个人中心</template>
            <el-menu-item index="2-4-1">写博客</el-menu-item>
            <el-menu-item index="2-4-2">我的收藏</el-menu-item>
            <el-menu-item index="2-4-3">个人设置</el-menu-item>
          </el-submenu>
          <el-menu-item>关于</el-menu-item>
        </el-menu>
      </el-header>
    </el-container>
  </div>

</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Header",

}
</script>

<style scoped>

</style>