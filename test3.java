import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;

class test3 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("������� ������ �������: ");
    int temp = 0;
    int size = input.nextInt(); // ���������� ������� �������
    int array[] = new int[size]; // �������� ������� int ������� size
    System.out.println("������� �������� ������� (����� Enter):");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();
    }
    
    System.out.print ("����� ��������� ������: ");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // ����� ����������� ������� �� �����
    }
    System.out.println();

    // Arrays.sort(array, Collections.reverseOrder()); 
	/*//���� ������ ��� ������� ��� Integer, �� ��� ����� �������� �������� ���������, 
	�� ��� ��� � ������� ������� "��������� ��������", �� ��� ����� ����������� ����� ����������
	����� ���������� ���, ��� ���� � ���������� �� ������������� �������� ������� �������, �
	����������� ����� �������� ������� ������ ������� ���������� ��� �������� ������� ����� 8-16 ���������*/
	for (int j = 0; j < size; j++) {
		for (int i = 0; i < size-1; i++) {
			if (array [i] < array[i+1]) {
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
	}
    
    System.out.print ("��������������� �� �������� ������: ");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // ������� �� �����, ���������� ������
    }
    
}
}

