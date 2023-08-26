package task3;


	import java.util.Scanner;

	class Question {
	    String question;
	    String[] options;
	    int correctOption;

	    public Question(String question, String[] options, int correctOption) {
	        this.question = question;
	        this.options = options;
	        this.correctOption = correctOption;
	    }
	}

	public class QuizApplication {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int score = 0;
	        
	        Question[] questions = {
	            new Question("What is the capital of France?", new String[]{"A) London", "B) Paris", "C) Berlin", "D) Madrid"}, 1),
	            new Question("Which planet is known as the 'Red Planet'?", new String[]{"A) Earth", "B) Mars", "C) Jupiter", "D) Venus"}, 1),
	            new Question("What is the chemical symbol for the element 'Gold'?", new String[]{"A) Go", "B) Gl", "C) Gd", "D) Au"}, 3)
	        };
	        
	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("Question " + (i + 1) + ": " + questions[i].question);
	            for (String option : questions[i].options) {
	                System.out.println(option);
	            }
	            
	            System.out.print("Enter your choice (A/B/C/D): ");
	            String userChoice = scanner.nextLine().toUpperCase();
	            
	            if (userChoice.equals("A") || userChoice.equals("B") || userChoice.equals("C") || userChoice.equals("D")) {
	                int userAnswer = userChoice.charAt(0) - 'A';
	                if (userAnswer == questions[i].correctOption) {
	                    System.out.println("Correct!\n");
	                    score++;
	                } else {
	                    System.out.println("Incorrect!\n");
	                }
	            } else {
	                System.out.println("Invalid choice. Skipping to the next question.\n");
	            }
	        }
	        
	        System.out.println("Quiz completed! Your score: " + score + " out of " + questions.length);
	        scanner.close();
	    }
	}

