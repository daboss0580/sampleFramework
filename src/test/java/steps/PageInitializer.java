package steps;


import pages.*;

public class PageInitializer {

    public static LoginPage loginPage;



   public static void initializePageObjects(){
       loginPage = new LoginPage();
   }
}
