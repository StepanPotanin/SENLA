import java.util.Scanner;
 
public class test5 {
 
    public static void main(String[] args) {
	System.out.println("Введите слово для проверки на палиндромность");
	Scanner in = new Scanner(System.in);
	String Word = in.nextLine();
	String droW = reverseByStringBuilder(Word);
	System.out.println("Это слово наоборот: " + droW);
		if (Word.equalsIgnoreCase(droW) == true){
			System.out.println("Это слово является палиндромом");
		}
		else System.out.println("Это слово НЕ является палиндромом");
    }

    public static String reverseByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    } 
}