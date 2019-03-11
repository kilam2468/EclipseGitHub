import java.util.*;


public class EmailAddress {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.println("Enter Email Address");
			String s = input.nextLine();
			
			
			int index1 = s.indexOf('@');
			int index2 = s.lastIndexOf('.');
			String myUserName = s.substring(0,index1);
			String myExtension = s.substring(index2+1);
			String myHostName = s.substring(index1+1, index2);
			System.out.println("User name is: "+myUserName);
			System.out.println("Host name is: "+myHostName);
			System.out.println("Extension is: "+myExtension);
	}
}