
public class Q16 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length];
//		int j=0;
//		for(int i=4;i>=0;i--) {
//			
//			b[j]=a[i];
//			j++;
//		}
//		for(int i=0;i<5;i++) {
//			System.out.println(b[i]);
//		}
		for(int i=0;i<a.length;i++) {
			b[a.length-1-i]=a[i];
		}
		for(int e:b) {
			System.out.println(e);
		}

	}

}
