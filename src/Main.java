import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Main m=new Main();
        //m.fibonacciSeries();
        m.primeNumber();
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
    public void primeNumber(){
        System.out.println("Enter the number to check:- ");
        int num= sc.nextInt();
        int temp=num/2;
        int count=1;
        if(num==0||num==1){
            System.out.println(num+" is not a prime");
        }else{
            for (int i = 2; i <=temp ; i++) {
                if(num%i==0){
                    count++;
                }
            }
            if(count<=2){
                System.out.println(num+" is a prime number");
            }else{
                System.out.println(num+" is not a prime number");
            }
        }
    }

}