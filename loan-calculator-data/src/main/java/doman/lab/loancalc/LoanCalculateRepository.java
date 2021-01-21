package doman.lab.loancalc;

public interface LoanCalculateRepository {

    void setPrice(double price);
    double getPrice();
    void setDownPaymentPercent(int downPaymentPercent);
    int getDownPaymentPercent();
    void setYearOfPayments(int yearOfPayments);
    int getYearOfPayments();
    void setAnnualInterest(int annualInterest);
    int getAnnualInterest();
}
