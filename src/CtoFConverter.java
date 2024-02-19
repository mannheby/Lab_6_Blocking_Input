import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        System.out.print("Enter the temperature in Celsius: ");
        if(in.hasNextDouble())
        {
            celsius = in.nextDouble();
            in.nextLine();
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("The temperature in fahrenheit is " + fahrenheit);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid temperature.");
        }

    }
}