package DFS;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

//DFS
class CloneGraph {
    private final HashMap<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node cloneNode = new Node(node.val, new ArrayList<>());

        visited.put(node, cloneNode);


        for (Node neighbor: node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}


//BFS
// class Solution {
//     public Node cloneGraph(Node node) {
//         if(node == null)
//             return null;
//         HashMap<Node, Node> map = new HashMap<>();
//         Queue<Node> queue = new LinkedList<>();
//         map.put(node, new Node(node.val));
//         queue.add(node);

//         while(queue.!isEmpty()){
//             Node curr = queue.poll();
//             for(Node neighbour : curr.neighbours){
//                 if(!map.containsKey(neighbour)){
//                     map.put(neighbour, new Node(neighbour.val))
//                     queue.add(neighbour);
//                 }
//                 map.get(curr).neighbours.add(map.get(neighbour));
//             }
//         }
//         return map.get(node);
//     }
// }

