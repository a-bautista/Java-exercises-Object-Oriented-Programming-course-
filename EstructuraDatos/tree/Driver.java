
public class Driver {
	
	public Driver() 
	{
		Lexicon tree = new Lexicon();
		
		tree.first = tree.addRecursiveLexicon(tree.first, "hello");
		tree.first = tree.addRecursiveLexicon(tree.first, "i");
		tree.first = tree.addRecursiveLexicon(tree.first, "am");
		tree.first = tree.addRecursiveLexicon(tree.first, "good");
		tree.first = tree.addRecursiveLexicon(tree.first, "boys");
		tree.first = tree.addRecursiveLexicon(tree.first, "12343");
		tree.first = tree.addRecursiveLexicon(tree.first, "lol");
		
		tree.printAll(tree.first);	
	}
	
	public static void main(String[] args)
	{
		new Driver();	
	}	
}