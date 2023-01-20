import java.util.*;
public class Q_17Duplicate {

	public static void main(String[] args) {
		int[]arr= {1,3,5,1,3,7,1};
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			boolean ispresent=false;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					ispresent=true;
				}
				
			}
			if(!ispresent) {
				res.add(arr[i]);
			}
		}
		for(int e: res) {
			System.out.println(e);
		}

	}

}
