package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="ProvarDemo1"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(linkText = "New")
	public WebElement new_;
	@TextType()
	@FindByLabel(label = "First Name")
	public WebElement firstName;
	@TextType()
	@FindByLabel(label = "Last Name")
	public WebElement lastName;
	@TextType()
	@FindByLabel(label = "Account Name")
	public WebElement accountName;
	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//ui:button[@press= 'c.press']")
	public WebElement save;
	@TextType()
	@FindByLabel(label = "Last Name")
	public WebElement lastName1;
			
}
