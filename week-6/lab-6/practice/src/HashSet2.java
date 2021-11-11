import java.util.*;

public class HashSet2 {
    public static void main(String[] args) {
        String[] str1 = new String[]{"Hyd","Goa","Mumbai","Patna"};
        //line1
        HashSet<String> hs1 =new HashSet<String>(Arrays.asList(str1));
        System.out.println("Hashset1 elements: ");
        System.out.println(hs1);
        hs1.remove("Goa"); //remove specific elements
        System.out.println("After using remove method on hs1: ");
        System.out.println(hs1);
        HashSet<String> hs2=new HashSet<String>();
        String[] str2 = new String[]{"Kochi","Hyd","Kochi"};
        System.out.println("Empty status of hs2 is "+hs2.isEmpty());
        System.out.println("Adding elements in hs2: ");
        for(int i=0;i<str2.length;i++){
        if(hs2.add(str2[i])==true){ //line2
            System.out.println(i + " index element is added");
        } else{
            System.out.println(i + " index element is not added");
        }
        }
        System.out.println("Empty status of hs2 is "+hs2.isEmpty());
        System.out.println("Hashset2 elements are: " +hs2);
        hs1.addAll(hs2); //Used to add one hashset into other hashset
        System.out.println("Updated Hashset after adding hs2 into hs1 :\n"+hs1);
        //Removing all the new elements from HashSet
        hs1.removeAll(hs2); //line3
        System.out.println("After using removeAll() method: \n"+hs1);
        //Clearing out the hashset
        hs1.clear();
        System.out.println("After using clear() method: "+ hs1);
    }
}
