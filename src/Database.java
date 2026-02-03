import java.sql.*;

public class Database {

    static final String URL =
            "jdbc:postgresql://ep-aged-smoke-ahl272wf-pooler.c-3.us-east-1.aws.neon.tech:5432/neondb?sslmode=require&channel_binding=require";

    static final String USER = "neondb_owner";
    static final String PASSWORD = "npg_udSFwieozm27";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
