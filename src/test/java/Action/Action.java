package Action;


import DriverSettings.DriverSettings;
import PageObjects.PageObjects;
import org.junit.Before;
import org.junit.Test;

public class Action extends DriverSettings {

    PageObjects page2;

    @Before
    public void log_in(){
        page2 = new PageObjects(driver);
    }

    @Test
    public void login(){
        page2.loginButton();
        page2.continueButton();
        page2.firstName();
        page2.secondName();
        page2.email();
        page2.telephone();
        page2.password();
        page2.confirmPassword();
        page2.newsletterConfirm();
        page2.agreementCheckbox();
        page2.agreementCheck();
        page2.accountCreated();

    }


}
