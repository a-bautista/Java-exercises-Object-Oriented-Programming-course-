
public class Lexicon {
	
	Node first;
	int elements;
	
	public Lexicon()
	{
		first = null;
		elements = 0;
	}
	
	public void addLexicon(String str)
	{
		if (first == null)
		{
			first = new Node(str);
			elements++;
			return;
		}
		
		
		Node pointer = first;
		
		while (true)
		{
			int result = str.compareTo(pointer.word);
			if (result == 0)
			{
				first.occurances++;	
				return;
			}
			if (result > 0)
			{
				if (pointer.right == null)
				{
				pointer.right = new Node(str);
				elements++;
				}
				else
				pointer = pointer.right;
			}
			
			if (result < 0)
			{
				if (pointer.left == null)
				{
				pointer.left = new Node(str);
				elements++;
				}
				else
				pointer = pointer.left;
			}
		}
	}
	
	public Node addRecursiveLexicon(Node pointer, String str)
	{
		if (pointer == null)
		{
			elements++;
			return new Node(str);
		} else {
			
			int result = str.compareTo(pointer.word);
			if (result == 0)
			{
			pointer.occurances++;
			return null;
			} else 
			if (result > 0)
			{
				pointer.right = addRecursiveLexicon(pointer.right, str);
				elements++;
				return pointer;
			} else {
				pointer.left = addRecursiveLexicon(pointer.left, str);
				elements++;	
				return pointer;
			}
		}
	}
	
	
	public void printAll(Node node)
	{
		if (node != null)
		{
			printAll(node.left);
			System.out.println(node.word);
			printAll(node.right);
		}
	}
	
}