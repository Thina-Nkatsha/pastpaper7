public class SpeedingFines
{
    public static void main(String[] args)
    {
        // Two dimensional array containing the speeding fines
        int[][] fines =
        {
            {128, 135, 139}, // JHB
            {155, 129, 175}, // DBN
            {129, 130, 185}, // CTN
            {195, 155, 221}  // PE
        };

        // Display the speeding fines report
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("*****************************");
        System.out.println("          JAN   FEB   MAR");
        System.out.println("JHB       " + fines[0][0] + "   " + fines[0][1] + "   " + fines[0][2]);
        System.out.println("DBN       " + fines[1][0] + "   " + fines[1][1] + "   " + fines[1][2]);
        System.out.println("CTN       " + fines[2][0] + "   " + fines[2][1] + "   " + fines[2][2]);
        System.out.println("PE        " + fines[3][0] + "   " + fines[3][1] + "   " + fines[3][2]);

        // Variables for highest and lowest fines
        int highest = fines[0][0];
        int lowest = fines[0][0];

        // Find the highest and lowest fines
        for (int row = 0; row < fines.length; row++)
        {
            for (int column = 0; column < fines[row].length; column++)
            {
                if (fines[row][column] > highest)
                {
                    highest = fines[row][column];
                }

                if (fines[row][column] < lowest)
                {
                    lowest = fines[row][column];
                }
            }
        }

        // Find the three highest fines
        int first = 0;
        int second = 0;
        int third = 0;

        for (int row = 0; row < fines.length; row++)
        {
            for (int column = 0; column < fines[row].length; column++)
            {
                int current = fines[row][column];

                if (current > first)
                {
                    third = second;
                    second = first;
                    first = current;
                }
                else if (current > second)
                {
                    third = second;
                    second = current;
                }
                else if (current > third)
                {
                    third = current;
                }
            }
        }

        // Display statistics
        System.out.println();
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("*****************************");
        System.out.println("Highest speeding fine: " + highest + "km");
        System.out.println("Lowest speeding fine: " + lowest + "km");

        System.out.println();
        System.out.println("THREE HIGHEST SPEEDING FINES");
        System.out.println("*****************************");
        System.out.println("1. " + first + "km");
        System.out.println("2. " + second + "km");
        System.out.println("3. " + third + "km");
    }
}
