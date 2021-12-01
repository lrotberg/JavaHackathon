import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.ManageJDBC;

import java.sql.SQLException;

public class JDBCTests extends CommonOps {

    @Test
    @Description("JDBC")
    public void testJDBC() throws SQLException {
        ManageJDBC.jdbc();
    }

}
