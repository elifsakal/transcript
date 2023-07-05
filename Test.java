import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
 * @since 31-12-2021
 *
 */

public class Test {
	static boolean a = true;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	    /**
	     * @param Ogrenci nesnesi oluþturulur.
	     */
	    Ogrenciler ogrenci = new Ogrenciler();
	    /**
	     * Klavyeden istenen deðerleri alýrýz
	     */
	    System.out.println("Öðrencinin ad soyad bilgisini giriniz: ");
	    ogrenci.setOgrAdSoyad(scanner.nextLine());
	    System.out.println("Öðrencinin numarasýný giriniz: ");
	    ogrenci.setOgrNumarasi(scanner.nextLine());
	    List<Ders> ders = new ArrayList<>();
         /**
          * H tuþuna basýlmadýðý sürece do nun içinde ders ve not ekleme yapýlýr.
          */
	    do {
	        System.out.println("Ders Ekleme Yapýlsýn mý? E veya H ");
	        String dersEklemeCevabi = scanner.next();
	        if ("E".equalsIgnoreCase(dersEklemeCevabi)) {
	            System.out.println("Dersin adýný giriniz: ");
	            String dersAdi = scanner.next();
	            Ders ders1 = new Ders();
	            ders1.setDersinAdi(dersAdi);
	            List<Notlar> notListesi = new ArrayList<>();
	            do {
	                System.out.println("Ders için not eklensin mi? E veya H ");
	                String cevp = scanner.next();
	                if ("E".equalsIgnoreCase(cevp)) {
	                    System.out.println("Notunuz nedir?");
	                    Notlar not = new Notlar();
	                    int temp = scanner.nextInt();
	                    not.setNot(temp);
	                    notListesi.add(not);
	                } 
	                else if ("H".equalsIgnoreCase(cevp)) {
	                    a = false;
	                }
	             } 
	            while (a);
	            a = true;
	            ders1.setDersNotlari(notListesi);
	            ders.add(ders1);
	            ogrenci.setOgrDersleri(ders);

	        } 
	        else if ("H".equalsIgnoreCase(dersEklemeCevabi)) {
	            a = false;
	        }
	    } while (a);
	    System.out.println(ogrenci.toString());
	}


}
