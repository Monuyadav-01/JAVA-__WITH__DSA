public class Maze {

    public static int path(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = path(r - 1, c);
        int right = path(r, c - 1);

        return left + right;

    }

    public static void path2(String s, int r, int c) {
        if (r == 1 || c == 1) {

            System.out.println(s);
            return;
        }
        if (r > 1) {
            path2(s + 'D', r - 1, c);
        }
        if (c > 1) {
            path2(s + "R", r, c - 1);
        }

    }

    public static void main(String[] args) {

        // System.out.println(path(3, 3));
        path2("", 3, 3);
    }
}
