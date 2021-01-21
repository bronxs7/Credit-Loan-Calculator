package doman.lab.loancalc;

public class LoanCalculateRepositoryImpl implements LoanCalculateRepository {

    private Data data = new Data();

    public LoanCalculateRepositoryImpl() {
    }

    @Override
    public void setPrice(double price) {
        data.setPrice(price);
    }

    @Override
    public double getPrice() {
        return data.getPrice();
    }

    @Override
    public void setDownPaymentPercent(int downPaymentPercent) {
        data.setDownPaymentPercent(downPaymentPercent);
    }

    @Override
    public int getDownPaymentPercent() {
        return data.getDownPaymentPercent();
    }

    @Override
    public void setYearOfPayments(int yearOfPayments) {
        data.setYearOfPayments(yearOfPayments);
    }

    @Override
    public int getYearOfPayments() {
        return data.getYearOfPayments();
    }

    @Override
    public void setAnnualInterest(int annualInterest) {
        data.setAnnualInterest(annualInterest);
    }

    @Override
    public int getAnnualInterest() {
        return data.getAnnualInterest();
    }
}
