import java.lang.reflect.Array;
import java.util.ArrayList;

public class ApplicationRunner {
    public static void main(String[] args) {
        Worker workerOne = new Worker("121", "Mark", "Smith", "Mr.", 1980, 13.50);
        Worker workerTwo = new Worker("342", "Janice", "Brown", "Mrs.", 1976, 14.75);
        Worker workerThree = new Worker("651", "Richard", "Miller", "Mr.", 1982, 23.50);

        SalaryWorker employeeOne = new SalaryWorker("168", "Jack", "Smith", "Mr.", 1970, 13.50, 30000);
        SalaryWorker employeeTwo = new SalaryWorker("546", "Jill", "Lee", "Ms.", 1976, 23.50, 50000 );
        SalaryWorker employeeThree = new SalaryWorker("903", "Joey","Scott", "Mr.", 1977, 30, 62000);



        ArrayList<Worker> workerArrayList = new ArrayList<Worker>();
        workerArrayList.add(workerOne);
        workerArrayList.add(workerTwo);
        workerArrayList.add(workerThree);
        workerArrayList.add(employeeOne);
        workerArrayList.add(employeeTwo);
        workerArrayList.add(employeeThree);

        //Array to hold the weekly hours
        int[] hoursWorkedArray = new int[]{40,50,40};


        for (Worker worker : workerArrayList){
            worker.displayHeader();
            for (int hoursWorked: hoursWorkedArray) {
                worker.displayWeeklyPay(hoursWorked);
                System.out.println();
            }


        }
    }
}
