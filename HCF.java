package anudip;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 60, num2 = 36 ;
		while (num1 != num2)
		{
			if(num1 > num2)
			   num1 -= num2;
			
			else
				num2 -=num1;
			
		}
		
		System.out.println("HCF of 60 and 36 is:" + num1);

	}

}
