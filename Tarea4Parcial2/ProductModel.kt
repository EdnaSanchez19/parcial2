package sie.edu.primeraclase.Tarea4Parcial2

import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int,
    val name: String,
    val description: String?,
    val price: Float,
    @DrawableRes val image: Int
)