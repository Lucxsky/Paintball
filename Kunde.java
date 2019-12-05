
/**
 * Write a description of class Kunde here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kunde extends Mensch
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Kunde
     */
    public Kunde(int anzahl, int alter ,String vorname , String nachname)
    {
        // initialise instance variables
        super(anzahl,alter,vorname,nachname);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
