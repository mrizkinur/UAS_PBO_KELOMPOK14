package Komposisi;

import Harga.HargaBahan;

public class KomposisiRotiManis extends HargaBahan implements BahanRoti{

    //Bahan membuat Roti Manis
    public int tepung_terigu(){
        return 1000;
    }
    public int gula_pasir(){
        return 150;
    }
    public int butter(){
        return 150;
    }
    public int ragi(){
        return 20;
    }
    public int susu_bubuk(){
        return 300;
    }
    public int susu_cair(){
        return 250;
    }
    public int telur(){
        return 80;
    }
    public int es_batu(){
        return 400;
    }
    @Override
    public int hitungKomposisi() {
        return 2350;
    }
}