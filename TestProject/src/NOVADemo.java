public class NOVADemo{
   public static void main(String[] args){
      NOVA s1 = new NOVA();
	  s1.display();
	  
	  NOVA s2 = new NOVA ("math");
	  s2.display();
	  s2.setName("Amy");
	  s2.setMajor("English");
	  s2.setAge(99);
	  s2.display();
	  
	  NOVA s3 = new NOVA("CompSci");
	  s3.display();
	  s3.setName("Jack");
	  s3.setMajor("History");
	  s3.setAge(54);
	  s3.display();
   }
}