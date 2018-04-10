/**
 *
 */
public class Fach
{
    /* Attribute */
    private final String name;
    private int notenziel;
    private List<Note> noten;
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
        noten.toFirst();
        while(noten.hasAccess()){
            sum += noten.getContent().gibNote();
            noten.next();
        }
        return sum/noten.getLength();
    }

    /** 
     * @return liefert die aktuelle Tendenz zurück
     */
    public int gibAktuelleTendenz(){
        // return noten[anzahlNoten].gibNote() - noten[anzahlNoten-1].gibNote();
        return 0;
    }

    /** @param  muendliche Note
     */
    public void legeMuendlicheNoteAn(int  note){
        noten.append(new muendlicheNote(note));
    }

    /** @param schriftliche Note 
     */
    public void legeSchriftlicheNoteAn(int  note){
        noten.append(new schriftlicheNote(note));
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
        return notenziel-this.gibNotendurchschnitt();
    }
}//Ende Klasse: Fach

