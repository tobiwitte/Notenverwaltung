/**
 *
 */
public class Fach
{
    /* Attribute */
    private final String name;
    private int notenziel;
    private Note[] noten;
    private int anzahlNoten;
    /* Konstruktoren */
    /**
     * Konstruktor für die Klasse Fach
     * @param Name
     */
    public Fach(String  name){
        this.name = name;
    }

    /* Methoden */
    /** @return liefert den Notendurchschnitt
     */
    public int gibNotendurchschnitt(){
        int sum = 0;
        for(int i=0; i<noten.length; i++){
            sum += noten[i].gibNote();
        }
        return sum/noten.length;
    }

    /** @return liefert die aktuelle Tendenz zurück
     */
    public int gibAktuelleTendenz(){
        return 0;
    }

    /** @param  muendliche Note
     */
    public void legeMuendlicheNoteAn(int  note){
       noten[anzahlNoten] = new muendlicheNote(note);
    }
    
    /** @param schriftliche Note 
     */
    public void legeSchriftlicheNoteAn(int  note){
        noten[anzahlNoten] = new schriftlicheNote(note);
    }

    /** @return liefert name 
     */
    public String gibName(){
        
        return this.name;
    }

    /** @return liefert notenziel 
     */
    public int gibNotenziel(){
        //TODO gegebenenfalls ueberarbeiten
        return this.notenziel;
    }

    /** setzt notenziel 
     */
    public void setzeNotenziel(int  pNotenziel){
        //TODO gegebenenfalls ueberarbeiten
        this.notenziel = pNotenziel;
    }

    /** @return liefert die Differenz zwischen 
     * Notenziel und aktuellem Notendurchschnitt
     */
    public int gibDifferenz(){
        return 0;
    }

    

}//Ende Klasse: Fach

