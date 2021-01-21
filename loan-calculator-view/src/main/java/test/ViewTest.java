package test;

//import doman.lab.loancalc.*;

import doman.lab.loancalc.*;

import java.text.NumberFormat;

public class ViewTest {
    static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        LoanCalculateRepository loanCalculateRepository = new LoanCalculateRepositoryImpl();
        LoanCalculatorService loanCalculatorService = new LoanCalculatorServiceImpl(loanCalculateRepository);
        LoanCalculatorView calculateView = new LoanCalculatorView(loanCalculatorService);

        loanCalculatorService.setPrice(50000000);
        loanCalculatorService.setDownPaymentPercent(10);

        System.out.println(currency.format(loanCalculatorService.getPrice()));
        System.out.println(loanCalculatorService.getDownPaymentPercent());
    }
}
