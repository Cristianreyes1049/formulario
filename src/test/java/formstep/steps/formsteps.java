package formstep.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pruebagoogle.pages.Homepage;
//import pruebagoogle.pages.ResultpageConsult;
//import pruebagoogle.pages.ResultpageGoogle;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


public class formsteps {

    WebDriver driver = new ChromeDriver();
    Homepage inHomePage = new Homepage(driver);
    //ResultpageGoogle inResultPage = new ResultpageGoogle(driver);
    //ResultpageConsult thePageConsult = new ResultpageConsult(driver);


    @Given("I’m on the homepage")
    public void imOnTheHomepage() {
        driver.get("https://forms.zohopublic.com/gustva/form/JobApplicationForm/formperma/KD0mDC22Jh01F2d8Fk6G42EF7");
    }

    @When("I type “(.*)” into the first name")
    public void iTypeTheName(String text) {
        inHomePage.insertName(text);
    }


    @And("I type “(.*)” into the last name")
    public void iInsertLastName(String text2) {
        inHomePage.insertLastName(text2);
    }

    @And("I select Country “(.*)” in field")
    public void selectCountry(String text3) {
    inHomePage.country(text3);
       }


    @And("type in birthday “(.*)” in field")
    public void birthdayField(String dateTime) {
        inHomePage.birthDate(dateTime);
    }

    @And("marital put “(.*)” status")
    public void maritalStatusSingle(String text4) {
        inHomePage.marital(text4);
    }


    @And ("gender “(.*)”")
    public void gender(String gender)
    {
        inHomePage.gender(gender);

    }


    @And("^education “(.*)”$")
    public void educationPostGraduate(String text5) {
        // Write code here that turns the phrase above into concrete actions
        inHomePage.education(text5);
    }

    @And("^reference1 “(.*)” and “(.*)” and email “(.*)”$")
    public void referenceCamiloAndArjonaAndEmailColombiaGmailCom(String text6, String text7, String text8){
        inHomePage.reference1(text6, text7, text8);
    }

    @And("reference2 “(.*)” and “(.*)” and email “(.*)”")
    public void reference2(String text6, String text7, String text8){
        inHomePage.reference2(text6, text7, text8);
    }


    @Then("^I go to the Apply$")
    public void iGoToTheApply() {
        // Write code here that turns the phrase above into concrete actions
        inHomePage.PendingException();
    }

    @When("^I click on the Apply$")
    public void iClickOnTheApply() {
        // Write code here that turns the phrase above into concrete actions
        inHomePage.clickApply();
    }

    @Then("^check out form successful$")
    public void checkOutFormSuccessful() {
        // Write code here that turns the phrase above into concrete actions
        inHomePage.PendingException();
    }


}
