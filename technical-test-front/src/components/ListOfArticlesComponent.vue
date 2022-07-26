<template>
  <table>
    <thead>
      <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>price</th>
      </tr>
    </thead>
    <tbody>
        <ArticleComponent  v-for="article in allArticles" v-bind:key="article.id" :article="article" />
    </tbody>
  </table>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import ArticleComponent from "../components/ArticleComponent";

export default  defineComponent ({
  name: "ListOfArticlesComponent",
  components: {
    ArticleComponent
  },
  props: {
    allArticles: { type: [], required: true}
  }
})
</script>

<style scoped>

</style>