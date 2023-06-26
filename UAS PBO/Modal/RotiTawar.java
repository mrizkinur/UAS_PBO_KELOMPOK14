package Modal;
import Komposisi.KomposisiRotiTawar;

    public class RotiTawar extends KomposisiRotiTawar implements Modal {
        
        @Override
        public double hitungModal(){
            double modal = (this.tepung_terigu() * this.hargaTepung()) + (this.gula_pasir() * this.hargaGulaPasir()) + (this.butter() * this.hargaButter()) + (this.ragi() * this.hargaRagi()) + (this.susu_bubuk() * this.hargaSusuBubuk()) + (this.susu_cair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur()) + (this.es_batu() * this.hargaEsBatu());
            return modal;
        
        @Override
        public int beratAdonan(){
            return 400;
        }
    
        @Override
        public double rotiPerAdonan(){
            return this.hitungKomposisi() / this.beratAdonan();
        }

        public int pesanan;
     
        @Override
        public double hitungTerigu(){
            double hitung = this.tepungTerigu() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungGula() {
            double hitung = this.gulaPasir() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungButter() {
            double hitung = this.butter()/ this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungRagi() {
            double hitung = this.ragi() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungSusuBubuk() {
            double hitung = this.susuBubuk() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
        
        @Override
        public double hitungSusuCair() {
            double hitung = this.susuCair() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungTelur() {
            double hitung = this.telur() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    
        @Override
        public double hitungEs() {
            double hitung = this.esBatu() / this.rotiPerAdonan() * pesanan;
            return hitung;
        }
    }

    public Pizza() {
    }
}