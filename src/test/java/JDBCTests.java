import io.qameta.allure.Description;
import org.testng.annotations.Test;
import utilities.CommonOps;
import utilities.ManageJDBC;

public class JDBCTests extends CommonOps {

    @Test
    @Description("JDBC")
    public void testJDBC() {
        ManageJDBC.readFromDB();
    }

}
