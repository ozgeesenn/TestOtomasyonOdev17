package steps;

import common.Context;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Odev17Steps extends BaseTest{

    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @Given("^Open the web site$")
    public void openPage() {
        pageManager.elementsPage.open();
    }

    @And("Press : DemoQA : Buttons butonuna tiklanilir")
    public void clickButtons() {
       pageManager.elementsPage.clickButtonsBtn();
    }

    @And("Press : DemoQA : ClickMe butonuna tiklanilir")
    public void clickClickMe() {
        pageManager.elementsPage.clickClickMeBtn();
    }

    @Then("Verify : Ekranda gorunen text mesajinin kontrolu yapilir")
    public void verifyEkrandaGorulenMesaj() {
        pageManager.elementsPage.verifyTextMessage();
    }

    @And("Press : DemoQA : WebTables butonuna tiklanilir")
    public void clickWebTables() {
        pageManager.elementsPage.clickWebTablesBtn();
    }

    @And("Press : DemoQA : Add butonuna tiklanilir")
    public void clickAdd() {
        pageManager.elementsPage.clickAddBtn();
    }

    @And("Fill in : DemoQA : First Name {string}")
    public void fillFirstName(String firstName) {
        pageManager.elementsPage.fillFirstName(firstName);
    }

    @And("Fill in : DemoQA : Last Name {string}")
    public void fillLastName(String lastName) {
        pageManager.elementsPage.fillLastName(lastName);
    }

    @And("Fill in : DemoQA : Email {string}")
    public void fillEmail(String Email) {
        pageManager.elementsPage.fillEmail(Email);
    }

    @And("Fill in : DemoQA : Age {string}")
    public void fillAge(String age) {
        pageManager.elementsPage.fillAge(age);
    }

    @And("Fill in : DemoQA : Salary {string}")
    public void fillSalary(String salary2) {
        pageManager.elementsPage.fillSalary(salary2);
    }

    @And("Fill in : DemoQA : Department {string}")
    public void fillDepartment(String department) {
        pageManager.elementsPage.fillDepartment(department);
    }

    @And("Press : DemoQA : Submit butonuna tiklanilir")
    public void clickSubmit() {
        pageManager.elementsPage.clickSubmit();
    }

    @And("Press : DemoQA : Emaili {string} olan kaydin duzenle butonuna tiklanilir")
    public void editAddedRecord(String mail) {
        pageManager.elementsPage.findEntry(mail);
    }

}
