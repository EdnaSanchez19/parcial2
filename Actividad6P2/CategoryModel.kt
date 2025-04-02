package sie.edu.primeraclase.Actividad6P2

import androidx.annotation.DrawableRes

data class CategoryModel(
        val id: Int,
        val name: String,
        @DrawableRes
        val image: Int ) //0,1,100, null
