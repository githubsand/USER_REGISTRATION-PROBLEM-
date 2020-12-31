
/**
 * @author Sandeep_Singh
 * @Functionality Check Phone Number is valid or not. 
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class PhoneNumberValidation
{
	public void phone_number() {
		Pattern pat = Pattern.compile("^(91)[ ][789][0-9]{9}$");  
		Scanner sc=new Scanner(System.in);
		try {
		String insert_phone_number=sc.nextLine();
		Matcher match = pat.matcher(insert_phone_number);  
		boolean result1 = match.matches();
		if(result1==false)
			System.out.println("Phone Number is Invalid");
		else
		System.out.println("Phone Number is Valid");}
		finally {
			     sc.close();}
		}
    public static void main( String[] args )
    {
    	System.out.println("Check Phone Number  is Valid or not ");
        System.out.println("Please Enter the Phone Number");
    	PhoneNumberValidation phone=new PhoneNumberValidation();
    	phone.phone_number();
    	
    }	
}
