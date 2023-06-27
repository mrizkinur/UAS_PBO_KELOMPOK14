package Komposisi;

import Harga.HargaBahan;

public class KomposisiPizza extends HargaBahan implements BahanRoti{

    //Bahan membuat Pizza
    public int tepung_terigu(){
        return 1000;
    }
    public int gula_pasir(){
        return 100;
    }
    public int butter(){
        return 100;
    }
    public int ragi(){
        return 20;
    }
    public int susu_bubuk(){
        return 200;
    }
    public int susu_cair(){
        return 180;
    }
    public int telur(){
        return 50;
    }
    public int es_batu(){
        return 300;
    }
    @Override
    public int hitungKomposisi() {
        return 1950;
    }
}