package Punam;

public class SystemProperties {
	public static void main(String[] args) {
		setProp();
	}
	
	public static void setProp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	}
}
