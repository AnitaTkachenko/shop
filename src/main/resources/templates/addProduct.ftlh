<#import "base.ftlh" as base>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<@base.layout>

</@base.layout>
<h2>Добавление товара</h2>
<form action="addProduct">
    <label for="name">Наименование</label><input type="text" id="name">
    <label for="price">Стоимость</label><input type="number" id="price">
    <label for="description">Краткое описание</label><input type="text" id="description">
    <label for="manufacturer">Производитель</label><input type="text" id="manufacturer">
    <label for="category">Категория</label><input type="text" id="category">
    <button>Добавить</button>
</form>
</body>
</html>