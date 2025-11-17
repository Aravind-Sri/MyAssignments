package myAssignments.week2.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// output: cHaNgEmE

		String test = "changeme";

		char[] charArray = test.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}

		   // Convert back to string - below 
        String result = new String(charArray);
        System.out.println(result);
        
//		System.out.println(charArray);

	}
}
