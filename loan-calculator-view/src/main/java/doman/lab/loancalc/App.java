package doman.lab.loancalc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LoanCalculateRepository loanCalculateRepository = new LoanCalculateRepositoryImpl();
        LoanCalculatorService loanCalculatorService = new LoanCalculatorServiceImpl(loanCalculateRepository);
        LoanCalculatorView calculateView = new LoanCalculatorView(loanCalculatorService);

        calculateView.showLoanForm();
        calculateView.showLoanSummary();
    }
}
