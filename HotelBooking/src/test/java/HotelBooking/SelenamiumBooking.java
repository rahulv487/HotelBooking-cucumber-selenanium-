package HotelBooking;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.Alert;

public class SelenamiumBooking {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("file://D://hotel%20booking/hotelBooking/hotelbooking.html");

String title=driver.getTitle();

System.out.println("The title of page id :" + title);
driver.findElement(By.name("txtFN")).sendKeys("");
Thread.sleep(5000);
driver.findElement(By.id("btnPayment")).click();

Thread.sleep(3000);
//driver.findElement(By.className("btn")).click();
driver.switchTo().alert();
Thread.sleep(3000);
System.out.println("Password entered is incorrect");
driver.switchTo().alert().accept();
//javascriptAlert.dismiss();

/*driver.findElement(By.name("txtFN")).sendKeys("");
Thread.sleep(5000);
driver.findElement(By.id("btnPayment")).click();

Thread.sleep(3000);
//driver.findElement(By.className("btn")).click();
driver.switchTo().alert();
Thread.sleep(3000);
System.out.println("Password entered is incorrect");
driver.switchTo().alert().accept();*/



/*driver.switchTo().alert();
Thread.sleep(3000);
System.out.println("ABD");
driver.switchTo().alert().accept();*/

driver.findElement(By.name("txtFN")).sendKeys("Rahul");

driver.findElement(By.name("txtLN")).sendKeys("");
driver.findElement(By.id("btnPayment")).click();
driver.switchTo().alert();
System.out.println("Please enter valid name");
driver.switchTo().alert().accept();

driver.findElement(By.name("txtLN")).sendKeys("Verma");

driver.findElement(By.name("Email")).sendKeys("");
driver.findElement(By.id("btnPayment")).click();
driver.switchTo().alert();
System.out.println("Please enter valid email");
driver.switchTo().alert().accept();

driver.findElement(By.name("Email")).sendKeys("rahul@capg.com");


	}

}
