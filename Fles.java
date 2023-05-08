
/**
 * class Fles - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Fles
{
    private int capaciteit;
    private int inhoud;
    private String beschrijving;
    private boolean gesloten;
    
    public Fles(int capaciteit, String beschrijving){
        this.capaciteit = capaciteit;
        this.inhoud = capaciteit;
        this.beschrijving = beschrijving;
        this.gesloten = true;
    }
    
    public Fles(){
        this(750, "wijn");
    }
    
    public void setBeschrijving(String beschrijving){
        this.beschrijving = beschrijving;
    }
    
    public String getBeschrijving(){
        return beschrijving;
    }
    
    public boolean getGesloten(){
        return gesloten;
    }
    
    public void openen(){
        gesloten = false;
    }
    
    public void drink(int hoeveelheid){
        if(!gesloten && inhoud > hoeveelheid){
            inhoud -= hoeveelheid;
        }
        else{
            System.out.println("Deze handeling kan niet gebeuren");
        }
    }
}
