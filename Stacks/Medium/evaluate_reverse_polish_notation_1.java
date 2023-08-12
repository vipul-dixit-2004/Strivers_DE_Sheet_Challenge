class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            String ele = tokens[i];
            try{
                stack.push(Integer.parseInt(ele));
            }catch(NumberFormatException e){
                int a = stack.pop();
                int b = stack.pop();
                switch(ele){
                    case "+": stack.push(b+a);break;
                    case "*": stack.push(b*a);break;
                    case "-": stack.push(b-a);break;
                    case "/": stack.push(b/a);break;
                } 

            }
        }
        return stack.pop();
    }
}
