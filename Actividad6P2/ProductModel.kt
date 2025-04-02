package sie.edu.primeraclase.Actividad6P2

import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int,
    val name: String,
    val shipping: String,
    val label: String?, //? Optional "hola" null ""
    val price: Float,
    @DrawableRes val image: Int //0,1,100, null
)