import java.util.List;
/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
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
		 * @param DersinAdi ile bölümün derslerini alir
		 * @param dersNotlari ile notlarý listede tutar
		 */
		public Ders(String DersinAdi, List<Notlar> dersNotlari) {
		    this.DersinAdi = DersinAdi;
		    this.dersNotlari = dersNotlari;
		}
		/**
		 * @return DersinAdi döndürür
		 */
         public String getDersinAdi() {
		    return DersinAdi;
		}
        /**
         * 
         * @return dersNotlari döndürür
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

