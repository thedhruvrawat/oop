import java.util.ListIterator;
import java.util.Stack;

class StackEx {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("Pig");
        animals.push("Goat");
        animals.push("Sheep");
        int index = 2;
        ListIterator<String> it = animals.listIterator(index);
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println("Stack: " + animals);
        Stack<String> clone = new Stack<>();
        clone.addAll(animals);
        System.out.println("Clone: " + clone);
    }
}