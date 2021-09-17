<template>
  <!--<html lang="en">

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
                <li class="list-group-item">Путешествия <b>234 032 ₽</b></li>
                <li class="list-group-item">Еда <b>143 392 ₽</b></li>
                <li class="list-group-item">Одежда <b>77 039 ₽</b></li>
                <li class="list-group-item">Дом, ремонт <b>63 943 ₽</b></li>
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
  </html>-->
  <div class="main-container">
    ТЫ ХОТЬ ЧТО-ТО ОТОБРАЖАЕШЬ МРАЗЬ?
  </div>
</template>

<script>

export default {
  name: "Index",
  props: ["categories"]
}

</script>


<style scoped>

.categories {
  padding-top: 166px;
}

.main-container {
  padding-top: 100px;
  position: absolute;
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