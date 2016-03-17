import java.util.Scanner;

public class MegaCalc_3 {
	
	static String MegaCalcVersionType = "Alpha";
	static double MegaCalcVersion = 0.2; 
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
	

	public void getNumber(String message){
		
	}
	
	public void getInput(String message){
		
	}
	
	public void displayMessage(String message){
		
	}

	public void userSelection(int option){
		
		switch(input){
		 case 1 :
			  doAdd()
			break;
		}
	}
	
	public static void promptUser(){
		System.out.println("Please select one of the following mathematical functions and enter it's corresponding number.");
		System.out.println("1. Add, 2. Subtract, 3. Divide, 4. Multiply, 5. Square Root, 6. Powers,\n7. Sine, 8. Cosine, 9. Tangent, 10. Factorial, 11. Reverse Number, 0. End MegaCalc");
		
		int input = 0;
		Scanner userinput = new Scanner(System.in);
		
		input = userinput.nextInt();
		double number_1, number_2;
		 switch (input) {
         	case 1:  input = 1;
         		nubmber_1 = getNumber ("Please enter the first number to add.");
         		System.out.println("Please enter the second number to add.");
         		number_2 = userinput.nextDouble();
         		System.out.println(number_1 + " + " + number_2 + " = " + addNumbers(number_1, number_2));  
         		break;
         	case 2:  input = 2;
         		System.out.println("Please enter the first number to subtract.");
         		number_1 = userinput.nextDouble();
         		System.out.println("Please enter the second number to subtract.");
         		number_2 = userinput.nextDouble();
         	 	System.out.println(number_1 + " - " + number_2 + " = " + subtractNumbers(number_1, number_2));
                break;
         	case 3:  input = 3;
         		System.out.println("Please enter the first number to devide.");
         		number_1 = userinput.nextDouble();
         		System.out.println("Please enter the second number to devide.");
         		number_2 = userinput.nextDouble();
         		System.out.println(number_1 + " / " + number_2 + " = " + divideNumbers(number_1, number_2));
                break;
         	case 4:  input = 4;
         		System.out.println("Please enter the first number to multiply.");
         		number_1 = userinput.nextDouble();
         		System.out.println("Please enter the second number to multiply.");
         		number_2 = userinput.nextDouble();
         		System.out.println(number_1 + " * " + number_2 + " = " + multiplyNumbers(number_1, number_2));
         		break;
         	case 5:  input = 5;
         		System.out.println("Please enter a number to find to square root of.");
         		number_1 = userinput.nextDouble();
         		System.out.println("The square root of " + number_1 + " is " + squareRoot(number_1));
                break;
         	case 6:  input = 6;
         		System.out.println("Please enter the first number to be a base.");
         		number_1 = userinput.nextDouble();
         		System.out.println("Please enter the second number to use as a exponent.");
         		number_2 = userinput.nextDouble();
         		System.out.println(number_1 + " to the power of " + number_2 + " = " + powerOfNumbers(number_1, number_2));
     			break;
         	case 7:  input = 7;
         		System.out.println("Please enter the first number to sign.");
         		number_1 = userinput.nextDouble();
         		System.out.println("The sign of " + number_1 + " is " + sineNumber(number_1));
                break;
         	case 8:  input = 8;
         		System.out.println("Please enter the adjacent number as the first Cosine number.");
         		number_1 = userinput.nextDouble();
         		System.out.println("Please enter the hypotenuse to use as the second Cosine number.");
         		number_2 = userinput.nextDouble();
         		System.out.println("The Cosine of " + number_1 + " and " + number_2 + " = " + CosineNumber(number_1, number_2));
                break;
         	case 9:  input = 9;
         		System.out.println("Please enter a number to find the tangent of.");
         		number_1 = userinput.nextDouble();
         		System.out.println("The Tangent of " + number_1 + " = " + tangentOfNumbers(number_1));
                break;
         	case 10:  input = 10;
         		System.out.println("Please enter a number to find the factorial of.");
         		number_1 = userinput.nextDouble();
         		System.out.println("The factorial of " + number_1 + " = " + factorialOfNumber(number_1));
                break;
         	case 11: input = 11;
         		System.out.println("Please enter a number to reverse.");
         		number_1 = userinput.nextDouble();
         		System.out.println("The opposite of " + number_1 + " = " + reverseNumber(number_1));
                break;
         	default: input = 0;
         		errorOut();
                break;
		 }
		 continueCalc();
	}// End of promptUser method
	
	public static double addNumbers(double number_1, double number_2){
		double sum = number_1 + number_2;
		return sum;
	}// End of addNumbers method
	
	public static double subtractNumbers(double number_1, double number_2){
		double sum = number_1 - number_2;
		return sum;
	}// End of subtractNumbers
	
	public static double divideNumbers(double number_1, double number_2){
		double sum = number_1 / number_2;
		return sum;
	}// End of devideNumbers
	
	public static double multiplyNumbers(double number_1, double number_2){
		double sum = number_1 * number_2;
		return sum;
	}// End of multiplyNumbers Method
	
	public static double powerOfNumbers(double number_1, double number_2){
		double sum = Math.pow(number_1, number_2);
		return sum;
	}// End of powerOfNumbers method
	
	public static double squareRoot(double number_1){
		double sum = Math.sqrt(number_1);
		return sum;
	}// End of squareRoot method
	
	public static double sineNumber(double number_1){
		double sum = Math.signum(number_1);
		return sum;
	}// End of signNumber method
	
	public static double CosineNumber(double number_1, double number_2){
		double sum = number_1 / number_2;
		return sum;
	}// End of cosignNumber method
	
	public static double tangentOfNumbers(double number_1){
		double sum = Math.tan(number_1);
		return sum;
	}// End of tangentOfNumbers method
	
	public static double factorialOfNumber(double number_1){
		double sum = 1;
		for(int i = 1; i <= number_1; i++){
			sum *= i;
		}
		return sum;
	}//End of factorialOfNumber method
	
	public static double reverseNumber(double number_1){
		double sum = number_1 * -1;
		return sum;
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