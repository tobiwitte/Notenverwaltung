/**
 *
 */
public class Verwaltung
{
    /* Attribute */
    private Fach[] faecher = new Fach[12];
    /* Methoden */
    /** @param erstelle neues Fach
     */
    public void legeFachAn(String  name){
        if(name != null)
        {
            int index = 0;
            while(index < faecher.length)
            {
                if(faecher[index] == null)
                {
                    faecher[index] = new Fach(name);
                    break;
                }
                else
                {
                    index++;
                    if(index==12){
                        System.out.println("Es können maximal 12 Fächer angelegt werden!");
                        break;
                    }
                }
            }
        }
    }

    public void fuegeFachHinzu(Fach fach){
        if(fach != null)
        {
            int index = 0;
            while(index < faecher.length)
            {
                if(faecher[index] == null)
                {
                    faecher[index] = fach;
                    break;
                }
                else
                {
                    index++;
                    if(index==12){
                        System.out.println("Es können maximal 12 Fächer angelegt werden!");
                        break;
                    }
                }
            }
        }
    }

    /** @return liefert Namen der Faecher zurück
     */
    public void gibFaecherNamen(){
        for(int i=0; i<faecher.length; i++){
            if(faecher[i] != null){
                System.out.println(faecher[i].gibName());
            }
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
        int summe = 0;
        for(int i = 0; i < faecher.length;i++)
        {
            if(faecher[i] != null)
            {
                summe++;
            }
        }
        return summe;
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

