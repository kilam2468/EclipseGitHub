public class NOVA{
	//instance variables
	private String name;
	private int age;
	private String major;
	
	//constructor(s)
	public NOVA(){
		name = "James";
		major = "CS";
		age = 20;
		
	}

	
	public NOVA(String str){
		major = str;
		
	}
	
	//get/set and instance methods
	public String getName(){
		return name;
	}
	
	public void setName(String str){
		name = str;
	}
	
	public int getAge() {return age;}
	public void setAge(int n) { //0-150, otherwise reset = 0
		if (n>0 && n<150)
		age = n;
		else 
			age = 0;
	}
	
	
	public String getMajor(){return major;}
	public void setMajor(String str){major = str;}
	
	public void display(){
		System.out.println(name+", "+major+", "+age);
	}
}