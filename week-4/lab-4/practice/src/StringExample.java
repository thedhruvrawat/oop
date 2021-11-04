public class StringExample {
    public static void main(String[] args) {
        String name = new String("Java String");
        System.out.println(name);
        System.out.println(name.length());// prints length of String name
        System.out.println(name.charAt(5));// prints the char at index 5
        char ch[] = name.toCharArray();// convert name into a char array
        String name1 = new String("New String");
        Boolean result = name1.equals(name);
        System.out.println("result = " + result);
        int p = name1.compareTo(name);
        System.out.println("p=" + p);
        // Substring method
        String s1 = new String("Hello World");// returns the substring from the ith index
        String s2 = s1.substring(4);//
        System.out.println(s2);
    }
}