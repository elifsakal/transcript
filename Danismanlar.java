/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class Danismanlar extends BilgisayarMuhBolumu {
	/**
	 * Danismanlar icin kisisel bilgileri aliyoruz.
	 * @param ad bilgisi alinir
	 * @param soyAd bilgisi aliniR
	 * @param CAPACITY int veri tipinde bilgisi alinir
	 */
	private String ad;
	private String soyAd;
	private String EMail;
	private int CAPACITY=40;
	private int ogrSayisi=0;
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	/**
	 * @param ad d�nd�r�r
	 */
	public String getAd() {
		return ad;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd=soyAd;
	}
	/**
	 * @param soyAd d�nd�r�r
	 */
	public String getSoyAd() {
		return soyAd;
	}
	public void setEMail(String EMail) {
		this.EMail=EMail;
	}
	/**
	 * @param EMail d�nd�r�r
	 */
	public String getEMail() {
		return EMail;
	}
	/**
	 * Ogrenciler eklenir CAPACITY g�re art�r�l�r en fazla 40 kisi olucak sekilde
	 * @return true veya false d�nd�r�r.
	 */
	public boolean ogrEkle(Ogrenciler  ogrenci) {
		if(ogrSayisi < CAPACITY) {
			ogrList[ogrSayisi] = ogrenci;
			ogrSayisi++;
			System.out.println("��renciyi dan��mana ba�ar�l� bir �ekilde atad�n�z.");
			return true;
	     }
		else {
			System.out.println("Her dan��mana en fazla 40 ��renci eklenebilir. Kapasite doldu.");
		    return false;}
		}
	

}
