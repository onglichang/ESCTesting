import org.openqa.selenium.By;

public class testForProj2 {
	
	public static void main(String[] args) throws InterruptedException {		


		System.setProperty("webdriver.chrome.driver","/Users/lichang/Downloads/seleniumStuff/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://192.168.64.2/myproject/ESC/BSOS_Cus.html?support_type=Payment&add_info=Option+3+is+abcde&cust_name=booobbbbbbbbb");
		
		// get all the links
		java.util.List<WebElement> links = driver.findElements(By.className("option1"));
		System.out.println(links.size());
				
		// print all the links
		for (int i = 0; i < links.size(); i=i+1) {
			System.out.println(i + " " + links.get(i).getText());
			
		}
		
		
		///First SkillTag Test////
		
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='add_info']"));
		
		Select dropdown = new Select(dropdownElement);
		
		for (int i=1;i<=2;i++) {
		dropdown.selectByIndex(i);}
		
		Thread.sleep(3000);
		
		WebElement customerName = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName.sendKeys("mary sim");
		
		
		driver.findElement(By.id("submitButton")).submit();
		
		
		
		Thread.sleep(3000);
		
		
		
		
		
		System.out.println("First SkillTag Test");
		
		//Second SkillTag Test////
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);

		
		
		WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@id='add_info1']"));
		
		Thread.sleep(3000);
		
		WebElement customerName1 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName1.sendKeys("bob sim");
		
		Select dropdown1 = new Select(dropdownElement2);
		
		for (int i=1;i<=2;i++) {
		dropdown1.selectByIndex(i);}
		
		System.out.println("Second SkillTag Test");
		
		driver.findElement(By.id("submitButton1")).submit();
		
		Thread.sleep(3000);
		
		
		
		//Third SkillTag Test////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement3 = driver.findElement(By.xpath("//select[@id='add_info2']"));
		
		Thread.sleep(3000);
		
		WebElement customerName3 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName3.sendKeys("Sim Mary");
		
		Select dropdown2 = new Select(dropdownElement3);
		
		for (int i=1;i<=2;i++) {
		dropdown2.selectByIndex(i);}
		System.out.println("Third SkillTag Test");
		
		driver.findElement(By.id("submitButton2")).submit();
		
		Thread.sleep(1000);
		
		//////Fourth SkillTag Test//////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement4 = driver.findElement(By.xpath("//select[@id='add_info3']"));
		
Thread.sleep(3000);
		
		WebElement customerName4 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName4.sendKeys("Sim Bob");
		
		Select dropdown3 = new Select(dropdownElement4);
		
		for (int i=1;i<=2;i++) {
		dropdown3.selectByIndex(i);}
		System.out.println("Fourth SkillTag Test");
		
		driver.findElement(By.id("submitButton3")).submit();
		
		Thread.sleep(1000);
		
		
	//////Fifth SkillTag Test//////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement5 = driver.findElement(By.xpath("//select[@id='add_info4']"));
		
Thread.sleep(3000);
		
		WebElement customerName5 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName5.sendKeys("Simlee Mary");
		
		Select dropdown4 = new Select(dropdownElement5);
		
		for (int i=1;i<=2;i++) {
		dropdown4.selectByIndex(i);}
		System.out.println("Fifth SkillTag Test");
		
		driver.findElement(By.id("submitButton4")).submit();
		
		Thread.sleep(1000);
		
		/////////Sixth SkillTag Test//////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement6 = driver.findElement(By.xpath("//select[@id='add_info5']"));
		
		Thread.sleep(3000);
		
		WebElement customerName6 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName6.sendKeys("Simly bob");
		
		Select dropdown5 = new Select(dropdownElement6);
		
		for (int i=1;i<=2;i++) {
		dropdown5.selectByIndex(i);}
		System.out.println("Sixth SkillTag Test");
		
		driver.findElement(By.id("submitButton5")).submit();
		
		Thread.sleep(1000);
		
		/////////Sixth SkillTag Test//////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement7 = driver.findElement(By.xpath("//select[@id='add_info6']"));
		
Thread.sleep(3000);
		
		WebElement customerName7 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName7.sendKeys("mary simlee2");
		
		Select dropdown6 = new Select(dropdownElement7);
		
		for (int i=1;i<=2;i++) {
		dropdown6.selectByIndex(i);}
		System.out.println("Seventh SkillTag Test");
		
		driver.findElement(By.id("submitButton6")).submit();
		
		Thread.sleep(1000);
		
		/////////Eighth SkillTag Test//////
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		WebElement dropdownElement8 = driver.findElement(By.xpath("//select[@id='add_info7']"));
		
Thread.sleep(3000);
		
		WebElement customerName8 = driver.findElement(By.id("cust_name"));
		
		Thread.sleep(3000);
		
		customerName8.sendKeys("marymarymary");
		
		Select dropdown7 = new Select(dropdownElement8);
		
		for (int i=1;i<=2;i++) {
		dropdown7.selectByIndex(i);}
		System.out.println("Eigth SkillTag Test");
		
		driver.findElement(By.id("submitButton7")).submit();
		
		Thread.sleep(1000);
		

		
		
		
		
		
		
		// maximize the browser window
//		driver.manage().window().maximize();
//		
//		// click all links in a web page
//		for(int i = 0; i < links.size(); i++)
//		{
//			System.out.println("*** Navigating to" + " " + links.get(i).getAttribute("href"));
//			//if (links.get(i).getAttribute("href") == null || 
//			//		links.get(i).getAttribute("href").equals("https://sudiptac.bitbucket.io"))
//			if (links.get(i).getAttribute("href") == null)
//				continue;
//			boolean staleElementLoaded = true;
//			//the loop checks whether the elements is properly loaded
//			while(staleElementLoaded) {
//				try {
//					//navigate to the link
//					driver.navigate().to(links.get(i).getAttribute("href"));
//					Thread.sleep(3000);
//					//click the back button in browser
//					driver.navigate().back();
//					links = driver.findElements(By.tagName("a"));
//					System.out.println("*** Navigated to" + " " + links.get(i).getAttribute("href"));
//					staleElementLoaded = false;
//				} catch (StaleElementReferenceException e) {
//					staleElementLoaded = true;
//				}
//			}
//		}
	}

}