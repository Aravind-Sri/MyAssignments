package myAssignments.week2.day1;


public class IsPrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Prime numbers between 0 to 50
		
		System.out.println("Prime numbers: ");
		
		for(int n=0;n<=50;n++) {
			int count = 0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(n + " ");
			}
		}
		
	}
}
