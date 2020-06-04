public class Worker extends Person {

    //data members
    double hourlyPayRate;
    double weeklyPay;
    double extraHours = 0.0;


    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    //Setter method created to assign user input to data members
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }



    /**return the pay total. Hours under 40 are at the HourlyRate,
    hours above 40 are at time and a half (1.5)
     *
     * */

    //Method to return the total weekly pay
    public double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked > 40){
            extraHours = hoursWorked - 40;
            weeklyPay = (extraHours * hourlyPayRate * 1.5) + (40 * hourlyPayRate);
        }
        else {
            weeklyPay = hoursWorked * hourlyPayRate;
        }
            return weeklyPay;
    }

    //Method to display hours and total pay
    public void displayWeeklyPay(double hoursWorked) {


            extraHours = hoursWorked - 40;
            weeklyPay = (40 * hourlyPayRate);
            System.out.println("Hours worked at regular Pay Rate: " + hoursWorked +
                    " and they're getting: " + weeklyPay);
            System.out.println("Hours worked at overtime Pay Rate rate: " +
            extraHours + " and they're getting: " + (extraHours * 1.5));
            System.out.println("Total combined pay: " + (weeklyPay + (extraHours * 1.5)));

    }

    public void displayHeader(){
        System.out.println("Worker: ");
        System.out.println(title + firstName + " " + lastName + " ID#: " + ID);
    }


}
