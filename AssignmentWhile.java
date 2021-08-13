package Week1.Day1;

public class AssignmentWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =345;
		int q = 3;
		int sum = 0;
		
while (q !=0) {
	
	q = num/10;
	sum = num%10 + sum;
	num = q;
	
}
System.out.println("sum of num is" + sum);
	}

}
