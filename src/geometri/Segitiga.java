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
public class Segitiga {
    double alas, tinggi, sisiMiring;
    
    public double luas () {
        return 0.5 * alas * tinggi;
    }
    
    public double keliling () {
        return alas + tinggi + sisiMiring;
    }
}
