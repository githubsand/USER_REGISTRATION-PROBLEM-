/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid Email Name or not 
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class EmailName
{
	public void email() {
		Pattern pat = Pattern.compile("^[1-9A-Za-z]+[.][a-zA-Z]*@(bl)[.](co)([.](in))?$");  
		Scanner sc=new Scanner(System.in);
		try {
		String insert_email_name=sc.nextLine();
		Matcher match = pat.matcher(insert_email_name);  
		boolean result1 = match.matches();
		if(result1==false)
			System.out.println("Email Name is Invalid");
		else
		System.out.println("Email Name is Valid");}
		finally {
			     sc.close();}
		}
    public static void main( String[] args )
    {
    	System.out.print("Check Email Name is Valid or not ");
    	EmailName e1=new EmailName();
    	e1.email();
    	
    }	
}

