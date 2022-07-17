<template>
  <div style="margin: 0px">
    <el-header>
      <Header></Header>
    </el-header>
    <el-container>

      <Article></Article>
    </el-container>

  </div>
</template>

<script>
import Header from "@/components/Header";
import Article from "@/views/article/Article";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Home",
  components: {Article, Header}
}
</script>

<style scoped>

</style>