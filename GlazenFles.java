import java.util.Random;

/**
 * class GlazenFles - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class GlazenFles extends Fles
{
    private boolean kapot;
    
    public GlazenFles(int capaciteit, String beschrijving){
        super(capaciteit, beschrijving);
        kapot = false;
    }
    
    public boolean getKapot(){
        return kapot;
    }
    
    public void vallen(){
        Random rg = new Random();
        kapot = rg.nextBoolean();
    }
}
