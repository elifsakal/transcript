import java.util.List;
/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class Ogrenciler extends Danismanlar {
	/**
	 *  @param ogrAdSoyad ile Ogrenciler in ki�isel bilgilerini al�r.
	 *  @param ogrNumarasi ile Ogrenciler in ki�isel bilgilerini al�r.
	 *  @param OgrDersleri ArrayList ile ��rencinin derslerini listede tutar.
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
	     * @return ogrAdSoyad d�nd�r�r
	     */
	    public String getOgrAdSoyad() {
	        return ogrAdSoyad;
	    }

	    /**
	     * @param ogrAdSoyad set ile �a��r�r
	     */
	    public void setOgrAdSoyad(String ogrAdSoyad) {
	        this.ogrAdSoyad = ogrAdSoyad;
	    }

	    /**
	     * @return ogrNumarasi d�nd�r�r
	     */
	    public String getOgrNumarasi() {
	        return ogrNumarasi;
	    }

	    /**
	     * @param ogrNumarasi set ile �a��r�r
	     */
	    public void setOgrNumarasi(String ogrNumarasi) {
	        this.ogrNumarasi = ogrNumarasi;
	    }

	    /**
	     * @return ogrDersleri d�nd�r�r
	     */
	    public List<Ders> getOgrDersleri() {
	        return ogrDersleri;
	    }

	    /**
	     * @param ogrDersleri set ile �a��r�r
	     */
	    public void setOgrDersleri(List<Ders> ogrDersleri) {
	        this.ogrDersleri = ogrDersleri;
	    }
        /**
         * 
         * @return temp ile ��rencinin Dersler ve Notlar bilgilerini d�nd�r�yor.
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
	        return "��renci: " + getOgrAdSoyad() + " Okul No: " + getOgrNumarasi() + getOgrninDersleri();
	    }
}