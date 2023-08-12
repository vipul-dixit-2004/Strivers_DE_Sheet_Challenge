class Solution {
    private int eval(int a, int b, char oper){
        switch(oper){
            case '+': return b+a;
            case '*': return b*a;
            case '-': return b-a;
            case '/': return b/a;
        } 
        return 0;
    }
    public int evalRPN(String[] tokens) { //Time complexicity : O(n) and time taken 6ms.
        Stack<Integer> stack = new Stack<Integer>();
        for(String ele: tokens){
            if(ele.equals("+") || ele.equals("*") || ele.equals("/") || ele.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(eval(a,b,ele.charAt(0)));
            }else{
                stack.push(Integer.parseInt(ele));
            }
        }
        return stack.pop();
    }
}
