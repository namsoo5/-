import java.util.LinkedList;
import java.util.Queue;

public class 매일190728 {
    static class Pos {
        int x;
        int y;
        int dis;

        public Pos(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1}
        };
        int[] start = new int[]{0, 0};
        int[] end = new int[]{0, 4};

        System.out.println(solution(arr, start, end));
    }

    static int solution(int[][] input, int[] start, int[] end) {

        Queue<Pos> queue = new LinkedList();
        Pos cur = new Pos(start[1], start[0], 0);
        queue.add(cur);

        int[] rowElement = new int[]{-1, 0, 0, 1};
        int[] colElement = new int[]{0, -1, 1, 0};

        boolean[][] visit = new boolean[input.length][input[0].length];
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
            if (pos.x == end[1] && pos.y == end[0]) {
                return pos.dis;
            }

            for (int i = 0; i < 4; i++) {
                int x = pos.x + rowElement[i];
                int y = pos.y + colElement[i];

                if (x < 0 || y < 0 || x >= input[0].length || y >= input.length) {
                    continue;
                }

                if (visit[y][x] == true || input[y][x] == 0) {
                    continue;
                }

                visit[y][x] = true;
                queue.add(new Pos(x, y, pos.dis + 1));
            }
        }

        return-1;
    }

}
