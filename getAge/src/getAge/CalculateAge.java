package getAge;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;



public class CalculateAge {
	
	static Scanner input = new Scanner(System.in);
	

	
		public static void main(String[] args) throws Exception {
			
			//Where the full name of the user must be declared
			System.out.print("Enter First Name \n");
			String fname = input.nextLine();
			
	
			System.out.print("Enter Middle Name \n");
			String mname = input.nextLine();
			
	
			System.out.print("Enter Last Name \n");
			String lname = input.nextLine();
			
	
	
		//Where the birthdate should be inputted to get the age of the user
        System.out.print("Please enter date of birth in MMM-dd-yyyy: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-yyyy");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        
        //shows the complete name with the age of the user
        System.out.println("Full Name:" + (fname.replaceAll("[AaEeIiOoUu]","X") + (mname.replaceAll("[AaEeIiOoUu]","Y") + (lname.replaceAll("[AaEeIiOoUu]","Z")+"_"+getAge(dob))))); 
        
    }
	
	// Returns age given the date of birth
    public static int getAge(Calendar dob) throws Exception {
        Calendar today = Calendar.getInstance();
 
        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
 
        int age = curYear - dobYear;
 
 
        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) { 
            age--;
        } else if (dobMonth == curMonth) { 
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) { 
                age--;
            }
        }
 
        return age;
    }

}
