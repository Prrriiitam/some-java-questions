
public class Q18 {

	public static void main(String[] args) {
		int a[]= {4,20,33,40};
		int b[]= {5,6,11,25,33,50};
		int res[]=new int[a.length+b.length];
		int i=0,j=0,r=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				res[r++]=a[i++];
			}
			else {
			res[r++]=b[j++];
			}
		}
		while(i<a.length) {
			res[r++]=a[i++];
		}
		while(j<b.length) {
			res[r++]=b[j++];
		}
		for(int e:res) {
			System.out.print(e+" ");
		}

	}

}
