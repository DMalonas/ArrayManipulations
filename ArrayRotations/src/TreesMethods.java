import java.util.LinkedList;
import java.util.Queue;

public class TreesMethods {
	
	
	
	
	public int getBinTreeMaxHeight(Node root) {
	    if (root == null) { 
            return 0;  
	    }
        Queue<Node> q = new LinkedList();    
        q.add(root);
        int height = 0;   
        while (true) { 
            int nodeCount = q.size(); 
            if (nodeCount == 0) { 
                return height - 1;
            }
            height++; 
            while (nodeCount > 0) { 
            	Node newnode = q.peek(); 
                q.remove(); 
                if (newnode.left != null) { 
                    q.add(newnode.left); 
                }
                if (newnode.right != null) { 
                    q.add(newnode.right);
                }
                nodeCount--; 
            }
        }
	}
}
