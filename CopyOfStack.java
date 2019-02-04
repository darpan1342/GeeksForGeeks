import java.util.*;

class CopyOfStack {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        Stack<Integer> res = new Stack<>();
        for (int i = 0; i < n; i++) {
            int temp = stack.peek();
            stack.pop();
            while (!stack.empty() && stack.size() > i) {
                res.push(stack.peek());
                stack.pop();
            }
            res.push(temp);
            while (!res.empty()) {
                stack.push(res.peek());
                res.pop();
            }
        }

        while (!stack.empty()) {
            res.push(stack.peek());
            stack.pop();
        }

        s.close();
    }
}