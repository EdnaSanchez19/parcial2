package sie.edu.primeraclase.lazylist.viewmodels

import androidx.lifecycle.ViewModel
import sie.edu.primeraclase.R
import sie.edu.primeraclase.lazylist.models.ProductModel

class ProductViewModel() : ViewModel() {

  //  init {
      //  obtenerProductos()
  //  }

    fun obtenerProductos() :List<ProductModel>{
        var productoUno =
            ProductModel(id = 1, name = "Sushi California Roll",
                description = "9 piezas de sushi ",
                price = 200.0f,
                image = R.drawable.californiaroll)


        var productoDos =
            ProductModel(id = 2, name = "Enchiladas Suizas",
                description = "4 enchiladas rellenas de pollo bañadas en salsa de la casa con queso gratinado encima",
                price = 85.0f,
                image = R.drawable.enchiladassuizas)

        var productoTres =
            ProductModel(id = 3, name = "Combo boneless",
                description = "12 boneless con papas de acompañamiento y refresco de lata de 600ml",
                price = 120.0f,
                image = R.drawable.comboboneless)


        var productoCuatro =
            ProductModel(id = 4, name = "Poke Bowl",
                description = "Tazon de arroz con ingredientes a elegir, y proteina a elegir",
                price = 150.0f,
                image = R.drawable.pokebowl)


        var productoCinco =
            ProductModel(id = 5, name = "Dumplings",
                description = "6 Dumplings al vapor rellenos de carne de puerco",
                price = 85.0f,
                image = R.drawable.dumplings)


        var productoSeis =
            ProductModel(id = 6, name = "Ramen Tradicional",
                description = "Tazon de fideos con caldo tradicional de puerco",
                price = 100.0f,
                image = R.drawable.ramen)


        var productoSiete =
            ProductModel(id = 7, name = "Pizza de Vegetales",
                description = "Pizza Grande de vegetales hecha artesanalmente",
                price = 250.0f,
                image = R.drawable.pizza)


        var productoOcho =
            ProductModel(id = 8, name = "Hot Dog ",
                description = "Hot dog especial, de salchicha de pavo con complementos a elegir",
                price = 5.0f,
                image = R.drawable.hotdog)


        var productoNueve =
            ProductModel(id = 9, name = "Hamburguesa",
                description = "Hamburguesa clasica de doble carne con tocino",
                price = 80.0f,
                image = R.drawable.burguir)


        var productoDiez =
            ProductModel(id = 10, name = "Malteada",
                description = "Malteada de sabor Fresa, Vainilla, Chocolate, Caramelo",
                price = 65.0f,
                image = R.drawable.malteada)


        var productsList = listOf<ProductModel>(
            productoUno,
            productoDos,
            productoTres,
            productoCuatro,
            productoCinco,
            productoSeis,
            productoSiete,
            productoOcho,
            productoNueve,
            productoDiez,
        )
        return productsList
    }

}
