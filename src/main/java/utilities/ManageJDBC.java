package utilities;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import extentions.DBActions;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class ManageJDBC extends BasePage{

   @Step("Read Rows From DB")
    public static void readFromDB(){
        int count=0;
        while (count<3) {
               try {
                   rs.next();
                   myName = rs.getString(2);
                   myEmail = rs.getString(3);
                   myUserName = rs.getString(4);
                   myPassword = rs.getString(5);
                   DBActions.createNewUserDB(myName, myEmail, myUserName, myPassword);
                   System.out.println(myName);
                   System.out.println(myEmail);
                   System.out.println(myUserName);
                   System.out.println(myPassword);
                   Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
                   count++;
               } catch (SQLException e) {
                   e.printStackTrace();
               }

           }
   }
}
