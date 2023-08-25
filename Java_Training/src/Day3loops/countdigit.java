package Day3loops;

public class countdigit {

	public static void main(String[] args) {
		 int num= 11234;
		 int co=0;
		 while(num!=0) {
			 num=num/10;
			 co++;
		 }System.out.println("count =" +co);

	}

}
