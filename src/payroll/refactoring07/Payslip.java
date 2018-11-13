package payroll.refactoring07;

public class Payslip {
    private final double grossSalary;
    private final TaxCalculator taxCalculator;

    public Payslip(final double grossSalary, final TaxCalculator taxCalculator) {
        this.grossSalary = grossSalary;
        this.taxCalculator = taxCalculator;
    }

    public double getNet() {
        return grossSalary - taxCalculator.getTax(grossSalary);
    }
}