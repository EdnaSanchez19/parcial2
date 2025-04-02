package sie.edu.primeraclase.lazylist.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.edu.primeraclase.lazylist.viewmodels.ProductViewModel
import sie.edu.primeraclase.lazylist.viewmodels.StudentViewModel

@Preview(showBackground = true)
@Composable
fun ListProductsView() {
    val productViewModel: ProductViewModel = ProductViewModel()
    val studentViewModel: StudentViewModel = StudentViewModel()

    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn() {
        items(productViewModel.obtenerProductos()){ product ->
            ProductView(producto = product)
            
        }
           // items(productViewModel.obtenerProductos()) { product ->
                //van los componentes/vistas
                //ProductView(producto = product)
           // }

        }
    }
}