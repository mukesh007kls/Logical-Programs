import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Main m=new Main();
        m.fibonacciSeries();
    }
    public void fibonacciSeries(){
        System.out.println("Enter how many numbers in the fibonacci series to print:- ");
        int limit = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        System.out.print(num1 + " " + num2);
        int i = 2;
        while (i < limit) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(" " + temp);
            i++;
        }
    }

}