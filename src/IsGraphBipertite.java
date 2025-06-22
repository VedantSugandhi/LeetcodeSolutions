import java.util.Arrays;

//dfs
class IsGraphBipertite {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i] == -1){
                if(!dfs(graph,color,i,0))
                    return false;
            }
        }
        return true;
    }
    private boolean dfs(int[][] graph, int[] color, int node, int c){
        color[node] = c;
        for(int neighbour : graph[node]){
            if(color[neighbour] == -1){
                if(!dfs(graph, color, neighbour, 1-c))
                    return false;
            }
            else if(color[neighbour] == c)
                return false;
        }
        return true;
    }
}