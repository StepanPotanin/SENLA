import java.util.Scanner;

class test2 {
	public static void main(String[] args) {
		System.out.println("Введите положительное число: ");
    		Scanner scanner = new Scanner(System.in);
    		int max = scanner.nextInt();
		if (max > 0) {
			String str = "0 1 ";
			int a = 0;
			int b = 1;
			System.out.println("До " + max + " имеются следующие числа Фибоначчи: ");
			System.out.println(Fibonacci(a,b,max, str));
		}
    		else 
    		System.out.println("Вы ввели отрицательное число");
	
	}	
	
	public static String Fibonacci(int a, int b, int max, String str) {
		if (a + b <= max){
			str = str +" "+ Integer.toString(a+b) +" ";
			b = b + a;
			a = b - a;
			str = Fibonacci(a, b, max, str);
		}
			return(str);
		
	}		
}


