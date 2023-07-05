import java.util.List;
/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */

public class Ders extends BilgisayarMuhBolumu {

		private String DersinAdi;
		private List<Notlar> dersNotlari;

		public Ders() {
		}
		/**
		 * Ders adi ve ders notlari alinir
		 * @param DersinAdi ile b�l�m�n derslerini alir
		 * @param dersNotlari ile notlar� listede tutar
		 */
		public Ders(String DersinAdi, List<Notlar> dersNotlari) {
		    this.DersinAdi = DersinAdi;
		    this.dersNotlari = dersNotlari;
		}
		/**
		 * @return DersinAdi d�nd�r�r
		 */
         public String getDersinAdi() {
		    return DersinAdi;
		}
        /**
         * 
         * @return dersNotlari d�nd�r�r
         */
		public List<Notlar> getDersNotlari() {
		    return dersNotlari;
		}
		/**
		 * @param DersinAdini set ile cagirilir
		 */
		public void setDersinAdi(String DersinAdi) {
		    this.DersinAdi = DersinAdi;
		}
		/**
		 * @param DersNotlari set cagirilir
		 */
		public void setDersNotlari(List<Notlar> dersNotlari) {
		    this.dersNotlari = dersNotlari;
		}

		@Override
		public String toString() {
		    return getDersinAdi() + " " + getDersNotlari();
		}
	}

