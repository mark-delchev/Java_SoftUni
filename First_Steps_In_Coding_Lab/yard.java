package First_Steps_In_Coding_Lab;
import java.util.Scanner;
public class yard 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double squareMeters = Double.parseDouble(scan.nextLine());
        double price = squareMeters * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        scan.close();
        System.out.println(String.format("The final price is: %.2f lv.", finalPrice));
        System.out.println(String.format("The discount is: %.2f lv.", discount));

    }
    
}
