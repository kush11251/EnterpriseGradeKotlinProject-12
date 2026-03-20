// App class
import com.company.app.controllers.UserController

class App {
    fun run() {
        val userController = UserController(UserService(UserRepository()))
        val users = userController.getAllUsers()
        users.forEach { user -> println(user.name) }
    }
}