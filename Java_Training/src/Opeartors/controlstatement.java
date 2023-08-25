package Opeartors;

public class controlstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int  a= 5, b=3,c= 4;
		if(a>b) {
			if(a>c){
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
			
		}
*/
		/*// but here more time taken
		int a= 4,b= 7,c=9;
		if(a>b && a>c) {
			System.out.println("a is bigger"+ a);
		}
		if(b>a && b>c) {
			System.out.println("b is bigger"+ b);
		}
		if(c>a && c>b) {
			System.out.println("c is bigger"+ c);
		}*/
		int a= 4,b= 7,c=9;
		if(a>b && a>c) {
			System.out.println("a is bigger"+ a);
		}
		else if(b>a && b>c) {
			System.out.println("b is bigger"+ b);
		}
		else {
			System.out.println("c is bigger"+ c);
		}
		
	}

}
