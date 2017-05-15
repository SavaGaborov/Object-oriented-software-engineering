import Entitetske.Bolnica;
import Entitetske.Pacijent;

/**
 * @author Win7
 * @version 1.0
 * @created 22-Jun-2015 10:38:42 PM
 */
public class K_Prijem pacijenata {

	public G_Prijem pacijenata m_G_Prijem pacijenata;
	public Bolnica m_Bolnica;
	public Pacijent m_Pacijent;

	public K_Prijem pacijenata(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param Slobodan broj mesta
	 */
	public int Obaveštenje službenika o mogucnosti smeštanja pacijenta(int Slobodan broj mesta){
		return 0;
	}

	/**
	 * 
	 * @param Poruka
	 */
	public int Obaveštenje službenika o uspešnom unosu(char Poruka){
		return 0;
	}

	/**
	 * 
	 * @param Šifra pacijenta
	 * @param Ime
	 * @param Prezime
	 * @param Jmbg
	 * @param Datum rodjenja
	 * @param Pol
	 * @param Oboljenje
	 */
	public int Vracanje forme za unos pacijenta(int Šifra pacijenta, char Ime, char Prezime, int Jmbg, int Datum rodjenja, char Pol, char Oboljenje){
		return 0;
	}
}//end K_Prijem pacijenata