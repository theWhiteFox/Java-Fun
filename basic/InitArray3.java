package A00Basic;

/**
 * @author Stephen
 */
public class InitArray3
{

   public static void main(String[] args)
   {

      if (args.length != 3)
      {
         System.out.printf("Error: Please re-enter the entire command, including%n"
                 + "an array size, initial value and increment.%n");
      } else
      {

         //get array size from first com argument
         int arrayLength = Integer.parseInt(args[0]);
         int[] array = new int[arrayLength];

         // get initial value and increment from cmd args
         int initialValue = Integer.parseInt(args[1]);
         int increment = Integer.parseInt(args[2]);

         // calculate value for each array element
         for (int counter = 0; counter < array.length; counter++)
         {
            array[counter] = initialValue + increment * counter;
         }

         System.out.printf("%s%8s%n", "Index", "Value");

         // display array index and value
         for (int counter = 0; counter < array.length; counter++)
         {
            System.out.printf("%5d%8d%n", counter, array[counter]);
         }
      }
   }
}
