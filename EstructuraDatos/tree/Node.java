

public class Node {
	String word;
	Node left, right;
	int occurances;
	
	
	public Node(String word)
	{
		this.word = word;
		occurances = 1;
		left = null;
		right = null;	
	}	
	
}