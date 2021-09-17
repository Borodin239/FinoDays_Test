<template>
  <html lang="en">
  <head>

    <!-- Loading bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <title>Аутентификация</title>
  </head>

  <body>
  <div class="main-container row justify-content-center">
    <div class="col-4 align-self-center">
      <div class="card">
        <div class="card-body">
          <form method="post" style="margin: 10px">
            <h2 style="margin-bottom: 30px">Аутентификация</h2>
            <div class="mb-4">
              <label for="username_input" class="form-label">Имя пользователя</label>
              <input v-model="user_id" type="text" name="username_input" class="form-control" id="username_input">
            </div>
            <div class="mb-4">
              <label for="password_input" class="form-label">Пароль</label>
              <input type="password" name="password_input" class="form-control" id="">
            </div>
            <button type="submit" class="btn btn-outline-secondary" v-on:click="changePage('Index')">Войти</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  </body>
  </html>
</template>

<script>

export default {
  name: "Enter",
  data: function () {
    return {
      user_id: null
    }
  },
  methods: {
    changePage: function (page) {
      this.$root.$emit("onChangePage", page);
      this.$root.$emit("getCategories", this.user_id);
      this.$root.$emit("getExpenses", this.user_id);
    }
  }
}
</script>

<style scoped>
body {
  position: absolute;
  height: 90%;
  width: 100%;
  background-color: #323242;
}

.main-container {
  position: absolute;
  height: 90%;
  width: 100%;
}
</style>