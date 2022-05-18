/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public class Pasien extends Homecare {
   private String riwayatsakit;

    public Pasien(String riwayatsakit, String nama, String gender, String alamat) {
        super(nama, gender, alamat);
        this.riwayatsakit = riwayatsakit;
    }

 
 public String getriwayatsakit() {
        return riwayatsakit;
    }

    public void setriwayatsakit(String riwayatsakit) {
        this.riwayatsakit = riwayatsakit;
    }

    public void display() {
        System.out.println("Nama          : " + getnama());
        System.out.println("Gender        : " + getgender());
        System.out.println("Alamat        : " + getalamat());
        System.out.println("Mengidap Penyakit: " +getriwayatsakit());
        this.hidup();
    }

    @Override
    public void hidup() {
        System.out.println("Pasien :" +this.nama+ "\t Terima Kasih");
    }

}
 

