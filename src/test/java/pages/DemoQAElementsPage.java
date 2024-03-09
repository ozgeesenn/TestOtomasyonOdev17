package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.assertj.core.api.Assertions.assertThat;

public class DemoQAElementsPage extends BasePage{

    //ODEV 1 ADIM 1

    public SelenideElement btnButtons = $(".collapse.element-list.show > .menu-list > li:nth-of-type(5) > .text");
    public SelenideElement btnclickMe = $("[class] [class='mt-4']:nth-child(4) .btn-primary");
    public SelenideElement textMessage= $("p#dynamicClickMessage");

    //ODEV 1 ADIM 2

    public SelenideElement btnWebTables= $(".show .btn-light:nth-of-type(4) .text");
    public SelenideElement btnAdd= $("button#addNewRecordButton");
    public SelenideElement firstName= $("input#firstName");
    public SelenideElement lastName=$("input#lastName");
    public SelenideElement email=$("input#userEmail");
    public SelenideElement age=$("input#age");
    public SelenideElement salary=$("input#salary");
    public SelenideElement department=$("input#department");
    public SelenideElement btnSubmit=$("button#submit");

    public DemoQAElementsPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickButtonsBtn()
    {
        btnButtons.click();
    }

    public void clickClickMeBtn()
    {
        btnclickMe.click();
    }

    public void verifyTextMessage()
    {
        String textMessage1 = textMessage.getText();
        assertThat(textMessage1).isEqualTo("You have done a dynamic click");
    }

    public void clickWebTablesBtn()
    {
        btnWebTables.click();
    }

    public void clickAddBtn()
    {
        btnAdd.click();
    }

    public void fillFirstName(String name)
    {
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void fillLastName(String lastname)
    {
        lastName.clear();
        lastName.sendKeys(lastname);
    }

    public void fillEmail(String Email) {
        email.clear();
        email.sendKeys(Email);
    }

    public void fillAge(String Age) {
        age.clear();
        age.sendKeys(Age);
    }

    public void fillSalary(String Salary) {
        salary.clear();
        salary.sendKeys(Salary);
    }

    public void fillDepartment(String Department) {
        department.clear();
        department.sendKeys(Department);
    }

    public void clickSubmit(){
        btnSubmit.click();
    }


    public void findEntry(String text) {

        ElementsCollection tableElements = $$(".rt-table .rt-tbody [role='row'] .rt-td:nth-of-type(4)");

        for(int i=0; i< tableElements.size();i++){

            if (tableElements.get(i).getText().equalsIgnoreCase(text)){
                $("#edit-record-" + (i + 1)).click();
                break;
            }
        }
    }



}
