import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class PowerOf2 {

public static void main(String[] args){
    System.out.println("Enter an integer");
    Scanner sc = new Scanner(System.in); 
    int number = sc.nextInt();
    if(number < 0){
        System.out.println("Number is too small");
    }
    else if(number > 32767)
    {
        System.out.println("Number is too large");
    }
    else{
        while(number%2 == 0){
            number = number/2;
        }
        if(number==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
    
}
