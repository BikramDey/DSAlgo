class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int item : asteroids){   
            if (item > 0) {
                stack.push(item);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -item)
                    stack.pop();

                if (stack.isEmpty() || stack.peek() < 0)
                    stack.push(item);
                else if (stack.peek() == -item)
                    stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}