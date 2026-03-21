class Solution {
    public int evalRPN(String[] tokens) {
        // Stack<String> st = new Stack<>();
        // for(String str : tokens){
        //     if(str.equals("+")){
        //         int a = Integer.valueOf(st.pop());
        //         int b = Integer.valueOf(st.pop());
        //         int c = b + a;
        //         st.push(String.valueOf(c));
        //     }
        //     else if(str.equals("-")){
        //         int a = Integer.valueOf(st.pop());
        //         int b = Integer.valueOf(st.pop());
        //         int c = b - a;
        //         st.push(String.valueOf(c));
        //     }
        //     else if(str.equals("*")){
        //         int a = Integer.valueOf(st.pop());
        //         int b = Integer.valueOf(st.pop());
        //         int c = b * a;
        //         st.push(String.valueOf(c));
        //     }
        //     else if(str.equals("/")){
        //         int a = Integer.valueOf(st.pop());
        //         int b = Integer.valueOf(st.pop());
        //         int c = b / a;
        //         st.push(String.valueOf(c));
        //     }else{
        //         st.push(str);
        //     }
        // }
        // return Integer.valueOf(st.pop());


        Map<String, BinaryOperator<Integer>> op = Map.of(
        "+", (a, b) -> a + b, 
        "-", (a, b) -> a - b, 
        "*", (a, b) -> a * b, 
        "/", (a, b) -> a / b);
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens)
        if (op.containsKey(token)) {
            int b = stack.pop();
            int a = stack.pop();
            stack.push(op.get(token).apply(a, b));
        } else {
            stack.push(Integer.valueOf(token));
        }

        return Integer.valueOf(stack.pop());
    }
}