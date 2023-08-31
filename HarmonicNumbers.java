import java.util.Scanner;

public class HarmonicNumbers{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number;
        System.out.println("Please write a number for n: ");
        number=input.nextInt();
        double result=0;

        for (int i =1; i <= number; i++) {
            result += (1.0/i);   
        }  
        System.out.println(result);
    }
}