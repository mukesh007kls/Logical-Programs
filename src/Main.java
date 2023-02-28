import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Main m = new Main();
        //m.fibonacciSeries();
        //m.primeNumber();
        // m.reverseNumber();
        //m.perfectNumber();
        m.couponNumbers();
    }

    public void fibonacciSeries() {
        System.out.println("Enter how many numbers in the fibonacci series to print:- ");
        int numberOfCoupon = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        System.out.print(num1 + " " + num2);
        int i = 2;
        while (i < numberOfCoupon) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(" " + temp);
            i++;
        }
    }

    public void primeNumber() {
        System.out.println("Enter the number to check:- ");
        int num = sc.nextInt();
        int temp = num / 2;
        int count = 1;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime");
        } else {
            for (int i = 2; i <= temp; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }

    public void reverseNumber() {
        System.out.println("Enter number to reverse:- ");
        int num = sc.nextInt();
        int temp = 0;
        int reverse = 0;
        while (num != 0) {
            temp = num % 10;
            reverse = (reverse * 10) + temp;
            num = num / 10;
        }
        System.out.println(reverse);
    }

    public void perfectNumber() {
        System.out.println("Enter a number:-");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }

    public void couponNumbers() {
        System.out.println("Enter the number of coupons:-");
        int numberOfCoupon = sc.nextInt();
        int allCouponNumbers[] = new int[numberOfCoupon];
        System.out.println("Enter all the coupon numbers:-");
        for (int i = 0; i < numberOfCoupon; i++) {
            allCouponNumbers[i] = sc.nextInt();
        }
        int numberOfMatches = 0;
        int randomNumbersCount = 0;
        Random r = new Random();
        while (numberOfMatches < numberOfCoupon) {
            randomNumbersCount++;
            int randomCouponNumber = r.nextInt(20);
            for (int j = 0; j < numberOfCoupon; j++) {
                if (allCouponNumbers[j] == randomCouponNumber) {
                    System.out.print(allCouponNumbers[j] + " ");
                    numberOfMatches++;
                    allCouponNumbers[j] = -2;
                }
            }
        }
        System.out.println();
        System.out.println("Number of random coupon numbers generated are:- " + randomNumbersCount);
    }

}