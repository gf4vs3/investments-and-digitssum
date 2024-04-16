public class Investment {
    public static void main(String[] args) {
        double initialInvestment = 2500.0;
        double targetValue = 5000.0;
        double annualInterestRate = 0.075;

        double currentInvestment = initialInvestment;
        int years = 0;

        while (currentInvestment < targetValue) {
            currentInvestment += currentInvestment * annualInterestRate;
            years++;
        }

        System.out.println("It will take " + years + " years for the investment to be worth at least $" + targetValue);
    }
}
