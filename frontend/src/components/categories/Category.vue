<template>
  <section>
    <div class="header">
      {{ category.name }}
    </div>
  </section>
</template>

<script>
export default {
  name: "Category",
  props: ["category"]
}
</script>

<style scoped>

</style>