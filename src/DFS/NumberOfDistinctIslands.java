package DFS;

import java.util.ArrayList;
import java.util.HashSet;

class NumberOfDistinctIslands {

    int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numDistinctIslands(int[][] grid) {
        int distinct = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        HashSet<ArrayList<String>> shapes = new HashSet<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    ArrayList<String> island = new ArrayList<>();
                    dfs(grid,visited,i,j, island, i, j); //second (i,j) is the base value
                    shapes.add(island);
                }
            }
        }
        return shapes.size();
    }

    private void dfs(int[][] grid, boolean[][] visited, int i, int j, ArrayList<String> island, int baseRow, int baseCol){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] || grid[i][j] == 0)
            return;

        visited[i][j] = true;
        island.add(toString(i - baseRow, j - baseCol));

        for(int[] dir : direction)
            dfs(grid, visited, i+dir[0], j+dir[1], island, baseRow, baseCol);
    }

    private String toString(int r, int c){
        return Integer.toString(r) + " " + Integer.toString(c);
    }

}

//Second Solution
// class Solution {

//     int direction[][] = {{0,1},{0,-1},{1,0},{-1,0}};

//     public int numDistinctIslands(int[][] grid) {
//         int distinct = 0;
//         boolean[][] visited = new boolean[grid.length][grid[0].length];
//         Set<String> shapes = new HashSet<>();

//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j] == 1 && !visited[i][j]){
//                     List<int[]> island = new ArrayList<>();
//                     dfs(grid,visited,i,j, island);
//                     shapes.add(normalize(island));
//                 }
//             }
//         }
//         return shapes.size();
//     }

//     private void dfs(int[][] grid, boolean[][] visited, int i, int j, List<int[]> island){
//         if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] || grid[i][j] == 0)
//             return;

//         visited[i][j] = true;
//         island.add(new int[] {i,j});

//         for(int[] dir : direction)
//             dfs(grid, visited, i+dir[0], j+dir[1], island);
//     }

//     private String normalize(List<int[]> island){
//         int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
//         for(int[] cell : island){
//             minX = Math.min(minX, cell[0]);
//             minY = Math.min(minY, cell[1]);
//         }

//         List<String> normalized = new ArrayList<>();
//         for(int[] cell : island)
//             normalized.add((cell[0] - minX) + "," + (cell[1]-minY));

//         Collections.sort(normalized);
//         return String.join("-", normalized);
//     }
// }