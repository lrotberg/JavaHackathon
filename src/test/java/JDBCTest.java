import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.JDBC;

import java.sql.SQLException;

public class JDBCTest extends CommonOps {
    @Test
    @Description("JDBC")
    public void testJDBC() throws SQLException {
        JDBC.jdbc();
    }
}
