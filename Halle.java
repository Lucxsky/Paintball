
public class Halle
{
    
    private String oeffnungszeiten;

    
    public Halle(String oeffnungszeiten)
    {
        // initialise instance variables
        setOeffnungszeiten(oeffnungszeiten);
    }

    private void setOeffnungszeiten(String oeffnungszeiten)
    {
        this.oeffnungszeiten = oeffnungszeiten;
    }
    
    public String getOeffnungszeiten()
    {
        return this.oeffnungszeiten;
    }
}
