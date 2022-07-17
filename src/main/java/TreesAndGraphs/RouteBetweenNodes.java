package TreesAndGraphs;

import java.util.LinkedList;


// Problem: find a route between two nodes in a graph.

public class RouteBetweenNodes {

    //private class node to represent node of graph.
    private static class Node {
        private int id;
        private State state;
        private Node(int id) {
            this.id = id;
        }
    }

    /* Nodes can have three states when searching the tree
        1. Unvisited. Node has been searched yet.
        1. Visiting. Current node in the iteration of the graph.
        2. Visited. Node has already been searched.

     */
    enum State {Unvisited, Visited, Visiting;}

    // Function to search the graph
    boolean search(Graph graph, Node start, Node end) {

        // Use a list to operate as a Queue (q = queue)
        LinkedList<Node> q = new LinkedList<Node>();

        // Set all nodes as "Unvisited"
        for (Node u : graph.getNodes()) {
            u.state = State.Unvisited;
        }

        // Set start node as a state of visiting.
        start.state = State.Visiting;
        q.add(start);

        Node u;

        //Search through all nodes
        while(!q.isEmpty()) {

            u = q.removeFirst(); // i.e. dequeue()

            if(u != null) {
                /*
                Algorithm Steps
                1. Get all adjacent nodes to the start node
                2. Check if adjacent nodes have been visited previous to avoid infinite loops
                3. If any of the adjacent nodes equal the end node a path has been found return true
                4. If adjacent node is not the final node
                5. Set node's state as visiting and add node to the queue list
                    a. The ordering of the list FIFO makes this breadth first search
                6. Once all adjacent nodes have been inspected and no path found
                7. Set current nodes state as "Visited" and get the next node in the list.
                 */
                for (Node v : u.getAdjacent()) {
                    if(v.state == State.Unvisited) {
                        if (v == end) {
                            // Path found. return true.
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
            }
            u.state = State.Visited;
        }
        // No path found. return false.
        return false;
    }
    // Breadth first search is better for graphs because you avoid committing to searching the wrong path
}
