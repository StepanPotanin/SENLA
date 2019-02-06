import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;

class test3 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите размер массива: ");
    int temp = 0;
    int size = input.nextInt(); // Считывание размера массива
    int array[] = new int[size]; // Создание массива int размера size
    System.out.println("Введите элементы массива (через Enter):");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();
    }
    
    System.out.print ("Введён следующий массив: ");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // Вывод полученного массива на экран
    }
    System.out.println();

    // Arrays.sort(array, Collections.reverseOrder()); 
	/*//Если задать тип массива как Integer, то так можно получить желаемый результат, 
	но так как в задании сказано "составить алгоритм", то тут будет пузырьковый метод сортировки
	выбор обусловлен тем, что ввод с клавиатуры не подразумевает большого размера массива, а
	пузырьковый метод работает быстрее метода быстрой сортировки при размерах массива менее 8-16 элементов*/
	for (int j = 0; j < size; j++) {
		for (int i = 0; i < size-1; i++) {
			if (array [i] < array[i+1]) {
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
	}
    
    System.out.print ("Отсортированный по убыванию массив: ");
    for (int i = 0; i < size; i++) {
        System.out.print (" " + array[i]); // Выводим на экран, полученный массив
    }
    
}
}

