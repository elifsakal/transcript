import java.util.*;
import java.text.*; 
/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
 * @since  31-12-2021
 */
public class Transcript extends Ogrenciler {
	
	 public static void main(String args[])
     {
		 /**
		  * @param scanner nesnesi ile ekrana girdi yazýyoruz
		  */
	   Scanner scanner = new Scanner(System.in);

     System.out.println("Lütfen hesaplanmasýný istediðiniz dönemi giriniz(ör:2019 Güz): ");
     String donem = scanner.nextLine();

     System.out.println("Lütfen "+donem+"'döneminde kayýtlý olduðunuz ders sayýsýný giriniz: ");
     int dersayisi = scanner.nextInt();

     /**
      * @param SinifAdi dersayisini index olarak alan liste yazýlýr
      * @param DersTanimi dersayisini index olarak alan liste yazýlýr
      * @param not dersayisini index olarak alan liste yazýlýr
      * @param kredi dersayisini index olarak alan liste yazýlýr
      * @param finalNotu dersayisini index olarak alan liste yazýlýr
      */
     String SinifAdi[] = new String[dersayisi];
     String DersTanimi[] = new String[dersayisi];
     String not[] = new String[dersayisi];
     float kredi[] = new float[dersayisi];
     double notu = 0;
     float finalNotu[] = new float[dersayisi];
     float toplamKredi = 0;
     float Kalýnan = 0;
     float Gecilen = 0;
     float toplamNotlar = 0;
     float gpa = 0;
     String durum = null;
     /**
      * dersayisi deðiþkeni ile kontrol ederek for ile bizden bilgiler alýr.
      */
     for(int i = 0; i < dersayisi; i++)
     {
         scanner.nextLine();
         System.out.println("Lütfen"+(i+1)+". dersinizi giriniz: ");
         SinifAdi[i] = scanner.nextLine();
         System.out.println("Lütfen"+(i+1)+". dersinizin açýklamasýný giriniz: ");
         DersTanimi[i] = scanner.nextLine();
         System.out.println("Lütfen"+(i+1)+". dersinizin kredisini giriniz: ");
         kredi [i] = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Lütfen"+(i+1)+". dersinizin notunu giriniz: ");
         not[i] = scanner.nextLine();

         if (not[i].equals ("A"))
         	notu= 4.00;
           else if (not[i].equals("A-"))
         	  notu= 3.67;
           else if (not[i].equals("B+"))
         	  notu = 3.33;
           else if (not[i].equals("B"))
         	  notu = 3.00;
           else if (not[i].equals ("B-"))
         	  notu = 2.67;
           else if (not[i].equals("C+"))
         	  notu = 2.33;
           else if (not[i].equals("C"))
         	  notu = 2.00;
           else if (not[i].equals ("D+"))
         	  notu = 1.33;
           else if (not[i].equals ("D"))
         	  notu = 1.00;
           else if (not[i].equals ("F"))
         	  notu = 0;
           else
             System.out.println ("Geçersiz Not");
         finalNotu[i] = (float) (notu * kredi[i]);
         toplamKredi += kredi[i];
         
         /**
          * Toplam notlarý alýr ve gpa ile iliþkilendirir. 
          */ 
         toplamNotlar += finalNotu[i];
             if (not[i].equals("F"))
             	Kalýnan = kredi[i];
             Gecilen = toplamKredi - Kalýnan;
             gpa = toplamNotlar / toplamKredi;

     }
     /**
      * Dersten geçip geçmeme durumunu if ile kontrol eder.
      * Ayrýca ekstra kredi alma durumunuzu görüntüler. 
      */
     if (gpa > 2.0) {
     	durum = "Dersten Geçtiniz";
     	if (gpa > 3.0 | gpa <3.49) {
     		durum = "Ekstra 3 kredi alabilirsiniz";   
     		
     	}
     	else if (gpa > 3.5) {
     		durum = "Ekstra 6 kredi alabilirsiniz";
    
     	}
     	else 
     		durum = "Ekstra kredi alamazsýnýz";
     	}
     else if (1.0 < gpa | gpa < 1.999)
     	durum = "Þartlý Geçtiniz";
     else
     	durum = "Dersten Kaldýnýz";

     System.out.println("Ders notu - "+donem+" dönemi");
     System.out.println("Transcript");

     System.out.println(String.format("%20s %7s %25s %7s %10s %7s %7s %10s %10s", "Sýnýf", "|", "Ders Tanýmý", "|", "Kredi", "|", "Not", "|", "Final Notu"));
     System.out.println(String.format("%s", "-------------------------------------------------------------------------------------------------------------------------------------"));
     for(int i = 0; i < dersayisi; i++)
     {
         DecimalFormat format = new DecimalFormat("#.#####");
         format.format(toplamKredi);
         format.format(Kalýnan);
         format.format(toplamNotlar);
         format.format(gpa);
         System.out.println(String.format("%20s %7s %-25s %7s %10s %7s %-7s %10s %-10s", SinifAdi[i], "|", DersTanimi[i], "|", kredi[i], "|", not[i], "|", finalNotu[i]));
     }
     System.out.println("Dönem Ýstatistiði - "+donem+" dönemi");
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));
     System.out.println(String.format("%40s %7s %25s", "", "|", "Kayýt Tarihinden Ýtibaren"));
     System.out.println(String.format("%40s %7s %25s", "", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Kredi GPA'sý:", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Alýnan", "|", toplamKredi));
     System.out.println(String.format("%40s %7s %25s", "Geçilen", "|", Gecilen));
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));     
     System.out.println(String.format("%40s %7s %25s", "GPA Hesaplamasý", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Toplam Notlar", "|", toplamNotlar));
     System.out.println(String.format("%40s %7s %25s", "/ Geçilen Derslerin GPA'sý", "|", toplamKredi));
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));
     System.out.println(String.format("%40s %7s %25s", "= GPA", "|", gpa));
     System.out.println(String.format("%40s %7s %25s", "Durum", "|", durum ));
 }

}


