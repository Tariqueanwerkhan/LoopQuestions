import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // find the largest of the 3 numbers
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//        if(b > max) {
//            max = b;
//        }
//            if(c > max){
//                max = c;
//            }
//        System.out.println(max);


        //Alphabet case check ........
//        char ch = in.next().trim().charAt(0);
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }
//        else {
//            System.out.println("Uppercase");
//        }


        //fibonacci number .......
        /*
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
         */

        //counting occurrences .......
//        int n = 455565;
//        int count = 0;
//        while (n > 0){
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n/10;  // n / = 10
//        }
//        System.out.println(count);


        //reverse ......
//        int num = 352647;
//        int ans = 0;
//        while(num > 0){
//            int rem = num % 10;
//            num = num/10;
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);


        //Take input from user till user does nor press X or x
        // calculator .......
        int ans = 0;
        char op;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') ;
            System.out.print("     Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {
                ans = num1 % num2;
            } else if (op == 'x' || op == 'X')
                break;
            else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}