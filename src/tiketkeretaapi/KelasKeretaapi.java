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
public class KelasKeretaapi extends TiketKeretaApi {
    
    String tempat_duduk;
    int pembelian;
   
    public void tempat_duduk (String cat)
    {
        tempat_duduk=cat;
        System.out.println("urutan tempat duduk = "+tempat_duduk);
    }
   public void pembelian (int pn)
   {
       pembelian =pn;
       System.out.println("Pembelian Tiket = "+pembelian);
       }
}
