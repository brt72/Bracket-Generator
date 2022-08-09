/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracket.generator;

import java.util.ArrayList;

/**
 *
 * @author brend
 */
public class BracketGenerator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int iterator;
        PersonNode selectedPerson;
        String listname = "test.txt";
        ListGenerator listgenerator = new ListGenerator();
        ArrayList<PersonNode> testlist = listgenerator.GenerateList(listname);
        if (testlist != null)
        {
            int people = testlist.size();
            for(iterator = 0; iterator < people; iterator++)
            {
                selectedPerson = testlist.get(iterator);
                System.out.println(selectedPerson.getName());
                System.out.println(selectedPerson.getSeed());
            }
        }
                
    }
    
}
