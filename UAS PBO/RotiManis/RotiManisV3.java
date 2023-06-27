package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV3 extends RotiManis implements Interface {
    String nama = "Roti Manis Varian 3";
    
    @Override
    public double filing() {
        double keju = this.modal_keju() * 10;
        double sosis  = this.modal_coklat() * 10;
        double harga = keju + sosis;
        return harga;
    }

    public double modal() {
        double hargaTopFill = this.filing();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double modalTotal = hargaBahan + hargaTopFill;
        return modalTotal;
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

    public double topping() {
        return 0.0;
    }
}