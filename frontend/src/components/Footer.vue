<template>
  <footer>
    <div>
      <p> © 2001 – 2021 ПAO «Рога и копыта» <p/>
      <p> Генеральная лицензия на осуществление банковских операций № XXXX от XX декабря XXXX года </p>
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
  margin-top: 1vh;
  margin-bottom: 1vh;
  margin-left: 5vh;
}
</style>