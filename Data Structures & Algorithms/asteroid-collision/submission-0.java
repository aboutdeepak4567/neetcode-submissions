// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> stack = new Stack<>();
//         for(int i : asteroids){
//             if((stack.peek() > 0 && i>0)||(stack.peek() < 0 && i<0)){
//                 stack.push(i);

//             }else if((stack.peek() + i)==0){
//                 stack.pop();
//             }else if()
            
//         }
        
//     }
// }
class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && a < 0) {

                if (stack.peek() < -a) {
                    stack.pop();
                    continue;
                }

                else if (stack.peek() == -a) {
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        int[] res = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}