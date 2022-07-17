<template>
  <div>
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
  name: "Index",
  components: {Article, Header}
}
</script>

<style scoped>

</style>