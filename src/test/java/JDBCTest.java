import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.webPages.HomePage;
import utilities.CommonOps;
import utilities.JDBC;
import workflows.WebFlows;

import java.sql.SQLException;

public class JDBCTest extends CommonOps {
    @Test
    @Description("JDBC")
    public void JDBCTest() throws SQLException {
        JDBC.jdbc();
    }
}
