class Solution {
    public String simplifyPath(String path) {
        String paths[] = path.split("/");
        StringBuilder sb = new StringBuilder("");
        Stack<String> stack = new Stack<>();
        for(String currentPath : paths){
            if(currentPath.equals(".") || currentPath.trim().length() == 0){
                continue;
            }
            else if(currentPath.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(currentPath);
            }
        }
        // Stack Path --> Canonical Path Convert
        for(String cPath : stack){
            sb.append("/");
            sb.append(cPath);
        }
        return sb.toString().length() > 0 ? sb.toString() : sb.append("/").toString();
    }
}
