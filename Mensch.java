
public abstract class Mensch
{
    private int alter;
    private String vorname;
    private String nachname;
    
    
    
    public Mensch(int anzahl, int alter ,String vorname , String nachname)
    {
        // initialise instance variables
        setAlter(alter);
        setVorname(vorname);
        setNachname(nachname);
    }
    
    private void setAlter(int alter)
    {
        this.alter = alter;
    }
    
    private int getAlter()
    {
        return this.alter;
    }
    
    private void setVorname(String vorname)
    {
        this.vorname = vorname;
    }
    
    private String getVorname()
    {
        return this.vorname;
    }
    
    private void setNachname(String nachname)
    {
        this.nachname = nachname;
    }
    
    private String getNachname()
    {
        return this.nachname;
    }
}
