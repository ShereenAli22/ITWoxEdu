package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisteration extends PageBase {

	public UserRegisteration(WebDriver driver) {
		super(driver);
		
	}
	

  
  @FindBy(id="Email")
  WebElement EmailAddress;
  
  @FindBy(id="inputPassword")
  WebElement Password; 
  @FindBy(id="btnLogin")
  WebElement RegisterButton;


  
  public void userRegisteration(String Email, String password ) {


	  setTextElementText ( EmailAddress ,  Email);
	  setTextElementText ( Password ,  password);
	
	  

	  ClickButton(RegisterButton);
	  
	  
	  
  }
	
	
	
}
