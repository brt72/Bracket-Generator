/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracket.generator;

/**
 *
 * @author brend
 */
public class MatchNode
{
    private final String matchID;
    private PersonNode person1 = null;
    private PersonNode person2 = null;
    private MatchNode prevMatch1 = null;
    private MatchNode prevMatch2 = null;
    private PersonNode winner = null;
    private boolean displayFlag = true;
    
    public MatchNode(String matchIDInput, PersonNode p1Input, PersonNode p2Input)
    {
        matchID = matchIDInput;
        person1 = p1Input;
        person2 = p2Input;
        if (person2.getName().equals("BYE"))
        {
            displayFlag = false;
            winner = person1;
        }
                
    }
    
    public MatchNode(String matchIDInput, MatchNode prevM1Input, MatchNode prevM2Input)
    {
        matchID = matchIDInput;
        prevMatch1 = prevM1Input;
        prevMatch2 = prevM2Input;
        if (prevMatch1.getWinner() != null)
        {
            person1 = prevMatch1.getWinner();
        }
        if (prevMatch2.getWinner() != null)
        {
            person2 = prevMatch2.getWinner();
            if (person2.getName().equals("BYE"))
            {
                displayFlag = false;
                winner = person1;
            }
        }
    }
    
    public MatchNode(MatchNode matchInput)
    {
        matchID = matchInput.getMatchID();
        person1 = matchInput.getPerson1();
        person2 = matchInput.getPerson2();
        prevMatch1 = matchInput.getPrevMatch1();
        prevMatch2 = matchInput.getPrevMatch2();
        winner = matchInput.getWinner();
        displayFlag = matchInput.isDisplayFlag();
    }

    /**
     * @return the matchID
     */
    public String getMatchID()
    {
        return matchID;
    }

    /**
     * @return the person1
     */
    public PersonNode getPerson1()
    {
        return person1;
    }

    /**
     * @return the person2
     */
    public PersonNode getPerson2()
    {
        return person2;
    }

    /**
     * @return the prevMatch1
     */
    public MatchNode getPrevMatch1()
    {
        return prevMatch1;
    }

    /**
     * @return the prevMatch2
     */
    public MatchNode getPrevMatch2()
    {
        return prevMatch2;
    }

    /**
     * @return the winner
     */
    public PersonNode getWinner()
    {
        return winner;
    }

    /**
     * @return the displayFlag
     */
    public boolean isDisplayFlag()
    {
        return displayFlag;
    }
}
