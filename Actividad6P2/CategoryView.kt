package sie.edu.primeraclase.Actividad6P2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun CategoryListView(navController: NavController) {

    val categoryViewModel: CategoryViewModel = CategoryViewModel()

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyRow() {
            items(categoryViewModel.Categorias()) { category ->
                Category6View(categoria = category, navController)
            }
        }
    }
}