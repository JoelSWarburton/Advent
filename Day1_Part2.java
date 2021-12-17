import java.util.Scanner;
import java.nio.file.Paths;


public class Day1_Part2 {

    public static void main(String args[]) {

        try (Scanner scan = new Scanner(Paths.get("/home/joel/IdeaProjects/advent/scr/input"));) {

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());

            }




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

