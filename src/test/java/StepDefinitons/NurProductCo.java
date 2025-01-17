package StepDefinitons;

import Pages.NurPOMPage;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class NurProductCo {
   NurPOMPage oc=new NurPOMPage();

   @And("I click on product compare link")
   public void iClickOnProductCompareLink() {
      oc.clickMethod(oc.getProductCompareLink());
   }

   @Then("user should see Product comparison page")
   public void userShouldSeeProductComparisonPage() {
      Assert.assertTrue(oc.getProductComparisonHeader().isDisplayed());
   }

   @And("I send a {string} to search")
   public void iSendAToSearch(String data) {
      oc.sendKeysMethod(oc.getSearchTextBox(),data);
   }

   @And("I click on the compare this product")
   public void iClickOnTheCompareThisProduct() {
      JavascriptExecutor js = (JavascriptExecutor)BasicDriver.getDriver();
      js.executeScript("window.scrollBy(0,300)");
      oc.clickMethod(oc.getCompareThisProductIcon());

   }

   @And("I click on the add to cart button")
   public void iClickOnTheAddToCartButton() {
      oc.clickMethod(oc.getAddToCartButton());
   }

   @And("I click on the shopping cart")
   public void iClickOnTheShoppingCart() {
      oc.clickMethod(oc.getShoppingCartButton());
   }

   @And("I click on the product comparison link in the success message")
   public void iClickOnTheProductComparisonLinkInTheSuccessMessage() throws InterruptedException {
      Thread.sleep(2000);
      oc.clickMethod(oc.getInTheSuccessMessageProductComparisonLink());
   }

   @Then("user should see the shopping cart")
   public void userShouldSeeTheShoppingCart() {
      Assert.assertTrue(oc.getItemInTheCart().isDisplayed());
   }

}
