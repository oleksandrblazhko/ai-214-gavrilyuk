### Словник атрибутів об’єктів

|Об'єкт|Атрибут|Короткий опис|Тип|Обмеження|
|:-----:|:-----:|:-----|:-----|:-----|
|Користувач|Логін|Логін користувача|Текст|Довжина < 25 символів|
|Користувач|Пароль|Пароль користувача|Текст|Довжина < 25 символів|
|Користувач|Повне_ім'я|Повне ім'я користувача|Текст|Довжина < 40 символів|
|Користувач|Нікнейм|Псевдонім користувача|Текст|Довжина < 25 символів, Індивідуальне значення|
|-----|-----|-----|-----|-----|
|Запит на отримання списку статтей|Кількість_статтей: int|Ел. пошта користувача|Число|значення < 10|
|Запит на отримання списку статтей|Номер_першої_статті|Номер статті з якої починаючи з якої буде починатися відлік|Число|немае|
|-----|-----|-----|-----|-----|
|Список доступних статтей|Номери_статтей|список з номерами статтей|Массив чисел|немае|
|Список доступних статтей|Назви_статтей|писок назв статтей|Массив текстів|немае|
|Список доступних статтей|Автори_статтей|Список авторів статтей|Массив текстів|немае|
|-----|-----|-----|-----|-----|
|Сховище статтей|Статті|Список об'ектів классу Стаття|Стаття|немає|
|-----|-----|-----|-----|-----|
|Запит на отримання конкретної статті|Номер_статті|Номер статті яку серверу треба прислати|Число|немає|
|-----|-----|-----|-----|-----|
|Стаття|Номер_статті|Персональній айді статті у сховищі|Число|Індивідуальне значення|
|Стаття|Автор|Автор статті|текст|менше 25 символів|
|Стаття|Заголовок|Заголовок|текст|Індивідуальне значення|
|Стаття|Текст|Текст статті|текст|менше 4500 символів|
|-----|-----|-----|-----|-----|
|Замовлення|номер_замовлення|номер замовлення|Число|Індивідуальне значення|
|Замовлення|Замовник|нікнейм замовника|текст|Індивідуальне значення|
|Замовлення|Номери_товарів|список айді товарів|массив чисел|менше 50 елементів|
|-----|-----|-----|-----|-----|
|Сповіщення про виконане замовлення|номер_замовлення|номер виконаного замовлення|Число|Індивідуальне значення|
|-----|-----|-----|-----|-----|
|Працівник|Логін|Логін праціника|Текст|Довжина < 25 символів|
|Працівник|Пароль|Пароль праціника|Текст|Довжина < 25 символів|