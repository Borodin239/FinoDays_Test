<template>
  <div class="middle">
    <Index :categories = categories :expenses = expenses  v-if="page === 'Index'" />
    <Enter v-if="page === 'Enter'"/>
  </div>
</template>

<script>

import Enter from "@/components/middle/Enter";
import Index from "@/components/middle/Index";

export default {
  name: "Middle",
  components: {/*Category,*/ Index, Enter},
  props: ["categories", "expenses"],
  data: function () {
    return {
      page: "Enter"
    }
  },
  beforeCreate() {
    this.$root.$on("onChangePage", (page) => this.page = page)
  }
}
</script>

<style scoped>
.middle {
  padding-top: 66px;
}
</style>