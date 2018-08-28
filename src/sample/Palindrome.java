package sample;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        int r, s = 0, temp;

        // int n=1212121;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num");
        int n = sc.nextInt();

        temp=n;
        while (n > 0)
        {
            r = n % 10;
            s = s * 10 + r;
            //
            n = n / 10;
        }
        System.out.println(s);
        if (temp == s)

            System.out.println("palindrome");

        else

            System.out.println("not a palindrome");
    }

}