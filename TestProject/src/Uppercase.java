import java.util.*;


public class Uppercase {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a statement");
		String s = input.nextLine();
		s = s.toUpperCase();
		
		for(int i = 0; i <s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
}