import java.util.*;
import java.text.*; 
/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since  31-12-2021
 */
public class Transcript extends Ogrenciler {
	
	 public static void main(String args[])
     {
		 /**
		  * @param scanner nesnesi ile ekrana girdi yaz�yoruz
		  */
	   Scanner scanner = new Scanner(System.in);

     System.out.println("L�tfen hesaplanmas�n� istedi�iniz d�nemi giriniz(�r:2019 G�z): ");
     String donem = scanner.nextLine();

     System.out.println("L�tfen "+donem+"'d�neminde kay�tl� oldu�unuz ders say�s�n� giriniz: ");
     int dersayisi = scanner.nextInt();

     /**
      * @param SinifAdi dersayisini index olarak alan liste yaz�l�r
      * @param DersTanimi dersayisini index olarak alan liste yaz�l�r
      * @param not dersayisini index olarak alan liste yaz�l�r
      * @param kredi dersayisini index olarak alan liste yaz�l�r
      * @param finalNotu dersayisini index olarak alan liste yaz�l�r
      */
     String SinifAdi[] = new String[dersayisi];
     String DersTanimi[] = new String[dersayisi];
     String not[] = new String[dersayisi];
     float kredi[] = new float[dersayisi];
     double notu = 0;
     float finalNotu[] = new float[dersayisi];
     float toplamKredi = 0;
     float Kal�nan = 0;
     float Gecilen = 0;
     float toplamNotlar = 0;
     float gpa = 0;
     String durum = null;
     /**
      * dersayisi de�i�keni ile kontrol ederek for ile bizden bilgiler al�r.
      */
     for(int i = 0; i < dersayisi; i++)
     {
         scanner.nextLine();
         System.out.println("L�tfen"+(i+1)+". dersinizi giriniz: ");
         SinifAdi[i] = scanner.nextLine();
         System.out.println("L�tfen"+(i+1)+". dersinizin a��klamas�n� giriniz: ");
         DersTanimi[i] = scanner.nextLine();
         System.out.println("L�tfen"+(i+1)+". dersinizin kredisini giriniz: ");
         kredi [i] = scanner.nextInt();
         scanner.nextLine();
         System.out.println("L�tfen"+(i+1)+". dersinizin notunu giriniz: ");
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
             System.out.println ("Ge�ersiz Not");
         finalNotu[i] = (float) (notu * kredi[i]);
         toplamKredi += kredi[i];
         
         /**
          * Toplam notlar� al�r ve gpa ile ili�kilendirir. 
          */ 
         toplamNotlar += finalNotu[i];
             if (not[i].equals("F"))
             	Kal�nan = kredi[i];
             Gecilen = toplamKredi - Kal�nan;
             gpa = toplamNotlar / toplamKredi;

     }
     /**
      * Dersten ge�ip ge�meme durumunu if ile kontrol eder.
      * Ayr�ca ekstra kredi alma durumunuzu g�r�nt�ler. 
      */
     if (gpa > 2.0) {
     	durum = "Dersten Ge�tiniz";
     	if (gpa > 3.0 | gpa <3.49) {
     		durum = "Ekstra 3 kredi alabilirsiniz";   
     		
     	}
     	else if (gpa > 3.5) {
     		durum = "Ekstra 6 kredi alabilirsiniz";
    
     	}
     	else 
     		durum = "Ekstra kredi alamazs�n�z";
     	}
     else if (1.0 < gpa | gpa < 1.999)
     	durum = "�artl� Ge�tiniz";
     else
     	durum = "Dersten Kald�n�z";

     System.out.println("Ders notu - "+donem+" d�nemi");
     System.out.println("Transcript");

     System.out.println(String.format("%20s %7s %25s %7s %10s %7s %7s %10s %10s", "S�n�f", "|", "Ders Tan�m�", "|", "Kredi", "|", "Not", "|", "Final Notu"));
     System.out.println(String.format("%s", "-------------------------------------------------------------------------------------------------------------------------------------"));
     for(int i = 0; i < dersayisi; i++)
     {
         DecimalFormat format = new DecimalFormat("#.#####");
         format.format(toplamKredi);
         format.format(Kal�nan);
         format.format(toplamNotlar);
         format.format(gpa);
         System.out.println(String.format("%20s %7s %-25s %7s %10s %7s %-7s %10s %-10s", SinifAdi[i], "|", DersTanimi[i], "|", kredi[i], "|", not[i], "|", finalNotu[i]));
     }
     System.out.println("D�nem �statisti�i - "+donem+" d�nemi");
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));
     System.out.println(String.format("%40s %7s %25s", "", "|", "Kay�t Tarihinden �tibaren"));
     System.out.println(String.format("%40s %7s %25s", "", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Kredi GPA's�:", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Al�nan", "|", toplamKredi));
     System.out.println(String.format("%40s %7s %25s", "Ge�ilen", "|", Gecilen));
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));     
     System.out.println(String.format("%40s %7s %25s", "GPA Hesaplamas�", "|", ""));
     System.out.println(String.format("%40s %7s %25s", "Toplam Notlar", "|", toplamNotlar));
     System.out.println(String.format("%40s %7s %25s", "/ Ge�ilen Derslerin GPA's�", "|", toplamKredi));
     System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------"));
     System.out.println(String.format("%40s %7s %25s", "= GPA", "|", gpa));
     System.out.println(String.format("%40s %7s %25s", "Durum", "|", durum ));
 }

}


