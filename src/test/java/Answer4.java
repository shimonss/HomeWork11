
import jdk.internal.org.objectweb.asm.ClassReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Answer4 {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("WebDriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
    }

    @Test
    public void test01_alert() {
        driver.findElement(By.id("MyAlert")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public void test02_prompt() {
        driver.findElement(By.id("MyPrompt")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Shimon");
        prompt.accept();
        String output = "Shimon";
        assertEquals(output, driver.findElement(By.id("output")).getText());
    }

    @Test
    public void test03_confirm() {
        driver.findElement(By.id("MyConfirm")).click();
        Alert ConfirmBox = driver.switchTo().alert();
        String output = "Confirmed";
        assertEquals(output, driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("MyConfirm")).click();
    }

    @Test
public void test04_tab() {
        System.out.println("SwitchingToIframe...");
        driver.switchTo().frame("openNewTab");
        driver.findElement(By.id("Tab_alert")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void test05_window() {
        System.out.println("switching back...");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("newWindow")).click();
        driver.switchTo().alert().accept();
    }
    }




