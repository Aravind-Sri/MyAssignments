package myAssignments.week2.day3;

public class ReverseOddWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Expected output: “I ma a erawtfos tester” 
		
		String test = "I am a software tester";
		
		String[] words = test.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			if(i%2!=0) {
				char[] charArray = words[i].toCharArray();
				
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
			}
			else {
				System.out.print(words[i]);
			}
			
            System.out.print(" "); // add space after each word

		}
		

	}

}
