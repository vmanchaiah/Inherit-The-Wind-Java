public class SalaryWorker extends Worker {

    //data members
    double annualSalary;


    //Constructor declaration of class
    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;

    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    //Method to get weekly pay based off of annual salary
    public double calculateWeeklyPay(double hoursWorked) {
        weeklyPay = annualSalary / 52;
        return weeklyPay;

    }

    public void displayWeeklyPay(double hoursWorked) {
        super.displayWeeklyPay(hoursWorked);
        System.out.println("Weekly Pay: " + calculateWeeklyPay(hoursWorked));
        System.out.println("Annual Salary: " + annualSalary);
    }

    public void displayHeader() {
        System.out.println("Salary Worker: ");
        System.out.println(title + firstName + " " + lastName + " ID#: " + ID);
    }
}


