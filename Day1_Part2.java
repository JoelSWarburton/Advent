import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Day1_Part2 {

    public static void main(String args[]) {

        ArrayList<Integer> depths = new ArrayList<>();


        //scan file into array
        try (Scanner scan = new Scanner(Paths.get("/home/joel/IdeaProjects/advent/src/input"));) {

            while (scan.hasNextLine()) {
                depths.add(Integer.valueOf(scan.nextLine()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        //loop through array and check for changes in the windows sums.
        int count = 0; //counter for increased sums
        int previousSum = 0;
        for (int i = 0; i < depths.size() - 2; i++) {
            int currentSum = depths.get(i) + depths.get(i + 1) + depths.get(i + 2);
            //System.out.println("prev: " + previousSum + " cur:" + currentSum);
            if (previousSum == 0) {
                //do nothing
            } else if (previousSum < currentSum) {
                count++;
                //System.out.println(count);
            }
            previousSum = currentSum;
        }
        System.out.println("Total increases: " + count);
    }
}

