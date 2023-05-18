/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l [] = new Lutador [6];
        Scanner tc = new Scanner(System.in);       
        System.out.println("BEM VINDO AO ULTRA EMOJI COMBAT");
        System.out.println("Qual lutador voce deseja: ");
        System.out.println(" ");
        l[0] = new Lutador("Pretty Boy","Franca", 31, 1.75f, 68.9f,11,2,1);
        l[1] = new Lutador("Putscript", "Brasil", 29,1.65f,57.8f,14,2,3);
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Dead Code" , "Australia",28,1.93f,81.6f,13,0,2);
        l[4] = new Lutador("UFOCobol", "Brasil",37,1.70f,119.3f,5,4,3);
        l[5] = new Lutador("Nerdaart","EUA", 30,1.81f,105.7f,12,2,4);  
        for (int lu = 0;lu <= l.length-1;lu++) {
            System.out.println(lu + " - " + l[lu].getNome() + " categoria: Peso " + l[lu].getCategoria() );           
        }
        System.out.println(" ");
        System.out.print("LUTADOR: ");
        int n = tc.nextInt();
        System.out.println(" ");
        System.out.print("OPONENTE: ");
        int n2 = tc.nextInt();
        System.out.println("  ");
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[n], l[n2]);
        UEC01.lutar();
       
    }
    
}
