package Day3loops;

public class primenumberbw {

	public static void main(String[] args) {
	
		for( int j=50;j<=100;j++) {
			int c=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					c++;
				}
			}if(c==2) {
				System.out.println(j+" ");
			}
			}
	}

}
