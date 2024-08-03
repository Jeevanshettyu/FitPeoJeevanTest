package Fitpeo.test;

import org.testng.annotations.Test;

import FitpeoFactory.PageInstanceFactory;
import FitpeoPages.RevenueCalculatorPage;

public class RevenueCalculatorTest extends BaseTest {
    @Test
    public void fitPeoHomePage() {
        driver.get("https://www.fitpeo.com/");
        RevenueCalculatorPage revenueCPage = PageInstanceFactory.getInstance(RevenueCalculatorPage.class);
        revenueCPage.clickOnRevenueCalculatorPage()
                     .scrollToVisibilityOfSlider()
                     .adjustTheSliderToExactValue(1)
                     .enterInput(560)
                     .clickOnCPT99091()
                     .clickOnCPT99453()
                     .clickOnCPT99454()
                     .clickOnCPT99474()
                     .totalRecurringReimbursement();
        
    }
}
