package Pages;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Link Size: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			URL link = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			httpConn.connect();

			int code = httpConn.getResponseCode();

			if (code >= 400) {
				System.out.println("Broken Link: " + url);
			} else {
				System.out.println("Valid Link: " + url);
			}
		}

		System.out.println();
		System.out.println("All Links Checked");

		// Closing The Driver
		// driver.quit();
	}
}
