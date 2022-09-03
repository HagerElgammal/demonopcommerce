package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;


public class D02_loginStepDef {

    P02_login login = new P02_login();


    @Given ("user go to login page")
    public void loginPage(){login.loginLink().click();}

    @When ("user login with \"(.*)\" and \"(.*)\"$")
    public void loginData(String email, String password){
        login.LoginSteps( email, password);
    }

    @Then ("user press on login button")
    public void loginButton(){ login.loginButtonPOM().click();}

    @And ("user login to the system successfully")
    public void loginSuccess(){}


    @And("user could not login to the system")
    public void loginNotSuccess(){}


}
