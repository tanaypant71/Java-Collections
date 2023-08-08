import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        System.out.println(s);

        System.out.println(s.peek());

        s.pop();
        System.out.println(s.peek());
    }
}
