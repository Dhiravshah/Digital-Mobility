import java.util.Scanner;
public class Uppercase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String fullName = sc.nextLine();
        String firstName= fullName.split(" ")[0];
        String lastName= fullName.split(" ")[1];
        System.out.println("Your Name is " +firstName+ " " +lastName.toUpperCase());
    }
}