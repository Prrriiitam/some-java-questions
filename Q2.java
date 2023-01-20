
public class Q2 {

	public static void main(String[] args) {
		int n=16, parity=0;
		while(n!=0) {
			parity=parity^(n&1);
			n = n>>1;
		}
		System.out.println(parity);
		
	}

}
