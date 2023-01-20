
public class Q4 {

	public static void main(String[] args) {
		int a=8,b=9,result=0;
		while(b>0) {
			if((b&1)==1) {
				result=result+a;
				
			}
			a=a<<1;
			b=b>>1;
		}
		System.out.println(result);
	}

}
