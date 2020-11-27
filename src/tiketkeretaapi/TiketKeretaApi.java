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
public class TiketKeretaApi {
    
    String judul;
    int harga;
   
    void judul (String jl)
    {
        judul=jl;
        System.out.println("tiket konser = "+judul);
       }
      void harga (int nm)
    {
        harga=nm;
        System.out.println("harga tiket = "+harga);
      
    }
}
