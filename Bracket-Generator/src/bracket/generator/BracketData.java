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
public class BracketData
{
    int size;
    int levels;
    MatchNode headMatchNode;
    ArrayList<PersonNode> personList;
    
    public BracketData(ArrayList<PersonNode> inputList)
    {
        personList = inputList;
        double iterator = 1, potentialSize, listSize = (double)personList.size();
        boolean sizeFlag = true;
        while(sizeFlag)
        {
            potentialSize = Math.pow(2,iterator);
            if (potentialSize >= listSize)
            {
                size = (int) potentialSize;
                levels = (int) iterator;
                sizeFlag = false;
            }
            iterator++;
        }
        while (listSize != (double)size)
        {
            personList.add(new PersonNode("BYE", (int)listSize));
            listSize = (double)personList.size();
        }
        headMatchNode = GenerateOrder();
    }
    
    public MatchNode GenerateOrder()
    {
        return new MatchNode("A", GenerateMatchSet(levels-1, 1),GenerateMatchSet(levels-1, 2));
    }
    
    public MatchNode GenerateMatchSet(int level, int seed)
    {
        if (level > 0)
        {
            int currentLevelPower = (int) Math.pow(2, levels - level);
            return new MatchNode("A", GenerateMatchSet(levels-1, seed),GenerateMatchSet(levels-1, currentLevelPower-seed));
        }
        else
        {
            int currentLevelPower = (int) Math.pow(2, levels);
            return new MatchNode("A", personList.get(seed-1), personList.get(currentLevelPower-seed-1));
        }
    }
   
    
}
