package Day3loops;

public class first10primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int co =1;
		int n=1;
		while(co<11) {
			
			int c=0;
			for( int i=1;i<=n;i++) {
				if(n%i==0) {
					c++;	
				}		
			}if(c==2) {
				co++;
				System.out.println(n);
			 }n++;
			
		}

	}

}
