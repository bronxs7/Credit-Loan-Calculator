package doman.lab.loancalc;

public class Data {

    private double price;
    private int downPaymentPercent;
    private int yearOfPayments;
    private int annualInterest;

    public Data(double price, int downPaymentPercent, int yearOfPayments, int annualInterest) {
        this.price = price;
        this.downPaymentPercent = downPaymentPercent;
        this.yearOfPayments = yearOfPayments;
        this.annualInterest = annualInterest;
    }

    public Data() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(int downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public int getYearOfPayments() {
        return yearOfPayments;
    }

    public void setYearOfPayments(int yearOfPayments) {
        this.yearOfPayments = yearOfPayments;
    }

    public int getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(int annualInterest) {
        this.annualInterest = annualInterest;
    }
}
