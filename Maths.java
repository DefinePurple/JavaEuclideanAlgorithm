public class Maths {
	int q,r,gcd;
	/* a  = qb + r*/
	Maths(){
		q = 0;
		r = 0;
		gcd = 0;
	}
	
	int euclideanAlgorithm(int a, int b){
		gcd = r;
		q = (int) a/b;
		r = a - (q*b);
		
		//System.out.println(r + "=" + a + "-" + "(" + q + "*" + b + ")" + "\n");
		//System.out.println(q + "=" + a + "/" + b);
		
		if(r > 0 ){
			euclideanAlgorithm(b,r);
		}
		
		return gcd;
	}
}