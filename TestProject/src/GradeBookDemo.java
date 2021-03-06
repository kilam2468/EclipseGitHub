// Lab 2: GradeBookTest.java
// GradeBook constructor used to specify the course name at the
 // time each GradeBook object is created.
//Uses Gradebook Object with Gradebook.java

 public class GradeBookDemo
	{
	// main method begins program execution
	public static void main( String args[] )
	{
	// create GradeBook object
	GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming" );
	gradeBook1.setTeacher("Sam Smith");
	Description gradeDescription = new Description ("Learn to Code in Java\n");
	gradeBook1.displayMessage(); // display welcome message
	gradeDescription.displayMessage();
	//gradeBook1.setTeacher("Sam Smith");

	GradeBook gradeBook2 = new GradeBook("ENG125 Introduction to Literature " );
	Description gradeDescription2 = new Description("Freshman English that is focused on Literature ");
	gradeBook2.setTeacher("Judy Jones");
	System.out.println("\n\nChanging instructor name to: "+gradeBook2.getTeacher()+"\n");
	gradeBook2.displayMessage();
	gradeDescription2.displayMessage();



	} // end main
	
} // end class GradeBookTest