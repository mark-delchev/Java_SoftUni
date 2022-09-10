package First_Steps_In_Coding_Lab;
import java.util.Scanner;

public class triangle 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int area = a * b;
        System.out.println(area);

    }    
}
