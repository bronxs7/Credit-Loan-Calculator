package doman.lab.loancalc;

public class LoanCalculatorServiceImpl implements LoanCalculatorService {
    Properties properties;
//    private final static int MONTH_IN_YEAR = 12;
//    private final static byte PERCENT = 100;

    private LoanCalculateRepository loanCalculateRepository;

    public LoanCalculatorServiceImpl(LoanCalculateRepository loanCalculateRepository) {
        this.loanCalculateRepository = loanCalculateRepository;
    }

    @Override
    public void setPrice(double price) {
        loanCalculateRepository.setPrice(price);
    }

    @Override
    public double getPrice() {
        return loanCalculateRepository.getPrice();
    }

    @Override
    public void setDownPaymentPercent(int downPaymentPercent) {
        loanCalculateRepository.setDownPaymentPercent(downPaymentPercent);
    }

    @Override
    public int getDownPaymentPercent() {
        return loanCalculateRepository.getDownPaymentPercent();
    }

    @Override
    public void setYearOfPayments(int yearOfPayments) {
        loanCalculateRepository.setYearOfPayments(yearOfPayments);
    }

    @Override
    public int getYearOfPayments() {
        return loanCalculateRepository.getYearOfPayments();
    }

    @Override
    public void setAnnualInterest(int annualInterest) {
        loanCalculateRepository.setAnnualInterest(annualInterest);
    }

    @Override
    public int getAnnualInterest() {
        return loanCalculateRepository.getAnnualInterest();
    }

    @Override
    public double calculateMonthlyPayment() {
        var totalMonthlyPayment = (getLoanBalance() / getNumberOfPayments())
                * getMonthlyInterest()
                + (getLoanBalance() / getNumberOfPayments());

        return totalMonthlyPayment;
    }

    @Override
    public double getLoanBalance() {
        return loanCalculateRepository.getPrice() - calculateDownPayment();
    }

    @Override
    public double getMonthlyInterest() {
        return loanCalculateRepository.getAnnualInterest() / properties.PERCENT.getValue() / properties.MONTH_IN_YEAR.getValue();
    }

    @Override
    public double calculateDownPayment() {
        return (double) loanCalculateRepository.getDownPaymentPercent() / properties.PERCENT.getValue() * loanCalculateRepository.getPrice();
    }

    @Override
    public int getNumberOfPayments() {
        return loanCalculateRepository.getYearOfPayments() * properties.MONTH_IN_YEAR.getValue();
    }
}
