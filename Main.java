import java.util.*;

public class Main {  
	public static final String ERROR = "Please enter a valid option!";

	public static final String WELCOME_MESSAGE = "Hi, welcome! I'm a Main and you can call me BotTing.\nDo you know your CS students/peers are struggling right now and want to drop out of CS major?";
	public static final String WELCOME_MENU = "Available options:\n(1) Tell me more about this.\n(2) I will come back later.";

	public static final String PROBLEM_STATEMENT = "Undergraduate CS programs are dominated by White and Asian male students. A National Center for Education Statistics report shows that as of 2018, only 8.9% and 10.1% of CS degrees conferred are for Black and Hispanic students. As to the female-male ratio, only around one-fourth are females. The disproportion of demographics in CS undergraduates also reflects in the job market.\n\nNote: underrepresented students are defined as either non-White, non-Asian, or non-male in the following texts.";
	public static final String PROBLEM_MENU = "Available options:\n(1) Why there are so few underrepresented students getting CS degrees?\n(2) Could you tell me why this matters?";
	public static final String PROBLEM_CAUSE = "The environment in the CS major is highly competitive and individualistic. This makes groups of students who value communal goals and social value or who like to work with others hard to relate and feel a sense of belonging. Moreover, most CS students are White/Asian males. It is naturally hard for other groups of students to find people from similar cultural and gender backgrounds to make connections and work together.";
	public static final String PROBLEM_CAUSE_RESPONSE = "Available options:\n(1) Got it, what can I do to help?\n(2) Ok, then why does this issue matter?\n(3) I simply disagree with this.";
	public static final String PROBLEM_MATTER = "CS is one of the most emerging and highest paying and demanding fields, if all the tech positions are occupied by the privileged, it widens the income and career opportunity disparities.\nMoreover, tech fields highly affect people’s lives. For example, engineers in Facebook design the algorithms that choose what kinds of posts to promote to certain kinds of people. People tend to favor those who have similar backgrounds with or without caution. If those engineers' backgrounds are not diverse and are mainly dominated by White and Asian males, the underrepresented groups' voices might be neglected.";
	public static final String PROBLEM_MATTER_RESPONSE = "Available options:\n(1) Got it, what can I do to help?\n(2) Ok, I am curious what's the cause?\n(3) I simply disagree with this.";

	public static final String SOLUTION_MENU = "What can I help if I am a __\n(1) School administrator\n(2) Professor\n(3) Student\nOther available options:\n(4) I would like to read the problem statement again.\n(5) I would like to know the cause of this problem.\n(6) I would like to know the importance of this issue.\n(7) I see, thank you a lot for sharing!";
	public static final String SOLUTION_ADMIN = "As a school administrator, you can design programs that enhance students' sense of belonging and relatability, such as a mentor program that pairs lowerclassmen with upperclassmen with similar backgrounds or events that invite graduated underrepresented students to share their stories.";
	public static final String SOLUTION_PROF = "As a professor, you design in-class activities and group assignments that enhance students' interaction with each other. A study showed that how incorporating methods where students can interact with each other significantly increases student satisfaction. Moreover, there's a significant correlation between students’ feeling of community of their study group and the learning outcome.";
	public static final String SOLUTION_STUDENT = "As a student, the easiest and most helpful way to help your peers is to say hi and invite them to study and work with you. It's basically a win-win scenario for both of you!";

	public static final String DISAGREE = "Why do you disagree with this?\n(1) The CS work environment is highly competitive, so better train students with a competitive mindset.\n(2) Those students who drop out simply means that they are not suitable here, no need to provide extra support for them.\n(3) Nevermind, I would like to come back to read the problem again.";
	public static final String DISAGREE_RESPONSE_1 = "This field grows fast with lots of new positions. It’s not necessary to have a competitive mindset.";
	public static final String DISAGREE_RESPONSE_2 = "People drop out not simply because they are less capable. There are many reasons involved, and sometimes they just need some other form of support and can perform as well as other students.";

	//public static final String 

	/*
	 * Print the content in the file
	 */
	public static void print(String fName) {
		System.out.println();
		System.out.println(fName);
	}

	/*
	 * Disagree with the argument
	 */
	public static void disagree() {
		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			Main.print(DISAGREE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				switch (choice)
				{
					case 1:
						Main.print(DISAGREE_RESPONSE_1);
						break;
					case 2:
						Main.print(DISAGREE_RESPONSE_2);
						break;
					case 3:
						Main.problem();
						break;
					default:
						Main.print(ERROR);
				}
				
			} catch (NumberFormatException e) {
				Main.print(ERROR);
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
			Main.print(SOLUTION_MENU);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				switch (choice)
				{
					case 1:
						Main.print(SOLUTION_ADMIN);
						break;
					case 2:
						Main.print(SOLUTION_PROF);
						break;
					case 3:
						Main.print(SOLUTION_STUDENT);
						break;
					case 4:
						Main.problem();
						break;
					case 5:
						Main.cause();
						break;
					case 6:
						Main.matter();
						break;
					case 7:
						System.exit(0);
					default:
						Main.print(ERROR);
				}
				
			} catch (NumberFormatException e) {
				Main.print(ERROR);
			}
		}
	}

	/*
	 * The cause of the problem
	 */
	public static void cause() {
		Main.print(PROBLEM_CAUSE);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			Main.print(PROBLEM_CAUSE_RESPONSE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice || choice <= 3) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			Main.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				Main.solution();
				break;
			case 2:
				Main.matter();
				break;
			case 3:
				Main.disagree();
				break;
			default:
		}
	}

	/*
	 * Why this problem matters
	 */
	public static void matter() {
		Main.print(PROBLEM_MATTER);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			Main.print(PROBLEM_MATTER_RESPONSE);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice || choice <= 3) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			Main.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				Main.solution();
				break;
			case 2:
				Main.cause();
				break;
			case 3:
				Main.disagree();
				break;
		}
	}

	/*
	 * Underrepresented students in CS major
	 */
	public static void problem() {
		Main.print(PROBLEM_STATEMENT);

		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		while (true) {
			Main.print(PROBLEM_MENU);
			str = sc.nextLine();

			try {
				choice = Integer.parseInt(str);

				if (1 <= choice && choice <= 2) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			Main.print(ERROR);
		}

		switch (choice) 
		{
			case 1:
				Main.cause();
				break;
			case 2:
				Main.matter();
				break;
			default:
		}
	}

	/*
	 * Welcome message of the Main
	 */ 
    public static void welcome() {
		Scanner sc = new Scanner(System.in); 
		String str;
		int choice;

		Main.print(WELCOME_MESSAGE);
		while (true) {
			Main.print(WELCOME_MENU);
			str = sc.nextLine();
			try {
				choice = Integer.parseInt(str);

				if (1 <= choice && choice <= 2) {
					break;
				}
			} catch (NumberFormatException e) {
				;
			}

			Main.print(ERROR);
		}

		if(choice == 1) {
			Main.problem();
		}

		System.exit(0);
    }

    public static void main(String[] args) {
    	Main.welcome();
    }
}