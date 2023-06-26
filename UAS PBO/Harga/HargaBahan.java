package Harga;

public class HargaBahan extends BeratKemasan{

    public double modal_tepung(){
        return this.Harga_TepungTerigu() / this.berat_tepungterigu();
    }
    public double modal_gula(){
        return this.Harga_GulaPasir() / this.berat_gulapasir();
    }
    public double modal_butter(){
        return this.Harga_Butter() / this.berat_butter();
    }
    public double modal_ragi(){
        return this.Harga_Ragi() / this.berat_ragi();
    }
    public double modal_susububuk(){
        return this.Harga_SusuBubuk() / this.berat_susububuk();
    }
    public double modal_susucair(){
        return this.Harga_SusuCair() / this.berat_susucair();
    }
    public double modal_telur(){
        return this.Harga_Telur() / this.berat_telur();
    }
    public double modal_esbatu(){
        return this.Harga_EsBatu() / this.berat_esbatu();
    }
    public double modal_keju(){
        return this.Keju() / this.berat_keju();
    }
    public double modal_coklat(){
        return this.Coklat() / this.berat_coklat();
    }
    public double modal_krimvanilla(){
        return this.KrimVanilla() / this.berat_krimvanilla();
    }
    public double modal_selairedbean(){
        return this.SelaiRedbean() / this.berat_selairedbean();
    }
    public double modal_sosis(){
        return this.Sosis() / this.berat_sosis();
    }
    public double modal_smokedbeef(){
        return this.SmokedBeef() / this.berat_smokedbeef();
    }
    public double modal_bawangbombay(){
        return this.BawangBombay() / this.berat_bawangbombay();
    }
}