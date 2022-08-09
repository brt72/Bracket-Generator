package bracket.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brend
 */
public class ListGenerator
{
    Scanner fileScanner;
    
    public ArrayList<PersonNode> GenerateList(String fileName)
    {
        String person;
        int counter = 1;
        try
        {
            Path filePath = Paths.get(fileName);
            System.out.println(filePath);
            fileScanner = new Scanner(filePath);
            System.out.println(fileScanner);
            ArrayList<PersonNode> personList = new ArrayList<>();
            while(fileScanner.hasNextLine())
            {
                person = fileScanner.nextLine();
                personList.add(new PersonNode(person, counter));
                counter++;
            }
            return personList;
        } 
        catch (IOException ex)
        {
            System.out.println("Invalid List. Please Try Again");
            return null;
        }
        
    }
}
