package SelenFacebk;

import org.openqa.selenium.WebDriver;

public class verifyTitle{
public static void verifyTitle(WebDriver driver,CharSequence searchTerm){
	String actual=driver.getTitle();
	if(actual.contains(searchTerm+"|Etsy")) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
		System.out.println("Expected: "+searchTerm);
		System.out.println("Actual: "+actual);
		System.out.println("done with git");
	}
}
}
