/**
*
*/
public class Verwaltung 
{
  /* Attribute */
	private Fach[] fach;
	private int anzahlFaecher;
  /* Methoden */
  /** @param erstelle neues Fach
*/
  public void legeFachAn(String  name){
      fach[anzahlFaecher] = new Fach(name);
  }

  /** @return liefert Namen der Faecher zurück
*/
  public void gibFaecherNamen(){
      for(int i=0; i<fach.length; i++){
          String name = fach[i].gibName();
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

}//Ende Klasse: Verwaltung

