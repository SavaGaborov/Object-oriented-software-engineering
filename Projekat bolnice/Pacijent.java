package Entitetske;


/**
 * @author Win7
 * @version 1.0
 * @created 22-Jun-2015 10:28:59 PM
 */
public class Pacijent {

	private int Broj dana;
	private int Datum odlaska;
	private int Datum prijema;
	private int Datum rodj;
	private char Ime;
	private int Jmbg;
	private char Oboljenje;
	private char Pol;
	private char Prezime;
	private int Šifra pacijenta;
	private char Terapija;
	public Troškovi m_Troškovi;
	public Bolnica m_Bolnica;

	public Pacijent(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param Datum prijema
	 * @param Datum odlaska
	 */
	public int Broj dana ležanja(int Datum prijema, int Datum odlaska){
		return 0;
	}
}//end Pacijent