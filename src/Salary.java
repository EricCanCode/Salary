import java.util.Scanner;

public class Salary {
    static Scanner scanner = new Scanner(System.in);

    public static String getName() { // class method to receive the first and last name of employee/manager
        System.out.println("Please enter the employee's First Name.");
        String fName = scanner.next();
        System.out.println("Please enter the employee's Last Name.");
        String lName = scanner.next();
        return fName + " " + lName;
    }

    private void EmployeePay() { // instance method to display employee's pay
        String employee = Salary.getName(); // call to class method
        try {
            System.out.println("Please enter the employee's Hourly Wage.");
            double h_wage = scanner.nextDouble();
            System.out.println("Thank you \n");
            System.out.println("Employee: " + employee + " makes $" + h_wage + " an hour.\n");
        } catch (Exception e) { // catch method if a letter is entered
            System.out.println("I caught the problem, you entered a letter, numbers only please!");
            System.out.println("Let's try again.\n");
        }
    }

    private void ManagerPay() { // instance method to display manager's pay
        String manager = Salary.getName();// call to class method
        try {
            System.out.println("Please enter the manager's Salary.");
            double salary = scanner.nextDouble();
            System.out.println("Please enter the manager's Annual Bonus.");
            int bonusPay = scanner.nextInt();
            System.out.println("Thank you \n");
            System.out.print("Manager: " + manager + " makes $" + salary + " a year, ");
            System.out.println("with an annual bonus of $" + bonusPay + " each year.\n");
        } catch (Exception e) { // catch method if a letter is entered
            System.out.println("I caught the problem, you entered a letter, numbers only please!");
            System.out.println("Let's try again.\n");
        }
    }

    public static void main(String[] args) {
        String choice = ""; // initialization of variable choice

        System.out.println("This application takes input to display an employee or managers pay information \n");

        while (!choice.equalsIgnoreCase("e") || !choice.equalsIgnoreCase("m")
                || !choice.equalsIgnoreCase("q")) {
            System.out.println("Is this for an Employee or Manager? Type 'E' or 'M' or type 'Q' to quit.");
            choice = scanner.next();

            if (choice.equalsIgnoreCase("e")) {
                Salary ePay = new Salary(); //creating object of class salary
                ePay.EmployeePay(); // call to instance method employeePay
            }
            if (choice.equalsIgnoreCase("m")) {
                Salary mPay = new Salary(); // creating object of class salary
                mPay.ManagerPay(); // call to instance method employeePay
            }
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Thank you for using this demo, Goodbye");
                break;
            }
        }
    }
}

