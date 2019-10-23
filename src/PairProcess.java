import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum= num1 + num2;
        int pro=num1*num2;
        int aver=sum/2;
        if(sum >200){
            System.out.println("Sum: " + sum +"*");
            System.out.println("Product: " + pro);
            System.out.println("Average: " + aver);
        } else if (sum < 1000){
            System.out.println("Sum: " + sum +"~");
            System.out.println("Product: " + pro);
            System.out.println("Average: " + aver);
        }
    }

}