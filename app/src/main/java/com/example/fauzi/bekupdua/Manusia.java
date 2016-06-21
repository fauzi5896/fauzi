package com.example.fauzi.bekupdua;

/**
 * Created by fauzi on 16/06/2016.
 */
public class Manusia {
    private String nama = "";
    private int umur = 0;

    public Manusia(String nama) {
        this.nama = nama;
    }

    //getter and setter digunakan ketika variable private
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void makan(){
        System.out.println("enak");
    }
}
