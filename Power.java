public class Power {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		while(num%2==0 && num!=0){
			num=num/2;}
			if(num==1){
				System.out.println("number is power of 2");
			}
				else{
					System.out.println("not power of 2");
			}
		}

	}


