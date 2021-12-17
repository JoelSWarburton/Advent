import java.util.Scanner;
import java.nio.file.Paths;
public class Day1_Part1 {

    public static void main(String args[]) {
        int increaseCount = 0;

        try(Scanner scan = new Scanner(Paths.get("/home/joel/IdeaProjects/advent/src/input"))) {
            int previousDepth = 0;

            //read file
            while(scan.hasNextLine()) {

                int currentDepth = Integer.valueOf(scan.nextLine());
                System.out.println("The numbers are previous: " + previousDepth + " and current: " + currentDepth);

                //only count the increases. first if handles for no previous depth
                if(previousDepth == 0) {
                    //ignore the initial depth count
                }
                else if(previousDepth < currentDepth) {

                    increaseCount++;
                    System.out.println(increaseCount);
                }

                //update the previous depth for the next loop
                previousDepth = currentDepth;
            }


        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("The number of increases is: " + increaseCount);
    }
}
