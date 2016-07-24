public class Rev {

	public static void main(String[] args) {
		int num,reverse=0;
		num=Integer.parseInt(args[0]);
		while(num!=0){
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			}
		System.out.println("the reverse num is: "+reverse);

	}

}
