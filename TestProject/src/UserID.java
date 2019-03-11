import java.util.*;


public class UserID {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname = input.nextLine();
		System.out.println("Enter Last Name");
		String lname = input.nextLine();
		System.out.println("Enter Birth Year");
		String birth = input.nextLine();
	
		String user = fname.substring(0,1).concat(lname.substring(0,3)).concat(birth.substring(2));
	
		System.out.println(user.toLowerCase());
	}
}