// Lab 2: GradeBook.java
 // GradeBook class with a constructor to initialize the course name.

 public class GradeBook
{
	private String courseName; // course name for this GradeBook
	private String teacher;
	// constructor initializes courseName with String supplied as argument
	public GradeBook( String name )
	{
	courseName = name; // initializes courseName
	} // end constructor

	// method to set the course name
	public void setCourseName( String name )
	{
	courseName = name; // store the course name
	} // end method setCourseName

	// method to retrieve the course name
	public String getCourseName()
	{
	return courseName;
	} // end method getCourseName

	public void setTeacher(String name){
		teacher = name;
	}
	public String getTeacher(){
		return teacher;
	}
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
	// this statement calls getCourseName to get the
	// name of the course this GradeBook represents
	System.out.printf( "Welcome to the grade book for\n%s!\n",
	getCourseName() );
	
	System.out.printf("This course is presented by: %s",getTeacher());
	} // end method displayMessage

 } // end class GradeBook

