package First_Steps_In_Coding_Lab;

import java.util.Scanner;

public class cm 
{
    public static void main(String[] args)
    {
        double inches, cm;
        Scanner scanner = new Scanner(System.in);
        inches = Double.parseDouble(scanner.nextLine());
        cm = inches * 2.54;
        System.out.println(cm);
        scanner.close();

    }    
}
