package Pizza;
import Modal.Pizza;
import Harga.Interface;

    public class PizzaV1 extends Pizza implements Interface {

    private String nama = "Pizza Varian 1";

    @Override
    public double topping() {
        //menghitung topping pizza varian 1
        double keju = this.Harga_Keju() * 30;
        double sosis = this.Harga_Sosis() * 50;
        double smokedBeef = this.Harga_Smokedbeef() * 50;
        double bawangBombay = this.Harga_BawangBombay() * 30;
        double harga = keju + sosis + smokedBeef + bawangBombay;
        return harga;
    }

    @Override
    public int filling() {
        // menghitungan filling pizza varian 1 (tidak ada filling)
        return 0;
    }

    @Override
    public int modal() {
        double hargaTopFill = this.filling() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalModal = hargaBahan + hargaTopFill;
        return totalModal;
    }

    @Override
    public double hargaVarian() {
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return Math.round(harga);
    }

    @Override
    public void harga() {
        System.out.println("Harga " + nama + " = Rp " + (int) hargaVarian() + " /pcs");
    }
}

