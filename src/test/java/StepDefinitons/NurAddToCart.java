package StepDefinitons;

import Pages.NurPOMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NurAddToCart {
    NurPOMPage oc=new NurPOMPage();
    @And("I click on the shopping cart link in the success message")
    public void iClickOnTheShoppingCartLinkInTheSuccessMessage() {
        oc.clickMethod(oc.getShoppingCartLink());
    }

    @Then("user should see the success message and the product displayed in the shopping cart")
    public void userShouldSeeTheSuccessMessageAndTheProductDisplayedInTheShoppingCart() {

        Assert.assertTrue(oc.getProductInTheCart().isDisplayed());
    }

    @And("I click on product compare link in this field")
    public void iClickOnProductCompareLinkInThisField() {
        oc.clickMethod(oc.getProductCompareLink());
    }

    @And("I click on the add to cart button under product")
    public void iClickOnTheAddToCartButtonUnderProduct() {
        oc.clickMethod(oc.getAddToCartB());
    }

    @And("user should see success message")
    public void userShouldSeeSuccessMessage() {
        Assert.assertTrue(oc.getSuccessMessageForAddToProduct().isDisplayed());
    }
}
