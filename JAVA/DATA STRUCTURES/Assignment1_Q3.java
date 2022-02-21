
public class compoundinterest {
	public static void main(String[] args) {

	    double  p = 3500.25; // P =Principal amount
	    double  r = 10;   //  r  =Annual interest rate
	    double  n = 4;  //  n =Term of loan, in years
	    int t = 5; //   t=Number of years interest is applied
	    double si = ( p * r * n) / 100; // si = simple interest
	    double ci = p * (Math.pow((1 + r/100), (t * n))) - p; // ci=compound interest
	   
	    System.out.println("Principal: " + p);
	    System.out.println("Interest Rate: " + r);
	    System.out.println("Time Duration: " + n);
	    System.out.println("Simple Interest: " + si);
	    System.out.println("Compound Interest: "+ ci);
	  }
	}