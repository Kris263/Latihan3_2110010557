/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author krist
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran kris = new Lingkaran ();
        Segitiga tian = new Segitiga ();
        
        kris.radius = 5;
        System.out.println("Lingkaran");
        System.out.println("Nilai Luas = "+kris.luas());
        System.out.println("Nilai Keliling = "+kris.keliling());
        
        tian.alas = 5;
        tian.tinggi = 5;
        tian.sisiMiring = 7;
        System.out.println("Segitiga");
        System.out.println("Nilai Luas = "+tian.luas());
        System.out.println("Nilai Keliling = "+tian.keliling());
        
    }
}
