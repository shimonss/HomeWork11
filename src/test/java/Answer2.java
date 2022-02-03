import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import jdk.internal.logger.BootstrapLogger;
import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Answer2 {
    private static ChromeDriver driver;

    private static class ChromeDriver {
        private static ExtentReports extent;
        private static ExtentTest test;

        @BeforeClass
        public static void beforeAll() {
            ExtentReports extent = new ExtentReports();
            String cwd = System.getProperty("user.dir");
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter(cwd + "//extent.html");
            extent.attachReporter(htmlReporter);
            ExtentTest test = extent.createTest("MyAnswer2", "SampleDescription");
            test.log(Status.INFO, "@Before class");
            extent.setSystemInfo("company", "experts");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        private Object manage() {
            return null;
        }


        private static String takeScreenShot(String imagesPath, Object FIlE, File ImagesPath, DocFile FileUtils) {
            TakesScreenShot takesScreenShot = (TakesScreenShot) driver;
            Object OutputType;
            File screenShotFile = takesScreenShot.getScreenShotAs(FIlE);
            File destinationFile = new File(ImagesPath+ ".png");
            try {
                FileUtils.copyFile(screenShotFile, destinationFile);
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }

            return ImagesPath + ".png";



        }

        public void get(String s) {

        }

        public HTMLInputElement findElement(Object source) {
            return null;
        }

        public void quit() {

        }


        private static class FIlE {
        }

        private static class TakesScreenShot {
            public File getScreenShotAs(Object fIlE) {
                return null;
            }
        }
    }
    @Test
    public void test02_ClickTestArea() {
        driver.get("https://translate.google.com/");
        driver.findElement(By.id("source")).click();
        BootstrapLogger test = null;
        test.log(Status.INFO, "Translate word");
    }

    private void get(String s) {

    }

    @AfterClass
    public static void afterClass() throws IOException {
        driver.quit();
        BufferedOutputStream extent = null;
        extent.flush();







    }

    private void quit() {

    }

    private HTMLInputElement findElement(Object source) {
        return null;
    }


    private static ExtentTest test;
}


