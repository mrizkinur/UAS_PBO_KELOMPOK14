package RotiManis;
import Modal.RotiManis;
import Harga.Interface;

public class RotiManisV1 extends RotiManis implements Interface {
    
    String nama = "Roti Manis Varian 1";
    
    public double topping() {
        double coklat  = this.hargaCoklat() * 5;
        double harga = coklat;
        return harga;
    }

    public double filling() {
        double keju = this.hargaKeju() * 5;
        double coklat  = this.hargaCoklat() * 5;
        double harga = keju + coklat;
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
        System.out.println("Harga " + nama  + " = Rp " + (int)hargaVarian() + " /pcs");
    }
}
