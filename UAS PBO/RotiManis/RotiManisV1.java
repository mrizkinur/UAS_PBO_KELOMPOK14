package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV1 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 1";
    
    public double topping() {
        double coklat  = this.modal_coklat() * 5;
        double harga = coklat;
        return harga;
    }

    @Override
    public double filing() {
        double keju = this.modal_keju() * 5;
        double coklat  = this.modal_coklat() * 5;
        double harga = keju + coklat;
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