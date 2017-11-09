import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse VerwaltungTest.
 *
 * @author 
 * @version 
 */
public class VerwaltungTest
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public VerwaltungTest()
    {
    }

    /**
     *  Setzt die Festlegungen fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    protected void setUp()
    {
    }

    /**
     * Gibt die Test-Festlegungen wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    protected void tearDown()
    {
    }

    // Testmethoden
    @Test
    public void keineFaecher(){
        Verwaltung v = new Verwaltung();
        v.legeFachAn("Testfach");
        System.out.println("Pos. 0: "+v.gibFachAnStelle(0));
    }

    @Test
    public void ArrayVoll()
    {
        Verwaltung v = new Verwaltung();
        for(int i=0;i<13;i++){
            String name = "Testfach" + i;
            v.legeFachAn(name);
        }
        Fach fach = new Fach("Testfach x");
        v.fuegeFachHinzu(fach);
        System.out.println("Pos. 11 \t:\t neu erzeugtes Fach");
        System.out.println(v.gibFachAnStelle(11)+"\t:\t "+ fach);
    }
}

