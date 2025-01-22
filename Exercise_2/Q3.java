package Exercise_2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*Q3.WAP that accepts the applicant's name, job title, and company name as input. 
		 * Generate a formatted email message for job offer acceptance.
		 */
		
		String name,job_title,company_name;
		
		//scanner class used for user input
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name=sc.next();
		
		System.out.println("Enter your job title : ");
		job_title=sc.next();
		
		System.out.println("Enter your compnay name : ");
		company_name=sc.next();
		
		System.out.println("Subject: Job Offer for the Position of " + job_title + "\n\n" +
                "Dear " + name + ",\n\n" +
                "We are delighted to offer you the position of " + job_title + " at " + company_name + ". " +
                "After reviewing your qualifications and experience, we are confident that you will make a valuable addition to our team.\n\n" +
                "The starting date for this position is 01/01/2025, and your salary package will be 3500000. " +
                "Please confirm your acceptance of this offer by 26/12/2024.\n\n" +
                "If you have any questions or need further clarification, feel free to reach out to us at " + company_name + " or +2224446667.\n\n" +
                "We look forward to welcoming you to our team!\n\n" +
                "Best regards,\n" +
                "[Microsoft]");

		
	}

}
