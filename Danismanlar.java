/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
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
	 * @param ad döndürür
	 */
	public String getAd() {
		return ad;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd=soyAd;
	}
	/**
	 * @param soyAd döndürür
	 */
	public String getSoyAd() {
		return soyAd;
	}
	public void setEMail(String EMail) {
		this.EMail=EMail;
	}
	/**
	 * @param EMail döndürür
	 */
	public String getEMail() {
		return EMail;
	}
	/**
	 * Ogrenciler eklenir CAPACITY göre artýrýlýr en fazla 40 kisi olucak sekilde
	 * @return true veya false döndürür.
	 */
	public boolean ogrEkle(Ogrenciler  ogrenci) {
		if(ogrSayisi < CAPACITY) {
			ogrList[ogrSayisi] = ogrenci;
			ogrSayisi++;
			System.out.println("Öðrenciyi danýþmana baþarýlý bir þekilde atadýnýz.");
			return true;
	     }
		else {
			System.out.println("Her danýþmana en fazla 40 öðrenci eklenebilir. Kapasite doldu.");
		    return false;}
		}
	

}
