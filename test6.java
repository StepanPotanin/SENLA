import java.util.Scanner;
 
public class test6 {
 
    public static void main(String[] args) {
	System.out.println("������� ������");
	Scanner in = new Scanner(System.in);
	String input = in.nextLine();
	String result = input.replaceAll("\\d", "");
	System.out.println("��� ���� ��� ������ �������� ���:");
	System.out.println(result);
   }
	
}