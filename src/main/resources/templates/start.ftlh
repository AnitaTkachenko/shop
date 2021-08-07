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
<div class="container">
    <table>
        <tr><th>Наименование</th><th>Цена</th><th>Категория</th><th>Производитель</th><th>Действия</th></tr>
        <hr>
        <#list products as p>
            <tr><td><a href="/productDescription/${p.id}">${p.name}</a></td><td>${p.price}</td><td>${p.category}</td><td>${p.manufacturer}</td><td>
                    <div class="btn">
                        <a href="/editProduct/${p.id}">Редактировать</a>
                    </div>
                    <div class="btn">
                        <a href="/deleteProduct/${p.id}">Удалить</a>
                    </div>
                    <div class="btn">
                        <a href="/addToCart/${p.id}">В корзину</a>
                    </div>
                </td></tr>
        </#list>
    </table>
</div>
</body>
</html>