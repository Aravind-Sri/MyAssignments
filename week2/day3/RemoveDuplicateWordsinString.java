package myAssignments.week2.day3;

public class RemoveDuplicateWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Expected output: “We learn Java basics as part of    sessions in    week1” 
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		int count = 0;
		
		String[] split = text.split(" ");
				
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					split[j]= "";
					count++;
				}
			}
		}
		if(count>1) {
			for (String word : split) {
                System.out.print(word + " ");
            }
		}

	}

}
