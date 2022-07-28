package bracket.generator;

/**
 *
 * @author brend
 */
public class PersonNode
{
    private final String name;
    private final int seed;
    
    public PersonNode(String nameInput, int seedInput)
    {
        name = nameInput;
        seed = seedInput;
    }
    
    public PersonNode(PersonNode personInput)
    {
        name = personInput.getName();
        seed = personInput.getSeed();
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the seed
     */
    public int getSeed()
    {
        return seed;
    }
    
}
