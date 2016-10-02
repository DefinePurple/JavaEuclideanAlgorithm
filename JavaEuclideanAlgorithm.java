import java.util.Scanner;

public class JavaEuclideanAlgorithm {
	private static Maths formula = new Maths(); 
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = 32, b = 8;
		int d;
		
		System.out.print("Enter a number: ");
		a = scan.nextInt();
		
		System.out.print("Enter a number: ");
		b = scan.nextInt();
		
		if(a<b){
			d = b;
			b = a;
			a = d;
		}
		
		if((a%b != 0)){
				d = formula.euclideanAlgorithm(a,b);
		} else {
			d = b;
		}
		System.out.println("Gcd of (" + a + "," + b + ") is " + d);
	}
}
