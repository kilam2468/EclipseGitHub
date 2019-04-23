/**
 * Created By Malik Michael on Apr, 2019
 **/
public class Description {

    private String descriptionName;


    public Description(String name) {descriptionName = name;}

    public void setDescriptionName (String name) {descriptionName = name;}

    public String getDescriptionName()
    {
        return descriptionName;
    }

    public void displayMessage()
    {
        // this statement calls getDescription to get the
        // prints description
        System.out.printf( "\nCourse description:\n%s\n",
                getDescriptionName() );
    }


}
