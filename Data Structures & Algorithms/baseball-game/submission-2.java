class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String op : operations){
            if(op.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                sum += newTop;


            }else if(op.equals("D")){
                stack.push(2*stack.peek());
                sum += stack.peek();
            }else if(op.equals("C")){
                sum -= stack.pop();
            
            }else{
                stack.push(Integer.parseInt(op));
                sum += stack.peek();
            }

        }
        // for(int score : stack){
        //     sum += score;
        // }
        return sum;




        
    }
}