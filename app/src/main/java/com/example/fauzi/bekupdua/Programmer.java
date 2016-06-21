package com.example.fauzi.bekupdua;

/**
 * Created by fauzi on 16/06/2016.
 */
public class Programmer extends Manusia {
    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
//        super.makan();
        System.out.println("krauk krauk");
    }

    public void ngetik(){
        System.out.println("tik tik tik");
    }

    public void mikir(){
        this.makan();
        System.out.println("ngipok sek");
    }
}
