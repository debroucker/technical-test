<template>
  <ListOfArticlesComponent :all-articles="allArticles "/>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import ArticleService from "./services/ArticleService";
import Article from "./types/Article";
import ResponseData from "./types/ResponseData";
import ListOfArticlesComponent from "./components/ListOfArticlesComponent.vue";

export default defineComponent ({
  name: "App",
  data() {
    return {
      allArticles: [] as Article[]
    };
  },
  components: {
    ListOfArticlesComponent
  },
  methods: {
    getAll() {
      ArticleService.getAll()
        .then((response: ResponseData) => {
          this.allArticles = response.data;
          console.log(response.data);
        })
        .catch((e: Error) => {
          console.log(e);
        });
    }
  },
  mounted() {
    this.getAll();
  }
})
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
</style>
