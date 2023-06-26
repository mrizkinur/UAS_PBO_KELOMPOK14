package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV3 extends RotiManis implements Interface {
    String nama = "Roti Manis Varian 3";
    
    public double filling() {
        double keju = this.hargaKeju() * 10;
        double sosis  = this.hargaCoklat() * 10;
        double harga = keju + sosis;
        return harga;
    }

    public double modal() {
        double hargaTopFill = this.filling();
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
        System.out.println("Harga " + nama  + " = Rp " + (int)hargaVarian() + " /pcs");
    }

    public double topping() {
        return 0.0;
    }
    
}
