package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV2 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 2";
    
    public double topping() {
        double selai  = this.modal_selairedbean() * 10;
        double harga = selai;
        return harga;
    }

    @Override
    public double filing() {
        double krim = this.modal_krimvanilla() * 5;
        double harga = krim;
        return harga;
    }

    public double modal() {
        double hargaTopFill = this.filing() + this.topping();
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
}