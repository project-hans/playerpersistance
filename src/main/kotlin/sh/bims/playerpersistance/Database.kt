package sh.bims.playerpersistance

import java.sql.Connection
import java.sql.DriverManager

object Database {
    private val URL: String = System.getenv("DB_URL") ?: "jdbc:postgresql://localhost:5432/minecraft"
    private val USER: String = System.getenv("DB_USER") ?: "postgres"
    private val PASSWORD: String = System.getenv("DB_PASS") ?: "midna"
    var SERVER_NODE: String = System.getenv("SERVER_NODE") ?: "main"

    val connection: Connection by lazy {
        DriverManager.getConnection(URL, USER, PASSWORD)
    }
}