import java.util.Scanner;

class test1 {
	public static void main(String[] args) {
		System.out.println("Введите положительное число: ");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
    		if (max > 0) { 
    			System.out.println("От 1 до " + max + " имеются следующие простые числа: ");
    			for (int i=2;i<max;i++){
        			if(checkSimple(i))
            				System.out.println(i);
   	 		}				
		}
    		else 
    		System.out.println("Вы ввели отрицательное число");
	}

/*так называемый 6k-1 алгоритм вычисления простых чисел*/
 
	public static boolean checkSimple(int i){
    		if (i<=1)
        		return false;
    		else if (i <=3)
        		return true;
    		else if (i%2==0 || i %3 ==0)
        		return false;
    		int n = 5;
    		while (n*n <=i){
        		if (i % n ==0 || i % (n+2) == 0)
            			return false;
        		n=n+6;
    		}
    		return true;
	}
} 