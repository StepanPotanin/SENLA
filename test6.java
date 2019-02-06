import java.util.Scanner;
 
public class test6 {
 
    public static void main(String[] args) {
	System.out.println("Введите строку");
	Scanner in = new Scanner(System.in);
	String input = in.nextLine();
	String result = input.replaceAll("\\d", "");
	System.out.println("Без цифр эта строка выглядит так:");
	System.out.println(result);
   }
	
}