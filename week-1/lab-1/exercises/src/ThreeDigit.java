public class ThreeDigit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]), i=0;
        int[] dig = new int[4];
        while (num > 0) {
            dig[i] = num%10;
            num = num / 10;
            i++;
        }
        for (int m = 0; m < dig.length; m++) {
            for (int n = 0; n < dig.length; n++) {
                for (int o = 0; o < dig.length; o++) {
                    if (m != n && m != o && n != o) {
                        System.out.println(dig[m] + "" + dig[n] + "" + dig[o]);
                    }
                }
            }
        }
    }
}
