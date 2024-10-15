package testimine_5.pkg4_talvik;

public class Testimine_54_Talvik{
private static final double FIRST_TAX_BRACKET = 14400;
private static final double SECOND_TAX_BRACKET = 25200;
private static final double BASE_TAX_ALLOWANCE = 7848;
private static final double INCOME_TAX_RATE = 0.2;

public static double calculateAnnualIncome(double monthlyIncome) {
double annualIncome = monthlyIncome * 12;
double applicableTaxAllowance;

if (annualIncome <= FIRST_TAX_BRACKET) {
applicableTaxAllowance = BASE_TAX_ALLOWANCE;
} else if (annualIncome <= SECOND_TAX_BRACKET) {
applicableTaxAllowance = BASE_TAX_ALLOWANCE - 10800 * ((annualIncome - FIRST_TAX_BRACKET) / 10800);
} else {
applicableTaxAllowance = 0;
}

double taxableIncome = annualIncome - applicableTaxAllowance;
double incomeTax = taxableIncome <= 0 ? 0 : taxableIncome * INCOME_TAX_RATE;
double socialInsurance = annualIncome * 0.015;
return annualIncome - incomeTax - socialInsurance;
}
} 