
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class webdriverdemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Puts an Implicit wait, Will wait for 10 seconds
        //before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch website
        driver.navigate().to("http://www.calculator.net/");
        //Maximize the browser

        driver.manage().window().maximize();
        //Click on Math Calculators
        driver.findElement(By.xpath("//*[text() = 'Math Calculators']")).click();
        //Click on Percent Calculators
        driver.findElement(By.xpath("//*[text()= 'Percentage Calculator']")).click();
        //Enter value 10 in the first number of the percent Calculator
        driver.findElement(By.id("cpar1")).sendKeys("10");

//Enter value 50 in the second number of the percent Calculator
        driver.findElement(By.id("cpar2")).sendKeys("50");
        //Click Calculate Button
        driver.findElement(By.xpath("//*[@value='1']/..//*[@value='Calculate']")).click();
        //Get the Result Text based on its xpath
        //*[@class="h2result"]
//String result =
//        driver.findElement(By.xpath(""//*[@class="h2result"])).

        String result = driver.findElement(By.className("h2result")).getText();
        System.out.println(result);
        driver.quit();
    }
}
