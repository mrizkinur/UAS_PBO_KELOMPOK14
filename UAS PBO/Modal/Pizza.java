package Modal;

import Komposisi.KomposisiPizza;

public class Pizza extends KomposisiPizza implements Modal {
    //  HITUNG MODAL PIZZA
    
    @Override
    public double hitungModal(){
        double modal = this.tepung_terigu() * this.hargaTepung() + this.gula_pasir() * this.hargaGulaPasir() + this.butter() * this.hargaButter() + this.es_batu() * this.hargaEsBatu() + this.ragi() * this.hargaRagi() + (this.susu_bubuk() * this.hargaSusuBubuk()) + (this.susu_cair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur());
        return modal;
    }
    
    @Override
    public int beratAdonan(){
        return 190;
    }
    
    @Override
    public double rotiPerAdonan(){
        return this.hitungKomposisi() / this.beratAdonan();
    }

     //  HITUNG BANYAKNYA TIAP BAHAN UNTUK PIZZA 
    
    public int pesanan;
 
    @Override
    public double hargaTepung(){
        double hitung = this.tepung_terigu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaGulaPasir() {
        double hitung = this.gula_pasir() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaButter() {
        double hitung = this.butter()/ this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaRagi() {
        double hitung = this.ragi() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaSusuBubuk() {
        double hitung = this.susu_bubuk() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }
    
    @Override
    public double hargaSusuCair() {
        double hitung = this.susu_cair() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaTelur() {
        double hitung = this.telur() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }

    @Override
    public double hargaEsBatu() {
        double hitung = this.es_batu() / this.rotiPerAdonan() * pesanan;
        return hitung;
    }
}