package steps;


import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;



   public static void initializePageObjects(){
       loginPage = new LoginPage();
       dashboardPage = new DashboardPage();
   }
}
