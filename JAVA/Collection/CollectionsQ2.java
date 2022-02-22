import java.util.HashSet;

public class CollectionsQ2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Yaswanth");
		hs.add("Karthik");
		hs.add("Balaji");
		hs.add("Deekshith");
		hs.add("Anitha");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("yash");
		hs.add("sunny");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}