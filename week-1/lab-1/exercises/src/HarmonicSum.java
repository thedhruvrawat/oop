public class HarmonicSum {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]), i = 0;
        double harmonicL2r = 0.0, harmonicR2l = 0.0;
        for (i = 1; i <= num; i++) {
            harmonicL2r += 1.0 / i;
        }
        for (i = num; i >= 1; i--) {
            harmonicR2l += 1.0 / i;
        }
        System.out.println("Sum from left-to-right: " + harmonicL2r);
        System.out.println("Sum from right-to-left: " + harmonicR2l);
        System.out.println("The difference is: "+(harmonicR2l-harmonicL2r));
    }
}
