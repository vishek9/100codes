package demo;

public class LargestElement {
public static void main(String[] args) {
	int ar[]=new int[] {2,3,9,2,7};
	int t=ar[0];
	for(int i:ar) {
		if(i>t)
			t=i;
	}
	System.out.println(t);
}
}
