<template>
  <footer>
    <div>
      © 2001 – 2021 ПAO «Промсвязьбанк»
      Генеральная лицензия на осуществление банковских операций № 3251 от 17 декабря 2014
    </div>
  </footer>
</template>

<script>
export default {
  name: "Footer"
}
</script>

<style scoped>
footer {
  position: absolute;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: #323242;
  color: aliceblue;
  font-size: small;
}

div {
  margin-top: 5vh;
  margin-bottom: 5vh;
  margin-left: 50vh;
}
</style>