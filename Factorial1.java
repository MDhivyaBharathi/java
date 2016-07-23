
public class Factorial1 {

	public static void main(String[] args) {
		int a;
		int fact=1;
		a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++){
			fact=fact*i;
		}
			System.out.println("the factorial of given num is : "+fact);

	}

}
