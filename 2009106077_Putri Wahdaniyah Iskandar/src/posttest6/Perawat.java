/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author ASUS
 */
public class Perawat extends Homecare {

   private String StaffId;

    public Perawat (String StaffId, String nama, String gender, String alamat) {
        super(nama, gender, alamat);
        this.StaffId = StaffId;
    }
    
    
    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public void display() {
        System.out.println("Nama          : " + getnama());
        System.out.println("Gender        : " + getgender());
        System.out.println("Alamat        : " + getalamat());
        System.out.println("ID STAFF      : " +getStaffId());
        this.hidup();
    }

   @Override
    public void hidup() {
        System.out.println("Perawat :" +this.nama+ "\t Semoga Lekas Sembuh"); 
    }

}  




