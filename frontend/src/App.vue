<template>
  <div id="app">
    <Header/>
    <Middle :categories="categories"/>
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
      categories: []
    }
  },
  beforeMount() {
    axios.get("/recommendations/1/top_categories").then(response => {
      this.categories = response.data
    })
  }
}
</script>

<style>
#app {

}

Middle {
  width: 100%;
  height: 100%;
}
</style>
