package utilities;

import extentions.UIActions;
import io.qameta.allure.Step;
import extentions.DBActions;
import pages.webPages.AddNewUserDetailsPage;

import java.sql.SQLException;

public class JDBC extends BasePage{

   @Step("Read Rows From DB")
    public static void readFromDB() throws SQLException, InterruptedException {

           while (rs.next()){
               try {
                   myName=rs.getString(2);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
               try {
                   myEmail=rs.getString(3);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
               try {
                   myUserName=rs.getString(4);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
               try {
                   myPassword=rs.getString(5);
               } catch (SQLException e) {
                   e.printStackTrace();
               }
               DBActions.createNewUserDB(myName,myEmail,myUserName,myPassword);
               System.out.println(myName);
               System.out.println(myEmail);
               System.out.println(myUserName);
               System.out.println(myPassword);
               Thread.sleep(3000);
               UIActions.click(AddNewUserDetailsPage.getCreateUserBtn()); //הוא עושה אחרי ההוספה של הבן אדם השלישי לחיצה נוספת ונופל..
           }
   }

}
