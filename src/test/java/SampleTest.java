import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class SampleTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Configura o WebDriverManager para o ChromeDriver
        driver = new ChromeDriver(); // Inicializa o ChromeDriver
    }

    @Test
    public void testOpenGoogle() {
        driver.get("https://www.google.com"); // Abre a página do Google
        // Exibe o título da página no console
        System.out.println("Page Title: " + driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Encerra o navegador
        }
    }
}
