package demo;

public class HCFofNumber {
public static void main(String[] args) {
	int n=36,t=48,s=0;
	for(int i=1;i<n;i++) {
		if(n%i==0 && t%i==0) 
			s=i;
	}System.out.println(s);
}
}
