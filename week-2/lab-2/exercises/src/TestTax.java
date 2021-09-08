public class TestTax {
    public static void main(String[] args) {
        TaxOnSalary tax1 = new TaxOnSalary();
        TaxOnSalary tax2 = new TaxOnSalary(false);

        System.out.println("Tax 1");
        tax1.inputSalary();
        System.out.println("PAN Submitted? " + tax1.getPAN());
        System.out.println("Payable Tax = Rs. " + tax1.calculateTax());
        
        System.out.println("**************************");

        System.out.println("Tax 2");
        tax2.inputSalary();
        System.out.println("PAN Submitted? " + tax1.getPAN());
        System.out.println("Payable Tax = Rs. " + tax2.calculateTax());
    }
}