import java.util.TreeMap;
import java.util.*;
public class CollectionsQ1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 952489604, "Karthik");
		contact.put((long) 993355664, "Balaji");
		contact.put((long) 989874853, "Yaswanth");
		contact.put((long) 967775097, "Arjun");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}