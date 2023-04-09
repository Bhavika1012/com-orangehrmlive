import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Edge"; //Creating a static variable that will determine which browser the link will open
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; //storing URL in static variable
    static WebDriver driver; //storing the browser WebDriver in "driver"

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) { //setting up chrome driver
            driver = new ChromeDriver(); //open the link in chrome
        } else if (browser.equalsIgnoreCase("Firefox")) {//setting up firefox driver
            driver = new FirefoxDriver(); //open the link in firefox
        } else if (browser.equalsIgnoreCase("Edge")) { //setting up edge driver
            driver = new EdgeDriver(); //open the link in Edge
        } else {
            System.out.println("Invalid browser"); //if neither then print this statement
        }
        driver.get(baseUrl); //opening browser

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
