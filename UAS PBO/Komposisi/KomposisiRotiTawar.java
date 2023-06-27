package Komposisi;

import Harga.HargaBahan;

public class KomposisiRotiTawar extends HargaBahan implements BahanRoti{

    //Bahan membuat Roti Tawar
    public int tepung_terigu(){
        return 1000;
    }
    public int gula_pasir(){
        return 125;
    }
    public int butter(){
        return 100;
    }
    public int ragi(){
        return 20;
    }
    public int susu_bubuk(){
        return 250;
    }
    public int susu_cair(){
        return 200;
    }
    public int telur(){
        return 70;
    }
    public int es_batu(){
        return 300;
    }
    @Override
    public int hitungKomposisi() {
        return 2065;
    }
}