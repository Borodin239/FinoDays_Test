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
              <input type="text" name="username_input" class="form-control" id="username_input">
            </div>
            <div class="mb-4">
              <label for="password_input" class="form-label">Пароль</label>
              <input type="password" name="password_input" class="form-control" id="">
            </div>
            <div>
              <Category v-for="category in categories" :category="category" :key="category.name"/>
            </div>
            <button type="submit" class="btn btn-outline-secondary">Войти</button>
          </form>
        </div>
      </div>
    </div>
  </div>
  </body>
  </html>

</template>

<script>
import Category from "@/components/categories/Category";

export default {
  name: "Middle",
  components: {Category},
  props: ["categories"],
}
</script>

<style scoped>
template {
  height: max-content;
}

.main-container {
  position: absolute;
  height: 100%;
  margin-bottom: calc(10vh + 5px);
  width: 100%;
  background-color: #323242;
}
</style>