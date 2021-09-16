<template>
  <div id="app">
    <Header/>
    <Middle/>
    <Footer/>
  </div>
</template>

<script>
import Header from "@/components/Header";
import Middle from "@/components/Middle";
import Footer from "@/components/Footer";

export default {
  name: 'App',
  components: {
    Footer,
    Middle,
    Header,
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
