import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD})  

@interface Info{
	int AuthorID();
	String Author() default "Yaswanth";
	String Supervisor() default "karthik";
	String Date();
	String Time();
	int version();
	String description() default "Displaying Method";
}

class Devloper{
	@Info(AuthorID = 2002, Date = "28-11-1999", Time = "10:42pm", version = 4)
	public void displayMethod(){System.out.println("Author Info");} 
}
public class ANNOTATIONQ2 {
	public static void main(String[] args)throws Exception{ 
		Devloper devloper = new Devloper();
		Method m=devloper.getClass().getMethod("displayMethod");
		
		Info d1 = m.getAnnotation(Info.class);
		System.out.println("Author ID is: "+d1.AuthorID());
		System.out.println("Author Name is: "+d1.Author());  
		System.out.println("Supervisor is: "+d1.Supervisor());  
	}

}