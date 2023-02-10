import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    /** This function takes the total area of the solar panels as input and returns an ArrayList
    /* of the areas of the largest squares that can be made from the panels.
    */
    public static ArrayList<Integer> solution(int area)
    {
        ArrayList<Integer> result = new ArrayList<>();
        // Keep looping until there's no more area left
        while (area > 0)
        {
            // Find the largest square panel that can be made from the current area.
            int i = (int) Math.sqrt(area);
            // Add the area of the panel to the result
            result.add(i * i);
            // Subtract the area of the panel from the total area
            area -= i * i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        // Scanner to read the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total area of the solar panels: ");
        int area = scanner.nextInt();

        // Call the solution function to find the largest squares
        ArrayList<Integer> panels = solution(area);
        System.out.println("Largest squares: " + panels);
    }
}
