import java.util.Scanner;
class Salary
{
    public static void main(String[] args){
    System.out.println("Enter Number");
    Scanner sc  = new Scanner(System.in);
    int salary = sc.nextInt();
    int shift = sc.nextInt();
    if(salary > 8000){
        System.out.println("Salary too large");
    }
    else if(shift < 0){
        System.out.println("Shift too small");
    }
    else if(salary < 0){
        System.out.println("Salary too small");
    }
    else{
        double totalIncome = salary + salary * 0.02 * shift ;
        double savings = totalIncome - (0.5 * salary);
        System.out.println("Savings are :" +savings);
    }
    }

}