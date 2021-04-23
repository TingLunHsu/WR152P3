import java.util.*;
import java.io.*;

/*
 * A blackjack game
 */
public class ChatBot {  
	public static final String ERROR = "error.txt";

	public static final String WELCOME_MESSAGE = "welcome_message.txt";
	public static final String WELCOME_MENU = "welcome_menu.txt";

	public static final String PROBLEM_STATEMENT = "problem_statement.txt";
	public static final String PROBLEM_MENU = "problem_menu.txt";
	public static final String PROBLEM_CAUSE = "problem_cause.txt";
	public static final String PROBLEM_CAUSE_RESPONSE = "problem_cause_response.txt";
	public static final String PROBLEM_MATTER = "problem_matter.txt";
	public static final String PROBLEM_MATTER_RESPONSE = "problem_matter_response.txt";

	public static final String DISAGREE = "disagree.txt";
	public static final String DISAGREE_RESPONSE_1 = "disagree_response_1.txt";
	public static final String DISAGREE_RESPONSE_2 = "disagree_response_2.txt";

	public static final String SOLUTION_MENU = "solution_menu.txt";
	public static final String SOLUTION_ADMIN = "solution_admin.txt";
	public static final String SOLUTION_PROF = "solution_prof.txt";
	public static final String SOLUTION_STUDENT = "solution_student.txt";

	//public static final String 

	/*
	 * Print the content in the file
	 */
	public static void print(String fName) {
	    try {
	    	File myObj = new File(fName);
	    	Scanner myReader = new Scanner(myObj);
	    	while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
	    	}
	    	myReader.close();
	    } catch (FileNotFoundException e) {
	    	System.out.println("File not found: " + fName);
	    	System.exit(1);
	    }
	}

	/*
	 * Disagree with the argument
	 */
	public static void disagree() {
		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			ChatBot.print(DISAGREE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				switch (choice)
				{
					case 1:
						ChatBot.print(DISAGREE_RESPONSE_1);
						break;
					case 2:
						ChatBot.print(DISAGREE_RESPONSE_2);
						break;
					case 3:
						ChatBot.problem();
						break;
					default:
						ChatBot.print(ERROR);
				}
				
			} catch (NumberFormatException e) {
				ChatBot.print(ERROR);
			}
		}
	}

	/*
	 * Solution to this problem
	 */
	public static void solution() {
		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			ChatBot.print(SOLUTION_MENU);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				switch (choice)
				{
					case 1:
						ChatBot.print(SOLUTION_ADMIN);
						break;
					case 2:
						ChatBot.print(SOLUTION_PROF);
						break;
					case 3:
						ChatBot.print(SOLUTION_STUDENT);
						break;
					case 4:
						ChatBot.problem();
						break;
					case 5:
						ChatBot.cause();
						break;
					case 6:
						ChatBot.matter();
						break;
					case 7:
						System.exit(0);
					default:
						ChatBot.print(ERROR);
				}
				
			} catch (NumberFormatException e) {
				ChatBot.print(ERROR);
			}
		}
	}

	/*
	 * The cause of the problem
	 */
	public static void cause() {
		ChatBot.print(PROBLEM_CAUSE);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			ChatBot.print(PROBLEM_CAUSE_RESPONSE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice || choice <= 3) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			ChatBot.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				ChatBot.solution();
				break;
			case 2:
				ChatBot.matter();
				break;
			case 3:
				ChatBot.disagree();
				break;
			default:
		}
	}

	/*
	 * Why this problem matters
	 */
	public static void matter() {
		ChatBot.print(PROBLEM_MATTER);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			ChatBot.print(PROBLEM_MATTER_RESPONSE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice || choice <= 3) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			ChatBot.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				ChatBot.solution();
				break;
			case 2:
				ChatBot.cause();
				break;
			case 3:
				ChatBot.disagree();
				break;
		}
	}

	/*
	 * Underrepresented students in CS major
	 */
	public static void problem() {
		ChatBot.print(PROBLEM_STATEMENT);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			ChatBot.print(PROBLEM_MENU);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice && choice <= 2) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			ChatBot.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				ChatBot.cause();
				break;
			case 2:
				ChatBot.matter();
				break;
			default:
		}
	}

	/*
	 * Welcome message of the chatbot
	 */ 
    public static void welcome() {
		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		ChatBot.print(WELCOME_MESSAGE);
		while (true) {
			ChatBot.print(WELCOME_MENU);
			str = sc.nextLine();
			try {
				choice = Integer.parseInt(str);

				if (1 <= choice && choice <= 2) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			ChatBot.print(ERROR);
		}

		if(choice == 1) {
			ChatBot.problem();
		}

		System.exit(0);
    }

    public static void main(String[] args) {
    	ChatBot.welcome();
    }
}