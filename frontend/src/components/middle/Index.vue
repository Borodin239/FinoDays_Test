<template>
  <html lang="en">
  <head>

    <!-- Loading bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <link rel="stylesheet"
          href="chartist/chartist.min.css">

    <title>Войти</title>
  </head>

  <body>



  <div class="main-container">
    <div class="container-block">
      <h5 style="margin-bottom: 3vh">Карты</h5>
      <div class="list-group">
        <button type="button" class="list-group-item list-group-item-action active bg-primary">
          Дебетовая в рублях
          <div class="fw-bold">4 274 234,20 ₽</div>
        </button>
        <button type="button" class="list-group-item list-group-item-action">
          Дебетовая в долларах
          <div class="fw-bold">1 397 $</div>
        </button>
        <button type="button" class="list-group-item list-group-item-action">
          Кредитная в рублях
          <div class="fw-bold">50 000 ₽</div>
        </button>
      </div>
    </div>
    <div class="container-block">
      <div class="container-header">
        <h3>Анализ расходов</h3>
      </div>
      <div class="container-body">
        <div class="body-block" style="flex-grow: 1">
          <div class="row g-3 align-items-center">
            <div class="col-auto">Расходы с</div>
            <div class="col-auto"><input type="date" class="form-control" placeholder="Дата"></div>
            <div class="col-auto">по</div>
            <div class="col-auto"><input type="date" class="form-control" placeholder="Дата"></div>
            <div class="col-auto fw-bold" align="right">154 320,20 ₽</div>
          </div>
        </div>

        <div class="row" style="margin-top: 4vh">
          <div class="col ct-chart ct-perfect-fourth" style="flex-grow: 3"></div>
          <div class="col" style="flex-grow: 2">
            <ul class="list-group list-group-flush">
              <li v-for="expense in expenses" :key="expense.category"> ${{expense.category}} <b>${{expense.expense}} ₽</b> </li>
              <!--<li class="list-group-item">Путешествия <b>234 032 ₽</b></li>
              <li class="list-group-item">Еда <b>143 392 ₽</b></li>
              <li class="list-group-item">Одежда <b>77 039 ₽</b></li>
              <li class="list-group-item">Дом, ремонт <b>63 943 ₽</b></li>-->
              <li class="list-group-item">Прочее <b>12 492 ₽</b></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <div class="container-block">
      <h5 style="margin-bottom: 3vh">Рекомендации</h5>
      <div class="card" style="width: 20rem;">
        <div class="card-body">
          <h5 class="card-title">Пятёрочка</h5>
          <p class="card-text">Кэшбэк 20% на первую покупку</p>
          <a href="#" class="card-link">Подробнее</a>
        </div>
      </div>
      <div class="card" style="width: 20rem;">
        <div class="card-body">
          <h5 class="card-title">Аскона</h5>
          <p class="card-text">Комплект постельного белья бесплатно при покупке матраса</p>
          <a href="#" class="card-link">Подробнее</a>
        </div>
      </div>
      <div class="card" style="width: 20rem;">
        <div class="card-body">
          <h5 class="card-title">Aviasales</h5>
          <p class="card-text">Бесплатный билет в один конец до Караганды</p>
          <a href="#" class="card-link">Подробнее</a>
        </div>
      </div>
    </div>
  </div>
  </body>


  </html>
</template>

<script>

export default {
  name: "Index",
  props: ["categories", "expenses"]
}

</script>

<!-- Chartist -->
<!--<script src="chartist/chartist.min.js"></script>-->

<!-- Bootstrap -->
<!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
        integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj"
        crossorigin="anonymous"></script>-->

<style scoped>

.header {
  width: 100%;
  background-color: #323242;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1vw;
  height: auto;
}

.header-block {
  margin-left: 2vw;
  margin-right: 2vw;
  color: white;
}

.header-block:hover {
  text-decoration: underline #f26126;
}

.header-block button {
  color: white;
  border-color: white;
}

.header-block button:hover {
  color: #323242;
  border-color: #323242;
  background-color: white;
}
</style>

<!-- Other css for sexy look -->
<style>
html, body {
  height: 100%;
  width: 100%;
}

.main-container {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  padding: 5vw;
  height: 100%;
  width: 100%;
}

.container-body {
  padding-top: 20px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.bg-primary {
  background-color: #323242 !important;
  border-color: #323242 !important;
}

.bg-secondary {
  background-color: #f26126 !important;
  border-color: #f26126 !important;
}

.card-link {
  color: #f26126 !important;
}

.card {
  margin-bottom: 2vh;
}

input:focus {
  border-color: #323242 !important;
  box-shadow: 0 0 0 0.25rem rgb(50, 50, 66) !important;
}
</style>


<!-- Рисуем график -->
<!--<script>
var data = {
  labels: ['Путешествия', 'Еда', 'Одежда', 'Дом и ремонт', 'Остальное'],
  series: [200, 150, 100, 70, 50]
};

var options = {
  labelInterpolationFnc: function (value) {
    return value[0]
  }
};

var responsiveOptions = [
  ['screen and (min-width: 640px)', {
    chartPadding: 30,
    labelOffset: 50,
    labelDirection: 'explode',
    labelInterpolationFnc: function (value) {
      return value;
    }
  }],
  ['screen and (min-width: 1024px)', {
    labelOffset: 80,
    chartPadding: 20
  }]
];

new Chartist.Pie('.ct-chart', data, options, responsiveOptions);
</script>-->