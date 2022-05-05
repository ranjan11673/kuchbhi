package YE;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WO {

	public static void main(String[] args) {
     
		System.out.println("I will get a job of 12 lakh pakage");
		
            System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://www.facebook.com");
	}

}
