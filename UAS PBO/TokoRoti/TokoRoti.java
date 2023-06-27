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

        }
}