package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class pathsSourceTarget {
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> result = new ArrayList<>();

            calculatePath(graph,result, new ArrayList<>(),0);

            return result;
        }
        public void calculatePath(int[][] graph, List<List<Integer>> result, List<Integer> path,int curr){
            path.add(curr);
            if(curr == graph.length-1)
                result.add(new ArrayList<>(path));
            else{
                for(int node : graph[curr])
                    calculatePath(graph, result, path,node);
            }
            path.remove(path.size()-1);
        }
}
