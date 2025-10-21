import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // Problem 1

    for (int i = 1; i <= 25; i += 2)
    {

        System.out.println( i + " ");


    }

    // Problem 2

    int counter = 0; 

   for (int i = 17; i <= 75; i++)
    {
        if (counter % 10 == 9)
        {

         System.out.println( i + " " );

        }
        else 
        {
            System.out.println( i + " " );

        }

        counter++;
    }

  }
}
