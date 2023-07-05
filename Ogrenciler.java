import java.util.List;
/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class Ogrenciler extends Danismanlar {
	/**
	 *  @param ogrAdSoyad ile Ogrenciler in kiþisel bilgilerini alýr.
	 *  @param ogrNumarasi ile Ogrenciler in kiþisel bilgilerini alýr.
	 *  @param OgrDersleri ArrayList ile öðrencinin derslerini listede tutar.
	 */
	    private String ogrAdSoyad;
	    private String ogrNumarasi;
	    private List<Ders> ogrDersleri;

	    public Ogrenciler() {
	    }

	    public Ogrenciler(String ogrAdSoyad, String ogrNumarasi, List<Ders> ogrDersleri) {
	        this.ogrAdSoyad = ogrAdSoyad;
	        this.ogrNumarasi = ogrNumarasi;
	        this.ogrDersleri = ogrDersleri;
	    }

	    /**
	     * @return ogrAdSoyad döndürür
	     */
	    public String getOgrAdSoyad() {
	        return ogrAdSoyad;
	    }

	    /**
	     * @param ogrAdSoyad set ile çaðýrýr
	     */
	    public void setOgrAdSoyad(String ogrAdSoyad) {
	        this.ogrAdSoyad = ogrAdSoyad;
	    }

	    /**
	     * @return ogrNumarasi döndürür
	     */
	    public String getOgrNumarasi() {
	        return ogrNumarasi;
	    }

	    /**
	     * @param ogrNumarasi set ile çaðýrýr
	     */
	    public void setOgrNumarasi(String ogrNumarasi) {
	        this.ogrNumarasi = ogrNumarasi;
	    }

	    /**
	     * @return ogrDersleri döndürür
	     */
	    public List<Ders> getOgrDersleri() {
	        return ogrDersleri;
	    }

	    /**
	     * @param ogrDersleri set ile çaðýrýr
	     */
	    public void setOgrDersleri(List<Ders> ogrDersleri) {
	        this.ogrDersleri = ogrDersleri;
	    }
        /**
         * 
         * @return temp ile öðrencinin Dersler ve Notlar bilgilerini döndürüyor.
         */
	    public String getOgrninDersleri() {
	        String temp = "\nDersler:";
	        for (Ders l :  getOgrDersleri()) {
	            temp += "\n" + l.getDersinAdi();
	            temp += "\nNotlar:\n";
	            for (Notlar g : l.getDersNotlari()) {
	                temp += g.getNot() + " ";
	            }
	        }
	        return temp;
	    }

	    @Override
	    public String toString() {
	        return "Öðrenci: " + getOgrAdSoyad() + " Okul No: " + getOgrNumarasi() + getOgrninDersleri();
	    }
}