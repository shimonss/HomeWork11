import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Answer3<doc> {
   @Test
    public void test03(InternetExplorerDriver driver) throws Exception {
        String Type = getData("browserType");
        String type = null;
        if (type.equals("Chrome")) {
            driver = new CheomeDriver();
        } else if (type.equals("IE")) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get("http://www.ftv.com");
    }

    public static String getData(String URL) throws Exception {
        String xmlFilePath = null;
        File fxmlFile = new File(xmlFilePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = (Document) dBuilder.parse(fxmlFile);
        return URL;
    }
}


        








