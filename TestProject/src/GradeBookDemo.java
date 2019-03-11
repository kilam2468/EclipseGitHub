// Lab 2: GradeBookTest.java
// GradeBook constructor used to specify the course name at the
 // time each GradeBook object is created.

 public class GradeBookDemo
	{
	// main method begins program execution
	public static void main( String args[] )
	{
	// create GradeBook object
	GradeBook gradeBook1 = new GradeBook(
	"CS101 Introduction to Java Programming" );
	gradeBook1.setTeacher("Sam Smith");
	gradeBook1.displayMessage(); // display welcome message
	//gradeBook1.setTeacher("Sam Smith");

	GradeBook gradeBook2 = new GradeBook("CS101 Introduction to Java Programming" );
	gradeBook2.setTeacher("Judy Jones");
	System.out.println("\n\nChanging instructor name to: "+gradeBook2.getTeacher()+"\n");
	gradeBook2.displayMessage();


	} // end main
	
} // end class GradeBookTest