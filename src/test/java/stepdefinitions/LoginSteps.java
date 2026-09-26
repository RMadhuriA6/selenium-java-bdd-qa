package stepdefinitions;

import com.example.fun.LoginPage;
import com.example.fun.Page;
import com.example.fun.ShopPage;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginSteps {

    LoginPage rahulShettyLogin;
    Page result;


    @Given("the user is in login page")
    public void theUserIsInLoginPage() {
        rahulShettyLogin = new LoginPage(Hooks.driver);
        rahulShettyLogin.openPage("https://rahulshettyacademy.com/loginpagePractise/");
    }


    @When("the user logs in with valid credentials")
    public void theUserLogsInWithValidCredentials() {
        result = rahulShettyLogin.loginWith("rahulshettyacademy", "Learning@830$3mK2");
    }

    @Then("the user should land on Shop Page")
    public void theUserShouldLandOnShopPage() {
        if (result instanceof ShopPage rahulShettyShop) {
            System.out.println(rahulShettyShop.ShopPageTitle());
        } else {
            Assert.fail();
        }

    }

    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithInvalidCredentials(String username, String password) {
        result = rahulShettyLogin.loginWith(username, password);
    }
    @Then("the user should be on Login page")
    public void theUserShouldBeOnLoginPage() {

        if (result instanceof LoginPage resultedLoginPage) {
                System.out.println(resultedLoginPage.readErrorMessage());
        } else {
                Assert.fail();
        }
    }
}