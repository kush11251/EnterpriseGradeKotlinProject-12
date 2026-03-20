// Logger utility
import java.util.logging.Logger

class Logger {
    companion object {
        private val logger = Logger.getLogger(Logger::class.java.name)
        fun info(message: String) {
            logger.info(message)
        }
    }
}