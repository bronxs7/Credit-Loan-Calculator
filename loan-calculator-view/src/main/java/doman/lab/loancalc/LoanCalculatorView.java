package doman.lab.loancalc;

import java.text.NumberFormat;

public class LoanCalculatorView {
    private LoanCalculatorService loanCalculatorService;

    public LoanCalculatorView(LoanCalculatorService loanCalculatorService) {
        this.loanCalculatorService = loanCalculatorService;
    }

    public void showLoanForm() {
        double price = Console.readNumber("Price(IDR): ", 10_000_000, 300_000_000);
        int downPaymentPercent = (int) Console.readNumber("Down payment(in %): ", 25,70);
        int yearOfPayments = (int) Console.readNumber("Number of Payment(in year): ", 1, 5);
        int annualInterest = (int) Console.readNumber("Number of Interest(annual): ", 1,30);

        loanCalculatorService.setPrice(price);
        loanCalculatorService.setDownPaymentPercent(downPaymentPercent);
        loanCalculatorService.setYearOfPayments(yearOfPayments);
        loanCalculatorService.setAnnualInterest(annualInterest);
    }


    public void showLoanSummary() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println(" ");
        System.out.println("********Your Loan Simulator********");
        System.out.println("Price : " + currency.format(loanCalculatorService.getPrice()));
        System.out.println("Down payment of " + loanCalculatorService.getDownPaymentPercent() + "% : " + currency.format(loanCalculatorService.calculateDownPayment()));
        System.out.println("Number of payments : " + loanCalculatorService.getNumberOfPayments() + " Months");
        System.out.println("Annual Interest : " + loanCalculatorService.getAnnualInterest() + "%");
        System.out.println("Loan Balance : " + currency.format(loanCalculatorService.getLoanBalance()));
        System.out.println("Monthly payment : " + currency.format(loanCalculatorService.calculateMonthlyPayment()));
    }

}
