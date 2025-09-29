public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0, len = 1, changeLen = 0;
        int dir = 0, stepsInDir = 0;
        int steps = 0;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);

            if (dir == 0) x++;
            else if (dir == 1) y++;
            else if (dir == 2) x--;
            else if (dir == 3) y--;

            steps++;

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);

            stepsInDir++;
            if (stepsInDir == len) {
                stepsInDir = 0;
                dir = (dir + 1) % 4;
                changeLen++;
                if (changeLen == 2) {
                    changeLen = 0;
                    len++;
                }
            }
        }
        StdOut.println("Total steps = " + steps);
    }
}
