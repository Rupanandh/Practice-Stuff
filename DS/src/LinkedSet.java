import java.util.LinkedHashSet;
import java.util.TreeSet;


public class LinkedSet {

	public static void main(String[] args) {
	LinkedHashSet<String> dataSet = new LinkedHashSet<String>();
	
	dataSet.add("Rupa");
	dataSet.add("Nandha");
	dataSet.add("Rupa");
	
	TreeSet<String> treeSet = new TreeSet<String>();
	treeSet.add("Rupa");
	treeSet.add("Nandha");
	treeSet.add("Rupa");
	
	for (String string : dataSet) {
		System.out.println(string);
	}
	System.out.println(" -----");
	
	for (String string : treeSet) {
		System.out.println(string);
	}
	}

}
