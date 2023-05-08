import java.util.ArrayList;

/**
 * class Persoon - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Persoon
{
    private ArrayList<Fles> collectie;
    
    public Persoon(){
        collectie = new ArrayList<>();
    }
    
    public void koop(Fles fles){
        collectie.add(fles);
    }
    
    public void drink(Fles fles, int hoeveelheid){
        fles.drink(hoeveelheid);
    }
    
    public void toonFlessen(){
        for(Fles fles: collectie){
            fles.getBeschrijving();
        }
    }
}
