package First_Steps_In_Coding_Lab;
import java.util.Scanner;

public class projects 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projects = Integer.parseInt(scan.nextLine());
        int timeNeeded = projects * 3;
        scan.close();
        System.out.println(String.format("The architect %s will need %d hours to complete %d project/s.", name, timeNeeded, projects ));
    }
    
}
