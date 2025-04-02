package sie.edu.primeraclase.Actividad6P2
import androidx.lifecycle.ViewModel
import sie.edu.primeraclase.R


class CategoryViewModel() : ViewModel() {

    fun Categorias(): List<CategoryModel> {
        var nitendo =
            CategoryModel(
                id = 1, name = "Nintendo Switch",
                image = R.drawable.hotdog
            )

        var playstation =
            CategoryModel(
                id = 2, name = "Play Station 5",
                image = R.drawable.viva
            )

        var xbox =
            CategoryModel(
                id = 3, name = "Xbox Series X",
                image = R.drawable.mexico
            )

        var amiibo =
            CategoryModel(
                id = 4, name = "Amiibo",
                image = R.drawable.seul
            )

        var funko =
            CategoryModel(
                id = 5, name = "Funko Pop!",
                image = R.drawable.alemania
            )

        var categoryList = listOf<CategoryModel>(
            nitendo,
            playstation,
            xbox,
            amiibo,
            funko,
        )
        return categoryList
    }

}