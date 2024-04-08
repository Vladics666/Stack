public class Mains {
    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>(10);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println(stack.pop()); 
            System.out.println(stack.isEmpty());   
            System.out.println(stack.size());
    }
}
