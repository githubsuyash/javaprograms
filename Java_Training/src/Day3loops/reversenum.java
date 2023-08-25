package Day3loops;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 1234;
		int rem=0;
		while(num!=0) {
			rem= (rem*10)+num%10;
			num=num/10;
		}
		System.out.println(rem);
/*
 // here not a  number but  here a digits are printed 
   
  while(num>0) {
	int r= num%10;
	System.out.print(r);
	num = num/10;
}*/
		
	}

}
