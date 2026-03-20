// User adapter
import com.company.app.models.User

class UserAdapter {
    fun adapt(user: User): Map<String, Any> {
        return mapOf("name" to user.name)
    }
}