/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA : MIrraz Ibrahim
 * KELAS : IF-2
 * NIM : 10118056
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
        
        public void eat(String nama){
        System.out.println(nama+" Makan");
    
    }
    
        
}
