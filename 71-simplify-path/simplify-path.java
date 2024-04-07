class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals("."))
                continue;
            if (dir.equals("..")) {
                if (!stack.isEmpty())
                stack.pop();
            } else {
                stack.push(dir);
            }
        }
        String simplifiedPath = "/" + String.join("/", stack);
      
        return simplifiedPath;
    }
}