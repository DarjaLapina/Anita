package testimine_5.pkg4_talvik;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Testimine_54_Talvik {

private static final double FIRST_TAX_BRACKET = 14400;
private static final double SECOND_TAX_BRACKET = 25200;
private static final double BASE_TAX_ALLOWANCE = 7848;
private static final double INCOME_TAX_RATE = 0.2;

private final double monthlyIncome;
private final double expectedAnnualIncome;

public Testimine_54_Talvik(double monthlyIncome, double expectedAnnualIncome) {
this.monthlyIncome = monthlyIncome;
this.expectedAnnualIncome = expectedAnnualIncome;
}

@Parameterized.Parameters
public static Collection<Object[]> testData() {
return Arrays.asList(new Object[][] {
{900, 10176.0},
{1500, 16464.0},
{2100, 21792.0},
{3200, 30248.0},
{4100, 37504.0},
{5300, 49760.0}
});
}

@Test
public void testAnnualIncomeCalculation() {
assertEquals(expectedAnnualIncome, Testimine_54_Talvik.calculateAnnualIncome(monthlyIncome), 0.01);
}

@Test
public void testZeroIncome() {
assertEquals(0.0, Testimine_54_Talvik.calculateAnnualIncome(0), 0.01);
}

@Test
public void testNegativeIncome() {
assertEquals(0.0, Testimine_54_Talvik.calculateAnnualIncome(-800), 0.01);
}

@Test
public void testHighIncome() {
assertEquals(648000.0, Testimine_54_Talvik.calculateAnnualIncome(54000), 0.01);
}

@Test
public void testLowIncome() {
assertEquals(65064.0, Testimine_54_Talvik.calculateAnnualIncome(54), 0.01);
}
}