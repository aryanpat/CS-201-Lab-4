package lab4;

public class Divide {

	public static void main(String[] args) {
		
		System.out.println("These numbers can be divided by 7: ");
		int a = 1;
		int row = 1;
		String space = "";
		
		while(a <= 200) {
			
			if(a%7 == 0) {
				space += Integer.toString(a) + ",";
			
				if(row == 4){
					row = 1;
					space += "\n";
				}
			
				else {
					row++;
				}
			}
			
			a++;
		}
		
		System.out.println(space);

	}
}
