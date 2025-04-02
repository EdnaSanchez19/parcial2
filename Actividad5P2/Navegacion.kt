package sie.edu.primeraclase.Actividad5P2
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import sie.edu.primeraclase.HomeView

@Composable
@Preview(showBackground = true)

fun NavegacionView() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        ///// Aqui los nombres de rutas y su componente/vista resprectiva
        composable(route = "home") { //label
            HomeView(navController)
        }

        composable(route = "student/{edadInt}",
            arguments = listOf(
                navArgument("edadInt") {
                    type = NavType.IntType
                }
            )
        )
        { parametros ->

            val edadInt = parametros.arguments?.getInt("edadInt") ?: 0
            ActividadView(edadInt)

        }
    }
}