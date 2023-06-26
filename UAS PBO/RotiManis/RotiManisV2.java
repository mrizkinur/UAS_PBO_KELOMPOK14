package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV2 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 2";
    
    public double topping() {
        double selai  = this.hargaSelai() * 10;
        double harga = selai;
        return harga;
    }

    public double filling() {
        double krim = this.hargaKrim() * 5;
        double harga = krim;
        return harga;
    }

    public double modal() {
        double hargaTopFill = this.filling() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double modalTotal = hargaBahan + hargaTopFill;
        return modalTotal;
    }
    
    public double hargaVarian(){
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return Math.round(harga);
    }
    
    public void harga(){
        System.out.println("Harga " + nama + " = Rp " + (int)hargaVarian() + " /pcs");
    }
}
