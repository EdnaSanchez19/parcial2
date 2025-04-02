package sie.edu.primeraclase.Actividad6P2
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
fun NavegacionView() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "categories"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "categories") { //label
            CategoryList(navController)
        }

        composable("products/{categoryId}")
        { parametros ->
            val categoryId = parametros.arguments?.getString("categoryId")
            ProductsView(categoryId)
        }
    }
}
