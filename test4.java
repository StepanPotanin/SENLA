import java.util.Scanner;
import java.util.Arrays;
 
public class test4 {
 
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // ��������� Scanner
	int array[] = new int[4];
	int count = 0;
	System.out.println ("������� ��������������� ����� Enter ������ ���������� �������� ('1' - ������ ��� '0' - ����)");
	for (int i = 0; i < 4; i++) {
        	array[i] = input.nextInt(); // 
    	}
	for (int i = 0; i < 4; i++) {
        	if (array[i] == 1) {
		count++;
		}
    	}
	System.out.println ("���������: "+ (count==2));
	
}
}