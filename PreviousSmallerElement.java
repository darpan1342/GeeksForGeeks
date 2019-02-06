public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        //ArrayList<Integer> next = new ArrayList<>(A.size());
        ArrayList<Integer> pre = new ArrayList<>(A.size());
        for(int i=0;i<A.size();i++)
        {
            pre.add(-1);
        }
        //System.out.println(A.size());
        for(int i=A.size()-1;i>=0;i--)
        {
            if(stack.empty()||A.get(stack.peek())<=A.get(i))
            {
                stack.push(i);
            }
            else
            {
                while(!stack.empty()&&A.get(stack.peek())>A.get(i))
                {
                    pre.set(stack.peek(),A.get(i));
                    stack.pop();
                }
                stack.push(i);
            }
            // System.out.println(A.get(i));
        }
        while(!stack.empty())
        {
            pre.set(stack.peek(),-1);
            stack.pop();
        }
        return pre;
    }
}
