package utilities;
//import com.team11.pages.LandingPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class MyMethods {
    /* public static void login(){
         LandingPage landingPage = new LandingPage();
         landingPage.clickAccntMenu();
         landingPage.clickTo("Sign in");
         landingPage.username.sendKeys(ConfigurationReader.getProperty("EmployeeUsername"));
         landingPage.password.sendKeys(ConfigurationReader.getProperty("EmployeePassword"));
         landingPage.submit.click();
     }*/
    public static void getDefaultMessage(String message){
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + message + "')]"));
        String actual = element.getText();
        System.out.println(actual);
        Assert.assertTrue("message is not displayed ",actual.contains(message));
    }
    public static void fillBoxes(String input, String info){
        WebElement element = Driver.getDriver().findElement(By.xpath("//input[@id='" + input + "']"));
        element.clear();
        Driver.waitForVisibility(element,3).sendKeys(info);
        Driver.wait(2);
        System.out.println(info+" Entered to=====>> "+input);
    }
    public static void selectDropDown(String dropdown){
        WebElement element = Driver.getDriver().findElement(By.xpath("//select[@id='" + dropdown + "']"));
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement each : options){
            System.out.println(each.getText());
        }
    }

    public static String getColor(WebElement element, String cssValue) {
        String color = element.getCssValue(cssValue); // RGB
        String hex = "";
        int r, g, b = 0;
        if (color.contains("rgba")) {
            String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
            r = Integer.parseInt(numbers[0].trim());
            g = Integer.parseInt(numbers[1].trim());
            b = Integer.parseInt(numbers[2].trim());
            hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        } else {
            String[] numbers = color.replace("rgb(", "").replace(")", "").split(",");
            r = Integer.parseInt(numbers[0].trim());
            g = Integer.parseInt(numbers[1].trim());
            b = Integer.parseInt(numbers[2].trim());
            hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
        }
        return hex;
    }
//end
}