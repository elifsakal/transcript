import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */

public class Test {
	static boolean a = true;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	    /**
	     * @param Ogrenci nesnesi olu�turulur.
	     */
	    Ogrenciler ogrenci = new Ogrenciler();
	    /**
	     * Klavyeden istenen de�erleri al�r�z
	     */
	    System.out.println("��rencinin ad soyad bilgisini giriniz: ");
	    ogrenci.setOgrAdSoyad(scanner.nextLine());
	    System.out.println("��rencinin numaras�n� giriniz: ");
	    ogrenci.setOgrNumarasi(scanner.nextLine());
	    List<Ders> ders = new ArrayList<>();
         /**
          * H tu�una bas�lmad��� s�rece do nun i�inde ders ve not ekleme yap�l�r.
          */
	    do {
	        System.out.println("Ders Ekleme Yap�ls�n m�? E veya H ");
	        String dersEklemeCevabi = scanner.next();
	        if ("E".equalsIgnoreCase(dersEklemeCevabi)) {
	            System.out.println("Dersin ad�n� giriniz: ");
	            String dersAdi = scanner.next();
	            Ders ders1 = new Ders();
	            ders1.setDersinAdi(dersAdi);
	            List<Notlar> notListesi = new ArrayList<>();
	            do {
	                System.out.println("Ders i�in not eklensin mi? E veya H ");
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
