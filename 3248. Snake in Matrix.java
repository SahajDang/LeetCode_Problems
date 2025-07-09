class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;

        for (String command : commands) {
            switch (command) {
                case "RIGHT":
                    if (x + 1 < n) x++;
                    break;
                case "LEFT":
                    if (x - 1 >= 0) x--;
                    break;
                case "UP":
                    if (y - 1 >= 0) y--;
                    break;
                case "DOWN":
                    if (y + 1 < n) y++;
                    break;
            }
        }
        return y * n + x; 
    }
}
