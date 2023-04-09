import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Setting up chrome browser
        driver.get("https://opensource-demo.orangehrmlive.com/"); //opening URL
        //maximising window - username and password keys are not sending without this
        driver.manage().window().maximize();


        System.out.println("Title of the page is: " + driver.getTitle()); //getting title of the page and printing it
        System.out.println("Current URL is: " + driver.getCurrentUrl()); //getting current URL and printing it
        System.out.println("Page source is: " + driver.getPageSource()); //getting page source and printing it

        driver.findElement(By.name("username")).sendKeys("Admin"); //finding username field and entering username
        driver.findElement(By.name("password")).sendKeys("admin123"); //finding password field and entering password
        driver.close(); //closing driver
    }
}
