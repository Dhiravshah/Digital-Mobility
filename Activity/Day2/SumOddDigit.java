import java.util.Scanner;
public class SumOddDigit {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("Number is too small");
        }
        else if(number > 32767)
        {
            System.out.println("Number is too large");
        } 
        int sum = 0;
        while(number!=0){
           int digit= number%10;
           if(digit%2!=0)
            sum+=digit;
            number=number/10;
       
           
        }
        System.out.println("The sum of odd digits is "  +sum);

    }
}
