
public class Q3 {

	public static void main(String[] args) {
		long mask=0,n=12;
		int i=2,j=1;
		if(((n>>i)&1)!=((n>>j)&1)){
			mask=(1l<<i)|(1l<<j);
		}
		System.out.println("the binary value for "+ n+" is = "+Long.toBinaryString(n));
		System.out.println("after swapping n is = "+(n^mask));
		long m=n^mask;
		System.out.println("and its binary value is = "+Long.toBinaryString(m));
	
	}

}
