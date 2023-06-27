package TokoRoti;
import RotiTawar.RotiTawarV1;
import RotiTawar.RotiTawarV2;
import Pizza.PizzaV1;
import RotiManis.RotiManisV1;
import RotiManis.RotiManisV2;
import RotiManis.RotiManisV3;

public class TokoRoti{
    public static void main(String[] args) {
        RotiManisV1 rm1 = new RotiManisV1();
        RotiManisV2 rm2 = new RotiManisV2();
        RotiManisV3 rm3 = new RotiManisV3();
        RotiTawarV1 rt1 = new RotiTawarV1();
        RotiTawarV2 rt2 = new RotiTawarV2();
        PizzaV1 p1  = new PizzaV1();

        rm1.pesanan = 50;
        rm2.pesanan = 100;
        rm3.pesanan = 70;
        rt1.pesanan = 20;
        rt2.pesanan = 15;
        p1.pesanan = 10;

        rm1.harga_roti();
        rm2.harga_roti();
        rm3.harga_roti();
        rt1.harga_roti();
        rt2.harga_roti();
        p1.harga_roti();

        double kebutuhanTepung = rm1.Harga_TepungTerigu() + rm2.Harga_TepungTerigu() + rm3.Harga_TepungTerigu() + rt1.Harga_TepungTerigu() + rt2.Harga_TepungTerigu() + p1.Harga_TepungTerigu();
        double kebutuhanGula = rm1.hargaGulaPasir() + rm2.hargaGulaPasir() + rm3.hargaGulaPasir() + rt1.hargaGulaPasir() + rt2.hargaGulaPasir() + p1.hargaGulaPasir();
        double kebutuhanButter = rm1.hargaButter() + rm2.hargaButter() + rm3.hargaButter() + rt1.hargaButter() + rt2.hargaButter() + p1.hargaButter();
        double kebutuhanRagi = rm1.hargaRagi() + rm2.hargaRagi() + rm3.hargaRagi() + rt1.hargaRagi() + rt2.hargaRagi() + p1.hargaRagi();
        double kebutuhanSusuBubuk = rm1.hargaSusuBubuk() + rm2.hargaSusuBubuk() + rm3.hargaSusuBubuk() + rt1.hargaSusuBubuk() + rt2.hargaSusuBubuk() + p1.hargaSusuBubuk();
        double kebutuhanSusuCair = rm1.hargaSusuCair() + rm2.hargaSusuCair() + rm3.hargaSusuCair() + rt1.hargaSusuCair() + rt2.hargaSusuCair() + p1.hargaSusuCair();
        double kebutuhanTelur = rm1.hargaTelur() + rm2.hargaTelur() + rm3.hargaTelur() + rt1.hargaTelur() + rt2.hargaTelur() + p1.hargaTelur();
        double kebutuhanEs = rm1.hargaEsBatu() + rm2.hargaEsBatu() + rm3.hargaEsBatu() + rt1.hargaEsBatu() + rt2.hargaEsBatu() + p1.hargaEsBatu();
        double kebutuhanCoklat = rm1.modal_coklat() + rt1.modal_coklat();
        double kebutuhanKeju = rm1.modal_keju() + rm3.modal_keju() + rt2.modal_keju() + p1.modal_keju();
        double kebutuhanRedBean = rm2.modal_selairedbean();
        double kebutuhanKrimVanilla = rm2.modal_krimvanilla();
        double kebutuhanSosis = rm3.modal_sosis() + p1.modal_sosis();
        double kebutuhanBeef = p1.modal_smokedbeef();
        double kebutuhanBawang = p1.modal_bawangbombay();

        System.out.println("Kebutuhan Tepung = " + kebutuhanTepung + " gram");
        System.out.println("Kebutuhan Gula = " + kebutuhanGula + " gram");
        System.out.println("Kebutuhan Butter = " + kebutuhanButter + " gram");
        System.out.println("Kebutuhan Ragi = " + kebutuhanRagi + " gram");
        System.out.println("Kebutuhan Susu Bubuk = " + kebutuhanSusuBubuk + " gram");
        System.out.println("Kebutuhan Susu Cair =" + kebutuhanSusuCair + " gram");    
        System.out.println("Kebutuhan Telur = " + kebutuhanTelur + " gram");
        System.out.println("Kebutuhan Es Batu = " + kebutuhanEs + " gram");
        System.out.println("Kebutuhan Coklat = " + kebutuhanCoklat + " gram");
        System.out.println("Kebutuhan Keju = " + kebutuhanKeju + " gram");
        System.out.println("Kebutuhan Red Bean = " + kebutuhanRedBean + " gram");
        System.out.println("Kebutuhan Krim Vanilla = " + kebutuhanKrimVanilla + " gram");
        System.out.println("Kebutuhan Sosis = " + kebutuhanSosis + " gram");
        System.out.println("Kebutuhan Beef = " + kebutuhanBeef + " gram");
        System.out.println("Kebutuhan Bawang = " + kebutuhanBawang + " gram");
        }
}