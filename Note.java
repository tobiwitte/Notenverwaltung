/**
*
*/
public abstract class Note 
{
  /* Attribute */
	protected final int wert;
  /* Konstruktoren */
  /**  */
  public Note(int  wert){
      this.wert = wert;
  }

  /* Methoden */
  /** @return liefert note
*/
  protected int gibNote(){
    //TODO gegebenenfalls ueberarbeiten
    return this.wert;
  }

}//Ende Klasse: Note

