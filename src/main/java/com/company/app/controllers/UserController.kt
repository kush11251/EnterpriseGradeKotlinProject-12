// User controller
import com.company.app.services.UserService

class UserController(private val userService: UserService) {
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }
}