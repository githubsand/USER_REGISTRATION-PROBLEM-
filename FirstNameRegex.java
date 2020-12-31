/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid First Name or not 
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class FirstNameRegex
{
    public static void main( String[] args )
    {
    	System.out.print("Check Name is Valid or not ");
    	Pattern pat = Pattern.compile("^([A-Z][A-Za-z]{2,})$");  
    	Scanner sc=new Scanner(System.in);
    	try {
    	String check=sc.nextLine();
    	Matcher match = pat.matcher(check);  
    	boolean result1 = match.matches();
    	if(result1==false)
    		System.out.println("First Name is Invalid");
    	else
    	System.out.println("First Name is Valid");}
    	finally {
    		     sc.close();}
    }
    	
}

