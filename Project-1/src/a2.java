import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		 
	
		
		Scanner r = new Scanner(System.in);
		System.out.print("Enter The Error number: ");
		
		String a= r.next();
		
		String Errors[][]= {
				{"403","No access permission."},
				{"404","The page does not exist."},
				{"500","Server problem."},
				{"401","To see the page you need (password)."},
				{"301","The page exists but has been moved permanently."},
				{"307","The page has moved temporarily."},
				{"405","The page was accessed by mistake."},
				{"408","Your arrival time to the page expired before you reached it."},
				{"414","The page / URL is longer than normal."},
				{"503","The service is not available, possibly due to too much pressure on the site."}
		};
		
		for(int i = 0; i<Errors.length;i++) {
			if(a.contentEquals(Errors[i][0]))
				System.out.print("The definition of the error code is: "+Errors[i][1]);
//			else()
//			System.out.print("The error number not found");
				
		}
		r.close();
		
		

	}

}
