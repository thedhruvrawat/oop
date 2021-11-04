import java.io.*;
import java.util.*;

class Minesweeper {
    private int n;
    private int m;
    /* Define an private instance variable to represent the grid */
    private String[] grid = new String[n];

    Minesweeper(String[] grid, int x, int y) {
        /*
         * Complete the definition of the constructor and initiate the instance
         * variables
         */
        this.grid = grid;
        n = x;
        m = y;
    }
    // private int grid[][] = new int[n][m];

    private boolean isValidCell(int i, int j) {
        /*
         * Implement the method to determine if a particular cell is valid for the given
         * grid. This method should be used in the following two methods.
         */
        if ((i >= 1 && i <= n) && (j >= 1 && j <= m))
            return true;
        return false;
    }

    public void countSurroundingMines(int i, int j) {
        /*
         * Complete the definition of the method to count the total number of mines in
         * the surrounding cells of cell (i, j)
         */
        if (!isValidCell(i, j)) {
            System.out.println("Invalid query");
            return;
        }

        int new_i = i - 1;
        int new_j = j - 1;
        int sum = 0;
        for (int p = new_i - 1; p <= new_i + 1; p++) {
            for (int q = new_j - 1; q <= new_j + 1; q++) {
                if (isValidCell(p + 1, q + 1))
                    sum += Integer.parseInt(Character.toString(this.grid[p].charAt(q)));
            }
        }
        sum -= Integer.parseInt(Character.toString(this.grid[i - 1].charAt(j - 1)));
        System.out.println(sum);

    }

    public void findSafeCell(int i, int j) {
        /*
         * Complete the definition of the method to find the leftmost and uppermost safe
         * cell for the cell (i, j)
         */
        try {
            if (isValidCell(i, j)) {
                ArrayList<String[]> list = new ArrayList<String[]>();
                for (int p = 0; p < n; p++) {
                    for (int q = 0; q < m; q++) {
                        if (Integer.parseInt(Character.toString(grid[p].charAt(q))) == 0) {
                            String[] zero_coord = new String[3];
                            zero_coord[0] = Integer.toString(p);
                            zero_coord[1] = Integer.toString(q);
                            zero_coord[2] = Integer.toString(Math.abs(i - p) + Math.abs(j - q));
                            list.add(zero_coord);
                        }
                    }
                }
                int mindist = n + m;
                if (list.size() == 0)
                    System.out.println("No safe cell exists");
                else {
                    String[] dist = new String[3];
                    for (int p = 0; p < list.size(); p++) {
                        dist = list.get(p);
                        int curr_dist = Integer.parseInt(dist[2]);
                        if (curr_dist < mindist)
                            mindist = curr_dist;
                    }
                    for (int p = 0; p < list.size(); p++) {
                        dist = list.get(p);
                        int curr_dist = Integer.parseInt(dist[2]);
                        if (curr_dist != mindist)
                            list.remove(p);
                    }
                    int min_i = n, min_j = m;
                    for (int p = 0; p < list.size(); p++) {
                        dist = list.get(p);
                        int curr_i = Integer.parseInt(dist[0]);
                        if (curr_i < min_i)
                            min_i = curr_i;
                    }
                    for (int p = 0; p < list.size(); p++) {
                        dist = list.get(p);
                        int curr_i = Integer.parseInt(dist[0]);
                        if (curr_i != min_i)
                            list.remove(p);
                    }
                    for (int p = 0; p < list.size(); p++) {
                        dist = list.get(p);
                        int curr_j = Integer.parseInt(dist[1]);
                        if (curr_j < min_j)
                            min_j = curr_j;
                    }
                    min_i += 1;
                    min_j += 1;
                    System.out.println(min_i + " " + min_j);
                }
            } else {
                System.out.println("Invalid query");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dim = { "hello", "hello" };
        dim = br.readLine().trim().split("\\s+");
        int row = Integer.parseInt(dim[0]);
        int len = Integer.parseInt(dim[1]);
        String[] Grid = new String[row];
        for (int i = 0; i < row; i++)
            Grid[i] = br.readLine().substring(0, len);
        Minesweeper m = new Minesweeper(Grid, row, len);
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            String[] quer = { " ", " ", " " };
            quer = br.readLine().trim().split("\\s+");
            int choice = Integer.parseInt(quer[0]);
            int x = Integer.parseInt(quer[1]);
            int y = Integer.parseInt(quer[2]);
            if (choice == 1)
                m.countSurroundingMines(x, y);
            else if (choice == 2)
                m.findSafeCell(x, y);
            else
                System.out.println("Invalid query option");
        }
    }
}