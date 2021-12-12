package lab7;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Employee {
	
	    private String name;
	    private Date hireDate;

	    public Employee( ) throws ParseException
	    {
	         name = "No name";
	         //replacing line here hireDate = new Date("January", 1, 1000); //Just a placeholder.
	         String string = "January 1, 2010";
	         DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
	         hireDate = format.parse(string);
	    }

	    /**
	     Precondition: Neither theName nor theDate is null.
	    */
	    public Employee(String theName, Date theDate)
	    {
	        if (theName == null || theDate == null)
	        {
	             System.out.println("Fatal Error creating employee.");
	             System.exit(0);
	        }
	        name = theName;
	        hireDate = new Date();
	    }

	    public Employee(Employee originalObject)
	    {
	         name = originalObject.name;
	         hireDate = new Date();
	    }

	    public String getName( )
	    {
	        return name;
	    }

	    public Date getHireDate( )
	    {
	        return new Date();
	    }

	    /**
	     Precondition newName is not null.
	    */
	    public void setName(String newName)
	    {
	        if (newName == null)
	        {
	             System.out.println("Fatal Error setting employee name.");
	             System.exit(0);
	        }
	       else
	    	   name = newName;
	    }

	    /**
	     Precondition newDate is not null.
	    */
	    public void setHireDate(Date newDate)
	    {
	        if (newDate == null)
	        {
	             System.out.println("Fatal Error setting employee hire" + "date.");
	             System.exit(0);
	        }
	        else
	            hireDate = new Date();
	    }


	    public String toString( )
	    {
	        return (name + " " + hireDate.toString( ));
	    }


	    public boolean equals(Employee otherEmployee)
	    {
	        return (name.equals(otherEmployee.name)
	                       && hireDate.equals(otherEmployee.hireDate));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
