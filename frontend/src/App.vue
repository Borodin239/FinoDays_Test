<template>
  <div id="app">
    <Header/>
    <Middle :categories="categories" :expenses="expenses"/>
    <Footer/>
  </div>
</template>

<script>
import Header from "@/components/Header";
import Middle from "@/components/Middle";
import Footer from "@/components/Footer";
import axios from "axios";

export default {
  name: 'App',
  components: {
    Footer,
    Middle,
    Header,
  },
  data: function () {
    return {
      categories: [],
      expenses: []
    }
  },
  beforeCreate() {
    this.$root.$on("getCategories", (id) => {
      axios.get(`http://localhost:8085/recommendations/${id}/top_categories`).then(response => {
        this.categories = response.data
      })
    });
    this.$root.$on("getExpenses", (id) => {
      axios.get(`http://localhost:8085/${id}/expenses`).then(response => {
        this.expenses = response.data
      })
    })
  }
}
</script>

<style>
#app {

}
</style>
