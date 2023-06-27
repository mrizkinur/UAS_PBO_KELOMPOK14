package Pizza;
import Modal.Pizza;
import Harga.Interface;

    public class PizzaV1 extends Pizza implements Interface {

    String nama = "Pizza Varian 1";

    @Override
    public double topping() {
        //menghitung topping pizza varian 1
        double keju = this.modal_keju() * 30;
        double sosis = this.modal_sosis() * 50;
        double smokedBeef = this.modal_smokedbeef() * 50;
        double bawangBombay = this.modal_bawangbombay() * 30;
        double harga = keju + sosis + smokedBeef + bawangBombay;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filing() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalModal = hargaBahan + hargaTopFill;
        return totalModal;
    }

    @Override
    public double filing() {
        return 0;
    }

    @Override
    public int harga_varian() {
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return (int) Math.round(harga);
    }

    @Override
    public void harga_roti() {
        System.out.println("Harga " + nama + " = Rp " + (int) harga_varian() + " /pcs");
    }
}