/**
 *
 */
public class Verwaltung
{
    /* Attribute */
    private Fach[] faecher = new Fach[12];
    private int anzahlFaecher = 0;
    /* Methoden */
    /** @param erstelle neues Fach
     */
    public void legeFachAn(String  name){
        if(anzahlFaecher <= faecher.length){
            faecher[anzahlFaecher] = new Fach(name);
            anzahlFaecher++;
        }
        else {
            System.out.println("Das Maximum von 12 Fächern ist erreicht!");
        }
    }

    /** @return liefert Namen der Faecher zurück
     */
    public void gibFaecherNamen(){
        for(int i=0; i<faecher.length; i++){
            String name = faecher[i].gibName();
            if(name != null){
                System.out.println(name);
            }
        }
    }

    /** @return liefert fach
     */
    public Fach gibFach(Fach  fach){
        return new Fach("Test");
    }

    /** @param erstelle neue Note
     */
    public void legeNoteAn(Fach  fach,int  wert,boolean  schriftlich){
        if(schriftlich==true)
        {
            fach.legeSchriftlicheNoteAn(wert);
        }
        else
        {
            fach.legeMuendlicheNoteAn(wert);
        }
    }

    /** @return liefert anzahlFaecher 
     */
    public int gibAnzahlFaecher(){
        //TODO gegebenenfalls ueberarbeiten
        return this.anzahlFaecher;
    }

    /** @param erstelle neues Notenziel
     */
    public void legeNotenzielFest(Fach  fach,int  notenziel){
    }

    public Fach gibFachAnStelle(int stelle)
    {
        if(stelle >= 0 && stelle < faecher.length)
        {
            return faecher[stelle];
        }
        return null;
    }
}//Ende Klasse: Verwaltung

