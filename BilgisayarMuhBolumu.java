/**
 * 
 * @author Elif SAKAL & Ayþe Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class BilgisayarMuhBolumu {
    /**
     * @param danisList danýþmanlarý tutan liste tanýmlarýz
     * @param ogrList öðrencileri tutan liste tanýmlarýz
     */
	public Danismanlar danisList[];
	public Ogrenciler ogrList[];
    /**
     * Constructors ile listelerin dinamik olarak tanýmlayýp index bilgisi ekliyoruz.
     */
	public BilgisayarMuhBolumu() {
		danisList = new Danismanlar[10];
		ogrList = new Ogrenciler[400];
	}
}
