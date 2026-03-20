// User service
import com.company.app.repositories.UserRepository

class UserService(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}