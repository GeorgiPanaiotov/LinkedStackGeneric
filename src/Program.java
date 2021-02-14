public class Program {
    public static void main(String[] args) {
        LinkedStackGen<Integer> stack = new LinkedStackGen<Integer>();

        stack.Push(5);
        stack.Push(4);
        stack.Push(3);
        stack.Push(2);

        System.out.println(stack.Pop());
        System.out.println(stack.Pop());
    }
}
