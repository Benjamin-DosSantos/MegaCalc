
public class JavaStringTests {
	public static void main(String args[]){
		System.out.println(methodA("Octaginal", "Bender"));
		System.out.println(methodB("New Jersey", "new jersey"));
		System.out.println(methodA("Metallica", "Lars"));
		System.out.println(methodB("Bergeron", "Bergeron"));
		System.out.println(methodA("renegade", "steel"));
		System.out.println(methodB("air", "crash"));
		System.out.println(methodA("aang", "spiderman"));
		System.out.println(methodB("tiger", "scream"));
		System.out.println(methodA("wind", "wind"));
	}// End of main Method
	
	public static String methodA(String a, String b){
		return b + methodB(a, b) + a;
	}
	
	public static String methodB(String x, String y){
		if(x.equals(y)) return y;
		return x.substring(x.length()/2);
	}
}// End of class
