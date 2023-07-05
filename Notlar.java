/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
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
	     * @return Notlar döndürür.
	     */
        public int getNot() {
	        return Notlar;
	    }
        /**
	     * 
	     * @param Notlar set ile çaðýrýr.
	     */
	    public void setNot(int Notlar) {
	        this.Notlar = Notlar;
	    }
        @Override
	    public String toString() {
	        return getNot() + " ";
	    }
}
