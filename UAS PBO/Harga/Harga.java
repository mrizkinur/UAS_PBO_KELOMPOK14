package Harga;

import Komposisi.TopFill;

public class Harga implements TopFill{
    
    //Harga Bahan
    public int Harga_TepungTerigu(){
        return 40000;
    }
    int Harga_GulaPasir(){
        return 25000;
    }
    int Harga_Butter(){
        return 23000;
    }
    int Harga_Ragi(){
        return 5000;
    }
    int Harga_SusuBubuk(){
        return 39000;
    }
    int Harga_SusuCair(){
        return 24000;
    }
    int Harga_Telur(){
        return 23000;
    }
    int Harga_EsBatu(){
        return 2000;
    }

    //Harga Topping
   
    @Override
    public double Keju() {
        return 30000;
    }
    @Override
    public double Coklat() {
        return 29000;
    }
    @Override
    public double KrimVanilla() {
        return 30000;
    }
    @Override
    public double SelaiRedbean() {
        return 25000;
    }
    @Override
    public double Sosis() {
        return 80000;
    }
    @Override
    public double SmokedBeef() {
        return 90000;
    }
    @Override
    public double BawangBombay() {
        return 40000;
    } 
}    