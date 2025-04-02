package sie.edu.primeraclase.Tarea3Parcial2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavegacionLaboView() {

    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable(route = "home") { //label
            HomeLaboView(navController)
        }

        composable(route = "student/{nombre}/{id}",
            arguments = listOf(
                navArgument("nombre") {
                    type = NavType.StringType
                },
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        )
        { parametros ->

            val studentName = parametros.arguments?.getString("nombre") ?: ""
            val studentId = parametros.arguments?.getInt("id") ?: 0
            Tarea3View(studentId, studentName)
        }
    }
}