import java.util.*;
//uwu

public class ArrayListMethod {
	
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter some numbers, type -1 to end");
		int num = key.nextInt();
		while(num!=-1){
			if(!list.contains(num))
				list.add(num);
			System.out.println("Any other numbers?");
			num = key.nextInt();
		}
		int maxnum =max(list);
		int sumnum =sum(list);
		if(list.size() ==0 || list.get(0) ==0)
			System.out.println("Null");
		
		else{
			System.out.println("The Max number entered is : "+maxnum);
			System.out.println("The Sum of the numbers entered is: "+sumnum);
		}
	}
	public static Integer max(ArrayList<Integer> d){
		int result= 0;
		int max = d.get(0);
		
		
		for(int a = 0; a<d.size();a++){
			if(d.get(a)> max)
				max = d.get(a);
		}
		return max;
	}
	
	public static Integer sum(ArrayList<Integer> z){
		int sum =0;
		
		for(int a = 0;a<z.size();a++){
			sum += z.get(a);
			
		}
		return sum;
	}
	
}
		