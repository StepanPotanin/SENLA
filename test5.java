import java.util.Scanner;
 
public class test5 {
 
    public static void main(String[] args) {
	System.out.println("������� ����� ��� �������� �� ��������������");
	Scanner in = new Scanner(System.in);
	String Word = in.nextLine();
	String droW = reverseByStringBuilder(Word);
	System.out.println("��� ����� ��������: " + droW);
		if (Word.equalsIgnoreCase(droW) == true){
			System.out.println("��� ����� �������� �����������");
		}
		else System.out.println("��� ����� �� �������� �����������");
    }

    public static String reverseByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    } 
}