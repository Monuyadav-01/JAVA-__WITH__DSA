import java.util.ArrayList;

public class NthStairs {

    public static ArrayList<String> getPath(int n) {
        if (n == 0) {
            ArrayList<String> brse = new ArrayList<>();
            brse.add(" ");
            return brse;
        }
        if (n < 0) {
            ArrayList<String> brse = new ArrayList<>();
            return brse;
        }

        ArrayList<String> path1 = getPath(n - 1);
        ArrayList<String> path2 = getPath(n - 2);
        ArrayList<String> path3 = getPath(n - 3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<String> get = getPath(n);
        System.out.println(get);
    }
}
