// Приклад правильної взаємодії

val startFrom = 0
val count = 10


when(requestArticlesList(startFrom , count)) {
    1 -> {
        AlertDialog.Builder(this)
            .setMessage("Запит виконано")
            .setPositiveButton("OK") { dialog, which ->
                finish()
            }
            .show()
    }
}

// Приклад неправильної взаємодії з користувачем та збереженням витрати користувача

val startFrom = -1
val count = 10


when(requestArticlesList(startFrom , count)) {
    -1 -> {
        AlertDialog.Builder(this)
            .setMessage("Запит не виконано. startFrom  менше нуля")
            .setPositiveButton("OK") { dialog, which ->
                finish()
            }
            .show()
    }
}

// Приклад неправильної взаємодії
val startFrom = 0
val count = -1


when(requestArticlesList(startFrom , count)) {
    -2 -> {
        AlertDialog.Builder(this)
            .setMessage("Запит не виконано. count менше нуля")
            .setPositiveButton("OK") { dialog, which ->
                finish()
            }
            .show()
    }
}

// Приклад неправильної взаємодії
val startFrom = 0
val count = 21


when(requestArticlesList(startFrom , count)) {
    -3 -> {
        AlertDialog.Builder(this)
            .setMessage("Запит не виконано. count быльше 20")
            .setPositiveButton("OK") { dialog, which ->
                finish()
            }
            .show()
    }
}
