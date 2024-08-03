package FitpeoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RevenueCalculatorPage extends BasePage {
    @FindBy(xpath = "//div[text()='Revenue Calculator']")
    protected WebElement RevenueCalculatorPage;

    @FindBy(xpath = "//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p']")
    protected WebElement RevenueCalculatorSlider;
    

    @FindBy(id = ":r0:")
    protected WebElement RevenueTextField;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    protected WebElement CPT99091;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    protected WebElement CPT99453;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    protected WebElement CPT99454;

    @FindBy(xpath = "(//input[@type='checkbox'])[8]")
    protected WebElement CPT99474;
    
    @FindBy(xpath = "(//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-1lnu3ao']"
    		+ "//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk']//p)[4]")
    protected WebElement TotalRecurringReimbursement;

    public RevenueCalculatorPage(WebDriver driver) {
        super(driver);
    }

    public RevenueCalculatorPage clickOnRevenueCalculatorPage() {
        waiter.until(ExpectedConditions.visibilityOf(RevenueCalculatorPage)).click();
        return this;
    }

    public RevenueCalculatorPage scrollToVisibilityOfSlider() {
        waiter.until(ExpectedConditions.visibilityOf(RevenueCalculatorSlider));
        int yOffset = RevenueCalculatorSlider.getLocation().getY();
        int headerHeight = 150; 
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0] - arguments[1]);", yOffset, headerHeight);
        return this;
    }

    public RevenueCalculatorPage adjustTheSliderToExactValue(int targetValue) {
        waiter.until(ExpectedConditions.visibilityOf(RevenueCalculatorSlider));
        int sliderWidth = RevenueCalculatorSlider.getSize().getWidth();
        int minValue = 0; 
        int maxValue = 2000; 
        int currentValue = Integer.parseInt(RevenueTextField.getAttribute("value")); 
        int offset = (int) (((double)(targetValue - currentValue) / (maxValue - minValue)) * sliderWidth);
        Actions move = new Actions(driver);
        move.dragAndDropBy(RevenueCalculatorSlider, offset, 0).perform();
        return this;
    }
    public RevenueCalculatorPage enterInput(int input) {
        WebElement revenueField = waiter.until(ExpectedConditions.visibilityOf(RevenueTextField));
        revenueField.click();
        revenueField.sendKeys(Keys.CONTROL + "a");
        revenueField.sendKeys(Keys.DELETE);
        waiter.until(ExpectedConditions.attributeToBe(RevenueTextField, "value", ""));
        revenueField.sendKeys(String.valueOf(input));
        return this;
    }
    
    public RevenueCalculatorPage clickOnCPT99091() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CPT99091);
            System.out.println("Scrolled to the checkbox.");
            if (waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]"))) != null) {
                System.out.println("Checkbox is present in the DOM.");
            } else {
                System.out.println("Checkbox is NOT present in the DOM.");
            }
            try {
                waiter.until(ExpectedConditions.visibilityOf(CPT99091));
                System.out.println("Checkbox is visible.");
            } catch (Exception e) {
                System.out.println("Checkbox is NOT visible. Attempting JavaScript click.");
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CPT99091);
            System.out.println("Checkbox clicked via JavaScript.");
        } catch (Exception e) {
            System.out.println("Failed to click on the checkbox: " + e.getMessage());
            String domState = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML;");
            System.out.println("DOM State: " + domState);
        }
        return this;
    }
    public RevenueCalculatorPage clickOnCPT99453() {
        try {
            if (waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]"))) != null) {
                System.out.println("Checkbox is present in the DOM.");
            } else {
                System.out.println("Checkbox is NOT present in the DOM.");
            }
            try {
                waiter.until(ExpectedConditions.visibilityOf(CPT99453));
                System.out.println("Checkbox is visible.");
            } catch (Exception e) {
                System.out.println("Checkbox is NOT visible. Attempting JavaScript click.");
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CPT99453);
            System.out.println("Checkbox clicked via JavaScript.");
        } catch (Exception e) {
            System.out.println("Failed to click on the checkbox: " + e.getMessage());
            String domState = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML;");
            System.out.println("DOM State: " + domState);
        }
        return this;
    }
    public RevenueCalculatorPage clickOnCPT99454() {
        try {
            if (waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]"))) != null) {
                System.out.println("Checkbox is present in the DOM.");
            } else {
                System.out.println("Checkbox is NOT present in the DOM.");
            }
            try {
                waiter.until(ExpectedConditions.visibilityOf(CPT99454));
                System.out.println("Checkbox is visible.");
            } catch (Exception e) {
                System.out.println("Checkbox is NOT visible. Attempting JavaScript click.");
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CPT99454);
            System.out.println("Checkbox clicked via JavaScript.");
        } catch (Exception e) {
            System.out.println("Failed to click on the checkbox: " + e.getMessage());
            String domState = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML;");
            System.out.println("DOM State: " + domState);
        }
        return this;
    }
    public RevenueCalculatorPage clickOnCPT99474() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CPT99091);
            System.out.println("Scrolled to the checkbox.");
            if (waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]"))) != null) {
                System.out.println("Checkbox is present in the DOM.");
            } else {
                System.out.println("Checkbox is NOT present in the DOM.");
            }
            try {
                waiter.until(ExpectedConditions.visibilityOf(CPT99474));
                System.out.println("Checkbox is visible.");
            } catch (Exception e) {
                System.out.println("Checkbox is NOT visible. Attempting JavaScript click.");
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", CPT99474);
            System.out.println("Checkbox clicked via JavaScript.");
        } catch (Exception e) {
            System.out.println("Failed to click on the checkbox: " + e.getMessage());
            String domState = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML;");
            System.out.println("DOM State: " + domState);
        }
        return this;
    }
    public void totalRecurringReimbursement() {
    WebElement	total=waiter.until(ExpectedConditions.visibilityOf(TotalRecurringReimbursement));
    System.out.println("Total Recurring Reimbursement for all Patients Per Month: shows the value is"+total.getText());
	}
    }
