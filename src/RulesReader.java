import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RulesReader {
    public static ArrayList<String> GetRulesAsArrayList(String path) throws FileNotFoundException {
        ArrayList<String> result = new ArrayList<>();

        // pass the path to the file as a parameter
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            result.add(sc.nextLine());

        return result;
    }
}
