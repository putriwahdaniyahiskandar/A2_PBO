/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author ASUS
 */
public class posttest2 {
    class HomeCare{
    private String nama;
    private String alamat;
    private String riwayatsakit;
   //  private HomeCare data;
    //private ArrayList<HomeCare> HomeCare = new ArrayList<HomeCare>();
   //  private int num;
    
   public HomeCare(String nama, String alamat, String riwayatsakit){
         this.nama = nama;
         this.alamat = alamat;
         this.riwayatsakit = riwayatsakit;
   }

   public String getnama(){
      return nama;
   }
   public String getalamat(){
      return alamat;
   }
   public String getriwayatsakit(){
      return riwayatsakit;
   }

   public void setnama(String nama){
      this.nama = nama;
   }

   public void setalamat(String alamat){
      this.alamat = alamat;
   }

   public void setriwayatsakit(String riwayatsakit){
      this.riwayatsakit = riwayatsakit;
   }

   // public void setnum(int num){
   //    this.num = num;
   // }
   
   public String toString(){
      return nama+" "+alamat+" "+riwayatsakit+" ";
   }
}
}
