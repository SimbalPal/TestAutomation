package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static Properties prop;
	public static WebDriver driver;

	static {

		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java/resources/EnvironmentTest.properties");

			prop = new Properties();

			prop.load(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
@Before
	
	public void setup() {

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");

			driver = new ChromeDriver(options);

		} else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

	}

	@After
	public void tearDown(Scenario s) throws IOException {
		if (s.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("Screenshots/"+s.getName()+ ".png"));

		}

		driver.quit();
	}

	public void selectdropdownByText(WebElement ele, String value) {

		Select s = new Select(ele);

		s.selectByVisibleText(value);
	}

	public void selectdropdownbyindex(WebElement element, int number) {

		Select s = new Select(element);
		s.selectByIndex(number);

	}

	public void selectdropdownbyvalue(WebElement elem, String value) {

		Select s = new Select(elem);

		s.selectByValue(value);
	}

	public void mouseHover(WebElement ele) {

		Actions a = new Actions(driver);

		a.moveToElement(ele).build().perform();

	}

	public void waitforexpectedelementbyvisibility(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(23));

		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitforexpectedelementbyclick(WebDriver ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(23));

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ele")));

	}

	public void bootstrapdropdownvalueselect(List<WebElement> list, String Value) {

		for (WebElement e : list) {

			String value = e.getText();
			if (value.equals(Value)) {
				e.click();
				break;
			}
		}

	}

	public void javascriptclick(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click;", ele);

	}

	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			javascriptclick(ele);
		}

	}

	public void alertpopupaccept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public void alertpopupdismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

}
