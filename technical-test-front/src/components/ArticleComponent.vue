<template>
  <tr>
    <td> {{ article.id }}</td>
    <td> {{ article.name }}</td>
    <td> {{ article.description }}</td>
    <td> {{ article.price }}</td>
  </tr>
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default  defineComponent ({
  name: "ArticleComponent",
  props: {
    article: { type: Object, required: true}
  }
})
</script>

<style scoped>

</style>