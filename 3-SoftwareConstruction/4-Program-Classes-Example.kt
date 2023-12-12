
@Parcelize
data class Article(
    var Article_num: Int = 0, // Унікальний номер
    var Author: String = "", // Нікнейм автора
    var Name: String = "", // Назва статті
    var Content: String = "" // Тіло статті
) : Parcelable


//Класс для підключення до бд
class ArticlesRepo {
    private val database = Firebase.database//об'єкт бази даних
    private val ArticleDBRef = database.getReference("ArticlesStorage")

    // Метод для створення або оновлення запису з бази даних
    fun createOrUpdateArticle(article: models.Article) {
        val ArticleNodeRef = ArticleDBRef.child(article.id.toString())
        ArticleNodeRef.setValue(expRec)
    }

    // Метод для видалення запису з бази даних
    fun deleteRecord(article: models.Article) {
        val ArticleNodeRef = ArticleDBRef.child(article.id.toString())
        ArticleNodeRef.removeValue()
    }

    fun getArticle(id:Int){
        return ArticleDBRef.GetByPrimaryKey(id)
    } : Article
}


// Клас для описування логіки посилання запросів ArticleStorage до бази даних
class ArticleStorage{
    private var repository = ArticlesRepo()//об'єкт репозиторію

    public var requested: Article[]
    // Метод для посилання запиту на отримання статтей до БД
    private fun requestArticlesList(startFrom: Int, count: Int) {
        // Перевіряємо введені дані та виконуємо відповідні дії
        code: Int = 0
        when (checkData(startFrom, count)) {
            //всі дані jnhbvetv
            1 -> {
                num: Int = startFrom
                articles : Article[]
                for (i in 0 upTo count) {
                    article: Article = repository.getArticle(num)
                    num += 1
                    articles.append(article)
                }
                requested = articles
                code = 1
            }
            -1 -> {
                val message = "Номер статті з якої почнеться массив отриманих статтей більше нуля"
                displayErrorMessage(message)
                code = -1
            }
            -2 -> {
                val message = "Кількість статтей які треба отримати менше нуля"
                displayErrorMessage(message)
                code = -2
            }
            -3 -> {
                val message = "Кількість статтей які треба отримати більше 20"
                displayErrorMessage(message)
                code = -3
            }

        }
        return code
    } : Int

    // Метод для перевірки введених даних
    private fun checkData(startFrom: Int, count: Int): Int {
        if (startFrom >= 0) {
            return -1 // Параметри не відповідають умові 1.
        }
        else if (count < 1) {
            return -2 // Параметри не відповідають умові 2
        }
        else if (count > 20) {
            return -3 // Параметри не відповідають умові 3
        }
        return  1
    }

    // Метод для відображення повідомлення про помилку
    private fun displayErrorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}