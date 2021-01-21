package doman.lab.loancalc;

public interface LoanCalculatorService {

    void setPrice(double price);
    double getPrice();
    void setDownPaymentPercent(int downPaymentPercent);
    int getDownPaymentPercent();
    void setYearOfPayments(int yearOfPayments);
    int getYearOfPayments();
    void setAnnualInterest(int annualInterest);
    int getAnnualInterest();

    double calculateMonthlyPayment();
    double getLoanBalance();
    double getMonthlyInterest();
    double calculateDownPayment();
    int getNumberOfPayments();
}
