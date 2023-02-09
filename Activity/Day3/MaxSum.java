import java.util.Scanner;
public class MaxSum {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        if(i<0){
            System.out.println("Invalid Array");
            return;
        }
        int numbers[]= new int[i]; 
        for(int j=0; j<i ; j++){
            numbers[j]= sc.nextInt();
            if(numbers[j]<0){
                System.out.println("Invalid Input");
            }
        }
        int sumEven=0,sumOdd=0;
        for(int number:numbers){
            if(number%2==0){
                sumEven+=number;
            }
            else{
                sumOdd+=number;
            }
        }
        int maximum;
        if(sumEven>sumOdd){
            maximum=sumEven;
        }
        else{
            maximum=sumOdd;
        }
        System.out.println("Maximum Number is" +maximum);
    }
}
