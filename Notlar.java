/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class Notlar extends BilgisayarMuhBolumu {
	/**
	 * @param Notlar ile not bilgilerini tutar.
	 */
        int Notlar;
	    public Notlar() {
	    }
	    
	    public Notlar(int Notlar) {
	        this.Notlar = Notlar;
	    }
	    /**
	     * @return Notlar d�nd�r�r.
	     */
        public int getNot() {
	        return Notlar;
	    }
        /**
	     * 
	     * @param Notlar set ile �a��r�r.
	     */
	    public void setNot(int Notlar) {
	        this.Notlar = Notlar;
	    }
        @Override
	    public String toString() {
	        return getNot() + " ";
	    }
}
