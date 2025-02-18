package LearningPathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
    public void testLogin() {
	
	     WebDriver driver=new EdgeDriver();
        // Step 1: Navigate to the login page
        driver.get("https://genailabs-frontend-dev.azurewebsites.net/#/signin");

        // Step 2: Locate email and password input fields
        WebElement emailField = driver.findElement(By.id("email")); 
        WebElement passwordField = driver.findElement(By.id("password")); 

        // Step 3: Enter test credentials
        String email = "raj@kloudstac.com";  
        String password = "rajP@ssw0rd2024!";       
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

        // Step 4: Click the SIGN IN button
        WebElement signInButton = driver.findElement(By.xpath("//button[text()=Sign In]")); 
        signInButton.click();
	}
}
