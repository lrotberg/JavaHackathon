package utilities;

import io.qameta.allure.Step;

import java.sql.SQLException;

public class ManageJDBC extends BasePage{

   @Step("JDBC")
    public static void jdbc() throws SQLException {
       while(rs.next()){
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
       }
       System.out.println(myName);
       System.out.println(myEmail);
       System.out.println(myUserName);
       System.out.println(myPassword);
   }

}
