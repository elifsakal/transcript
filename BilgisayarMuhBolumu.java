/**
 * 
 * @author Elif SAKAL & Ay�e Nur KORKMAZ
 * @since 31-12-2021
 *
 */
public class BilgisayarMuhBolumu {
    /**
     * @param danisList dan��manlar� tutan liste tan�mlar�z
     * @param ogrList ��rencileri tutan liste tan�mlar�z
     */
	public Danismanlar danisList[];
	public Ogrenciler ogrList[];
    /**
     * Constructors ile listelerin dinamik olarak tan�mlay�p index bilgisi ekliyoruz.
     */
	public BilgisayarMuhBolumu() {
		danisList = new Danismanlar[10];
		ogrList = new Ogrenciler[400];
	}
}
