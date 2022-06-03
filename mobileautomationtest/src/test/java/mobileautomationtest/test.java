package mobileautomationtest;



import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class test {

	static AndroidDriver driver;


	public static void main(String[] args) {
		try {
			openDigibox();
		}catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

	public static void openDigibox() throws Exception{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Pixel_2_API_30");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath );
		cap.setCapability("app",projectPath+"/src/test/java/mobileautomationtest/digiboxx.apk");
		cap.setCapability("appPackage","com.liqvd.digibox.test");
		cap.setCapability("autoGrantPermissions",true);
		URL url =new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Application started....");
	}

        public void login() throws InterruptedException {
		driver.findElement(By.id("com.liqvd.digibox.test:id/btnSkipIntroSlideOne")).click();
		driver.findElement(By.id("com.liqvd.digibox.test:id/edtDigiSpaceName")).sendKeys("mozark10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Username/Email']")).sendKeys("mozark10251093@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Gaurav@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sign In']")).click();
		Thread.sleep(2000);
	}
		
//		public void createFolder() throws InterruptedException {
//		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.EditText")).sendKeys("po");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button")).click();
//		Thread.sleep(2000);
//		}
//		public void uploadFiles() throws InterruptedException {
//		driver.findElement(By.id("com.liqvd.digibox.test:id/cvFolder")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("com.liqvd.digibox.test:id/llUploadFileFolders")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")).click();
//		
//	}
		public void applyFilter() throws InterruptedException {
			driver.findElement(By.id("com.liqvd.digibox.test:id/ivFilter")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.liqvd.digibox.test:id/rbZtoA")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.liqvd.digibox.test:id/rbDateToday")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.liqvd.digibox.test:id/rbSize10to100")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.liqvd.digibox.test:id/btnApply")).click();
			Thread.sleep(2000);
		
		}
		
	
		
	

}




