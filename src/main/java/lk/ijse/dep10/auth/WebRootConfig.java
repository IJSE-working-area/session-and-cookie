package lk.ijse.dep10.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class WebRootConfig {
    @RequestScope//connection ekakata seema karanna
    @Bean
    public Connection connection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dep10_auth?createDatabaseIfNotExist=true",
                "root","Gaya/123&1994");

    }
}
