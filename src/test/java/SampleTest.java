import org.example.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    private WebDriver driver;

    @BeforeEach
    public  void setUp(){
        driver = WebDriverConfig.getDriver();
        driver.get("https://bugbank.netlify.app/");
    }
    @Test
    public void testPageTitle(){
        String pageTitle = driver.getTitle();
        assertEquals("bugbank", pageTitle);
    }
    @AfterEach
    public void tearDown(){
        WebDriverConfig.quitDriver();
    }
}
