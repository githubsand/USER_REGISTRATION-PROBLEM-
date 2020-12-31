/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid Last Name or not 
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class LastNameRegex
{
    public static void main( String[] args )
    {
    	System.out.print("Check Last Name is Valid or not ");
    	Pattern pat = Pattern.compile("^([A-Z][A-Za-z]{3,})$");  
    	Scanner sc=new Scanner(System.in);
    	try {
    	String insert_last_name=sc.nextLine();
    	Matcher match = pat.matcher(insert_last_name);  
    	boolean result1 = match.matches();
    	if(result1==false)
    		System.out.println("Last Name is Invalid");
    	else
    	System.out.println("Last Name is Valid");}
    	finally {
    		     sc.close();}
    }	
}
