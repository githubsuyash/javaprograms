package Opeartors;

public class test3 {
	public static void main(String args[]) {
		/*int a= 5,b=8;
		int ans = a>b? a:b;
		System.out.println("ans =" + ans);*/
		int a= 5,b=8 ,c= 6;
	int ans =a>b? (a>c?a:c):(b>c?b:c);
	System.out.println("ans =" + ans);
	}

}
