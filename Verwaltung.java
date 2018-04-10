/**
 *
 */
public class Verwaltung
{
    /* Attribute */
    private List<Fach> faecher = new List<Fach>();
    /* Methoden */
    /** @param erstelle neues Fach
     */
    public void legeFachAn(String  name){
        if(name != null)
        {
            if(faecher.getLength()<12)
                faecher.append(new Fach(name));
            else
                System.out.println("Es können maximal 12 Fächer angelegt werden!");
        }
    }

    public void fuegeFachHinzu(Fach fach){
        if(fach != null)
        {
            if(faecher.getLength()<12)
                faecher.append(fach);
            else
                System.out.println("Es können maximal 12 Fächer angelegt werden!");
        }
    }

    /** @return liefert Namen der Faecher zurück
     */
    public void gibFaecherNamen(){
        faecher.toFirst();
        while(faecher.hasAccess()){
            System.out.println(faecher.getContent().gibName());
            faecher.next();
        }
    }

    /** @param erstelle neue Note
     */
    public void legeNoteAn(Fach  fach, int  wert, boolean  schriftlich){
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
        return faecher.getLength();
    }

    /** @param erstelle neues Notenziel
     */
    public void legeNotenzielFest(Fach  fach,int  notenziel){
    }

    public Fach gibFachAnStelle(int stelle)
    {
        // if(stelle >= 0 && stelle < faecher.length)
        // {
            // return faecher[stelle];
        // }
        return null;
    }
}//Ende Klasse: Verwaltung

