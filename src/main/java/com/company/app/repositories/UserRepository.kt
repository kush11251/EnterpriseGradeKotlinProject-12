// User repository
import com.company.app.models.User

class UserRepository {
    fun findAll(): List<User> {
        // Simulate a database query
        return listOf(User("John Doe"), User("Jane Doe"))
    }
}