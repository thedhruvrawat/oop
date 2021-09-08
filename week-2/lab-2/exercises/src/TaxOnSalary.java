import java.util.Scanner;
class TaxOnSalary {

    private double salary;
    private boolean isPANsubmitted;
    
    public TaxOnSalary() {
        this.salary = 0.0;
        this.isPANsubmitted = false;
    }

    public TaxOnSalary(boolean isPANsubmitted) {
        this.salary = 1000.00;
        this.isPANsubmitted = isPANsubmitted;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean getPAN() {
        return this.isPANsubmitted;
    }
    
    public double calculateTax() {
        if (this.salary < 180000 && this.isPANsubmitted) {
            return 0.0;
        } else if (this.salary < 180000) {
            return 0.05 * this.salary;
        } else if (this.salary > 180000 && this.salary < 500000) {
            return 0.1 * this.salary;
        } else if (this.salary > 500000 && this.salary < 1000000) {
            return 0.2 * this.salary;
        } else if (this.salary > 1000000) {
            return 0.3 * this.salary;
        }
        return 0.0;
    }

    public void inputSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter salary: Rs. ");
        double newSalary = in.nextDouble();
        this.salary = newSalary;
        // in.close(); throws up exception error
        // https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input
    }
}
