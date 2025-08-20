import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

class BaseTest {
            public static WebDriver driver;
            public static Properties prop;

            public void loadConfig() {
                try {
                    prop = new Properties();
                    FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
                    prop.load(fis);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void initBrowser() {
                loadConfig();
                if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                    driver = new ChromeDriver();
                }
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

            public void tearDown() {
                if (driver != null) {
                    driver.quit();
                }
            }
        }
