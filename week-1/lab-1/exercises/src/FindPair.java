public class FindPair {
    public static void main(String[] args) {
        int sum = 0, arr[];
        arr = new int[args.length-1];
        sum = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            arr[i-1] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num + arr[j] == sum) {
                    System.out.println(num + " " + arr[j]);
                }
            }
        }
    }
}
