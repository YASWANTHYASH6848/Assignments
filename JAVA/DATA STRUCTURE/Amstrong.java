
public class Amstrong {

	public static void main(String[] args) {
		int num = 371;
		int temp = num;
		int r,sum=0 ;
		
		while(num>0)
		{
			r = num % 10;
			num = num / 10;
			sum = sum + r*r*r;
		}
		if(temp == sum)
			System.out.println("its amstrong");
		else
			System.out.println("its not");

	}

}
