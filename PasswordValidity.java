
/**
 * @author Sandeep_Singh
 * @Functionality Check Password Validity. 
 *
 */
import java.util.regex.*;
import java.util.Scanner;
public class PasswordValidity 
{
	void check_password() {
		Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$");  
		Scanner sc=new Scanner(System.in);
		try {
		String insert_password=sc.nextLine();
		Matcher match = pat.matcher(insert_password);  
		boolean result1 = match.matches();
		if(result1==false)
			System.out.println("Password is Invalid");
		else
		System.out.println("Password is Valid");}
		finally {
			     sc.close();}
		}
    public static void main( String[] args )
    {
        System.out.println("Password has some pre-defined rule");
        System.out.println("Rule No-1"+" "+"Minimun 8 characters");
        System.out.println("Rule No-2"+" "+"Should have atleast 1 upper-case");
        System.out.println("Rule No-3"+" "+"Should have atleast 1 numeric number in password");
        System.out.println("Rule No-4"+" "+"Should has exactly 1 special character");
        System.out.println( "Enter Password");
        PasswordValidity pw=new PasswordValidity();
        pw.check_password();
    }
}
