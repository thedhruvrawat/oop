public class Fibonacci {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        System.out.println("The first " + count + " Fibonacci numbers are:");
        int num1 = 1, num2 = 1, num3, sum=2;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < count; i++) {
            num3 = num1 + num2;
            sum += num3;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println("\nThe average is " + (float)sum/count);
    }
}
