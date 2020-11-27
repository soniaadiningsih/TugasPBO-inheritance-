/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketKeretaApi;

/**
 *
 * @author wulan
 */
public class KeretaBerangkat {
    
     public static void main(String[] args) {
        KelasKeretaapi kk=new KelasKeretaapi();
         
        System.out.println("Deskripsi Penjualan;");
        kk.judul("PT. KAI");
        kk.tempat_duduk("Ekonomi");
        kk.harga(20000);
        kk.pembelian(5);
    }

}
