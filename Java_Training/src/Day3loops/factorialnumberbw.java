package Day3loops;

public class factorialnumberbw {

	public static void main(String[] args) {
		
		int num;
		
		for(int j=3;j<=7;j++) 
		{	int fact =1;
			for(int i=j;i>0;i--) {
			
				fact=fact*i;
			}System.out.println(fact);
		}
	}

}
