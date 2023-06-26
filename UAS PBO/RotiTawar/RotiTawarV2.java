package RotiTawar;
import Modal.RotiTawar;
import Harga.Interface;

public class RotiTawarV2 extends RotiTawar implements Interface {
    
    String nama = "Roti Tawar Varian 2";
    
    @Override
    public double topping () {
        //menghitung topping roti tawar varian 1
        return 0;
    }

    @Override
    public double filling() {
        double keju  = this.hargaKeju() * 80;
        double harga = keju;
        return harga;
    }

    @Override
    public double modal() {
        double hargaTopFill = this.filling() + this.topping();
        double hargaBahan = this.hitungModal() / this.rotiPerAdonan();
        double totalModal = hargaBahan + hargaTopFill;
        return totalModal;
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