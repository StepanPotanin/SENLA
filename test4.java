import java.util.Scanner;
import java.util.Arrays;
 
public class test4 {
 
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // ќбъ€вл€ем Scanner
	int array[] = new int[4];
	int count = 0;
	System.out.println ("¬ведите последовательно через Enter четыре логических значени€ ('1' - истина или '0' - ложь)");
	for (int i = 0; i < 4; i++) {
        	array[i] = input.nextInt(); // 
    	}
	for (int i = 0; i < 4; i++) {
        	if (array[i] == 1) {
		count++;
		}
    	}
	System.out.println ("–езультат: "+ (count==2));
	
}
}