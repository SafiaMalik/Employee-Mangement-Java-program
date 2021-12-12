package lab7;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class OrderedHourlyEmployee  extends HourlyEmployee implements Ordered{

	public OrderedHourlyEmployee(String theName, Date theDate, double theWageRate, double theHours) {
		super(theName, theDate, theWageRate, theHours);
		// TODO Auto-generated constructor stub
	}
	public boolean precedes(Object other)
	 {
	 if (other == null)
	 return false;
	 else if (!(other instanceof OrderedHourlyEmployee))
	 return false;
	else
	 {
	 OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
	 return  (getPay() < otherOrderedHourlyEmployee.getPay());
	// if (this.getPay() < otherOrderedHourlyEmployee.getPay())
		// return true;
	// else 
		// return false;
	 }
	 }
	 	 public boolean follows(Object other)
	 {
	 if (other == null)
	 return false;
	else if (!(other instanceof OrderedHourlyEmployee))
	 return false;
	 else
	 {
	 OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
	 return (otherOrderedHourlyEmployee.precedes(this));
	 
	 }

	 }
	 	 public String toString()
	 	 {
	 		return (getName()+getHireDate().toString()+getRate()+getHours()); 
	 	 }

	public static void main(String[] args) {
		
		OrderedHourlyEmployee emp1=new OrderedHourlyEmployee("joe",new Date(),2,25 ) ;
		OrderedHourlyEmployee emp2=new OrderedHourlyEmployee("jasmin",new Date(),50,2 );
	//	System.out.println(emp1.toString());
		System.out.println("Object one pay is "+emp1.getPay());
		System.out.println("Object two pay is "+emp2.getPay());
		//System.out.println(emp1.follows(emp2));
		
		
		

		boolean		eployee1=emp1.follows(emp2);
	
	if(eployee1==true)
	{
		
	
		
	System.out.println("Object one pay is less than Object 2 pay");
	
	}
	//else {
	//	System.out.println("Object one pay is more than Object 2 pay");
	//}
	
	

	
}
	}
