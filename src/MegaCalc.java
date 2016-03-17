import java.util.Scanner;

public class MegaCalc {
	
	static String MegaCalcVersionType = "Alpha";
	static double MegaCalcVersion = 0.1; 
	static String errorMessage = "There seems to be an issue, please try agian later.";
	
	public static void main(String args[]){
		startCalc();
	}// End of main method
	
	public static void startCalc(){
		openingMessage();
		promptUser();
	}// End of startCalc method
	
	public static void openingMessage(){
		System.out.println("Welcome to MegaCalc " + MegaCalcVersionType + " v" + MegaCalcVersion);
	}// End of opening message method
	
	public static void promptUser(){
		System.out.println("Please select one of the following mathematical functions and enter it's corresponding number.");
		System.out.println("1. Add, 2. Subtract, 3. Divide, 4. Multiply, 5. Square Root, 6. Powers,\n7. Sine, 8. Cosine, 9. Tangent, 10. Factorial, 11. Reverse Number, 0. End MegaCalc");
		
		int input = 0;
		Scanner userinput = new Scanner(System.in);
		
		input = userinput.nextInt();
		
		 switch (input) {
         	case 1:  input = 1;
         		addNumbers();  
         		break;
         	case 2:  input = 2;
         	 	subtractNumbers();
                break;
         	case 3:  input = 3;
         		divideNumbers();
                break;
         	case 4:  input = 4;
         		multiplyNumbers();
         		break;
         	case 5:  input = 5;
         		squareRoot();
                break;
         	case 6:  input = 6;
     			powerOfNumbers();
     			break;
         	case 7:  input = 7;
         		sineNumber();
                break;
         	case 8:  input = 8;
         		CosineNumber();
                break;
         	case 9:  input = 9;
         		tangentOfNumbers();
                break;
         	case 10:  input = 10;
         		factorialOfNumber();
                break;
         	case 11: input = 11;
         		reverseNumber();
                break;
         	default: input = 0;
         		errorOut();
                break;
     }
	}// End of promptUser method
	
	public static void addNumbers(){
		System.out.println("Please enter the first number to add.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the second number to add.");
		double number_2 = userinput.nextDouble();
		double sum = number_1 + number_2;
		System.out.println(number_1 + " + " + number_2 + " = " + sum);
		continueCalc();
	}// End of addNumbers method
	
	public static void subtractNumbers(){
		System.out.println("Please enter the first number to subtract.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the second number to subtract.");
		double number_2 = userinput.nextDouble();
		double sum = number_1 - number_2;
		System.out.println(number_1 + " - " + number_2 + " = " + sum);
		continueCalc();
	}// End of subtractNumbers
	
	public static void divideNumbers(){
		System.out.println("Please enter the first number to devide.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the second number to devide.");
		double number_2 = userinput.nextDouble();
		double sum = number_1 / number_2;
		System.out.println(number_1 + " / " + number_2 + " = " + sum);
		continueCalc();
	}// End of devideNumbers
	
	public static void multiplyNumbers(){
		System.out.println("Please enter the first number to multiply.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the second number to multiply.");
		double number_2 = userinput.nextDouble();
		double sum = number_1 * number_2;
		System.out.println(number_1 + " * " + number_2 + " = " + sum);
		continueCalc();
	}// End of multiplyNumbers Method
	
	public static void powerOfNumbers(){
		System.out.println("Please enter the first number to be a base.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the second number to use as a exponent.");
		double number_2 = userinput.nextDouble();
		double sum = Math.pow(number_1, number_2);
		System.out.println(number_1 + " to the power of " + number_2 + " = " + sum);
		continueCalc();
	}// End of powerOfNumbers method
	
	public static void squareRoot(){
		System.out.println("Please enter a number to find to square root of.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		double sum = Math.sqrt(number_1);
		System.out.println("The square root of " + number_1 + " is " + sum);
		continueCalc();
	}// End of squareRoot method
	
	public static void sineNumber(){
		System.out.println("Please enter the first number to sign.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		double sum = Math.signum(number_1);
		System.out.println("The sign of " + number_1 + " is " + sum);
		continueCalc();
	}// End of signNumber method
	
	public static void CosineNumber(){
		System.out.println("Please enter the adjacent number as the first Cosine number.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		System.out.println("Please enter the hypotenuse to use as the second Cosine number.");
		double number_2 = userinput.nextDouble();
		double sum = number_1 / number_2;
		System.out.println("The Cosine of " + number_1 + " and " + number_2 + " = " + sum);
		continueCalc();
	}// End of cosignNumber method
	
	public static void tangentOfNumbers(){
		System.out.println("Please enter a number to find the tangent of.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		double sum = Math.tan(number_1);
		System.out.println("The Tangent of " + number_1 + " = " + sum);
		continueCalc();
	}// End of tangentOfNumbers method
	
	public static void factorialOfNumber(){
		System.out.println("Please enter a number to find the factorial of.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		double sum = 1;
		for(int i = 1; i <= number_1; i++){
			sum *= i;
		}
		System.out.println("The factorial of " + number_1 + " = " + sum);
		continueCalc();
	}//End of factorialOfNumber method
	
	public static void reverseNumber(){
		System.out.println("Please enter a number to reverse.");
		Scanner userinput = new Scanner(System.in);
		double number_1 = userinput.nextDouble();
		double sum = number_1 * -1;
		System.out.println("The opposite of " + number_1 + " = " + sum);
		continueCalc();
	}//End of reverseNumber method
	
	public static void closeCalc(){
		System.out.println("Are you sure you want to quit? 1. Yes, 0. No");
		Scanner input = new Scanner(System.in);
		if(input.nextInt() == 0){
			startCalc();
		}else{
			System.exit(0);
		}
	}// End of closeCalc method
	
	public static void errorOut(){
		System.out.println(errorMessage);
		System.out.println("Would you like to try again? 1. Yes, 0. No");
		Scanner input = new Scanner(System.in);
		if(input.nextInt() == 1){
			startCalc();
		}else{
			System.exit(0);
		}
	}// End of errorOut method
	
	public static void continueCalc(){
		System.out.println("Would you like to make another calculation? 1. Yes, 0. No");
		Scanner input = new Scanner(System.in);
		if(input.nextInt() == 1){
			startCalc();
		}else{
			closeCalc();
		}
	}//End of continueCalc method
}// End of class