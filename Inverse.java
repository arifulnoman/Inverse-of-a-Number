package Inverse_of_a_Number;
import java.util.*;
public class Inverse {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i,count = 0;
        int number = n;
        while(number != 0)
        {
            number = number / 10;
            count++;
        }
        int[] num = new int[count+1];
        for(i = 1;i <= count;i++)
        {
            int digit = n % 10;
            num[digit] = i;
            n = n / 10;
        }
        for(i = count;i >= 1;i--)
        {
            System.out.print(num[i]);
        }

    }
}