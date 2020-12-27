import java.io.*;

class m {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[][] n = new int[T][T];
        // numberOfPlaces(n);

        if (setPlaces(n, T)) {
            System.out.println("YES");
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n.length; j++) {
                    System.out.print(n[j][i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    static boolean taken(int[][] n, int x, int y) {
        for (int i = 0; i < n[x].length; i++) {
            if (n[x][i] == 1) {
                return true;
            }
        }

        for (int i = 0; i < n[y].length; i++) {
            if (n[i][y] == 1) {
                return true;
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i + j == x + y) {
                    if (n[i][j] == 1)
                        return true;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i - j == x - y) {
                    if (n[i][j] == 1)
                        return true;
                }
            }
        }
        return false;
    }

    static boolean setPlaces(int[][] n, int T) {
        if (T <= 0) {
            return true;
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (taken(n, i, j)) {
                    continue;
                }
                n[i][j] = 1;
                if (setPlaces(n, T - 1)) {
                    return true;
                }
                n[i][j] = 0;
            }
        }
        return false;
    }
}
