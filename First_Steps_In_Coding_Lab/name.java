package First_Steps_In_Coding_Lab;
import java.util.Scanner;

public class name 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = (scanner.nextLine());
        System.out.println(String.format("Hello, %s!", name));
        scanner.close();
    }

}
