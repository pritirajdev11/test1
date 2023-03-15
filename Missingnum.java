package firstpackage;

public class Missingnum{
	public static void main(String args[]) 
	{
		int a1[]= {7,5,6,1,4,2};
		int a2[]= {5,3,1,2};
		
		int sum1=0;
		
		for(int i=0;i<a1.length;i++) {
			sum1 = sum1 + a1[i];
			
		}
		System.out.println("sum of elements of numbers"+sum1);
		int sum2=0;
		for(int i=0;i<=7;i++) {
			sum2=sum2+i;
		}
			System.out.println("sum of elements in range of numbers"+sum2);
			System.out.println("missing number is"+(sum2-sum1));
			int num1 =0;
		
			for(int i=0;i<a2.length;i++) {
				num1 = num1 + a2[i];
				
			}
			System.out.println("sum of elements of numbers"+num1);
			 
			int num2=0;
			for(int i=1;i<=5;i++) {
				num2=num2+i;
				
			}
			System.out.println("sum of elements in range of numbers"+num2);
			System.out.println("missing number is"+(num2-num1));
	}
}