package ExceptionHandling;

import java.util.Scanner;

public class SampleExceptionHandlingProgram {

	public String UserName = "rosharma";
	public String PassWord = "Password";
	String authenticate = "Y";

	public static void main(String[] args) {

		SampleExceptionHandlingProgram o = new SampleExceptionHandlingProgram();

		Scanner scan = new Scanner(System.in);
		System.out.println("Username : ");
		String UserName = scan.nextLine();
		try {
			if (UserName.isEmpty()) {
				throw new Exception("Username cannot be NULL");
			} else if (UserName.equals("rosharma")) {
				System.out.println("Please enter the password");
				String password = scan.nextLine();

				if (password.equals(o.PassWord)) {
					System.out.println("User logged in");
				} else {
					System.out.println("Password incorrect");
				}
			} else {
				System.out.println("The username entered doesn't exist !!");
			}
		} catch (Exception e) {
			System.out.println("Please enter the username");
			e.printStackTrace();
		}
	}

	public void login(String s) {
		if (s.equals("Y")) {
			System.out.println("User logged in");
		}
	}

}
