package First_Steps_In_Coding_Lab;
import java.util.Scanner;


public class pet_shop 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double dogFood = Integer.parseInt(scan.nextLine());
        double catFood = Integer.parseInt(scan.nextLine());
        scan.close();
        double dogFoodPrice = 2.50;
        double catFoodPrice = 4;
        double finalPrice = (dogFood * dogFoodPrice) + (catFood * catFoodPrice);
        System.out.println(String.format("%.1f lv", finalPrice));
    }
    
}
