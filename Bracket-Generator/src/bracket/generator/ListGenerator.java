package bracket.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brend
 */
public class ListGenerator
{
    Scanner fileScanner;
    
    public ArrayList<PersonNode> GenerateList(String fileName) throws IOException
    {
        String person;
        int counter = 1;
        Path filePath = Paths.get(fileName);
        fileScanner = new Scanner(filePath);
        ArrayList<PersonNode> personList = new ArrayList<>();
        while(fileScanner.hasNextLine())
        {
            person = fileScanner.nextLine();
            personList.add(new PersonNode(person, counter));
            counter++;
        }
        return personList;
    }
}
