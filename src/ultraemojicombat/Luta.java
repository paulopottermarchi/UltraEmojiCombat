/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author paulo
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("--- DESAFIADO ---");
            this.desafiado.apresentar();
            System.out.println(" ");
            System.out.println("--- DESAFIANTE ---");
            this.desafiante.apresentar();
            System.out.println(" ");
            
            //LUTA
            if (this.desafiado.getVitorias() > this.desafiante.getVitorias()) {
                this.desafiado.setSorte(this.desafiado.getSorte() + 1);
                System.out.println("A luta comeca com " + this.desafiado.getNome() + " aplicando " + this.desafiado.getSorte() + " golpe contra " + 
                    this.desafiante.getNome());
            } else {
                this.desafiante.setSorte(this.desafiante.getSorte() + 1);
                System.out.println(this.desafiante.getNome() + " deu  " + this.desafiante.getSorte() + " golpe contra " + 
                    this.desafiado.getNome());
            }
            
            if (this.desafiado.getIdade() > this.desafiante.getIdade()) {
                this.desafiado.setSorte(this.desafiado.getSorte() + 1);
                System.out.println(this.desafiado.getNome() + " deu   " + this.desafiado.getSorte() + " golpe contra " + 
                    this.desafiante.getNome());
            } else {
                this.desafiante.setSorte(this.desafiante.getSorte() + 1);
                 System.out.println(this.desafiante.getNome() + " deu  " + this.desafiante.getSorte() + " golpe contra " + 
                    this.desafiado.getNome());
            }
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(6);
            this.desafiado.setSorte(this.desafiado.getSorte() + vencedor);
            System.out.println(" ");
            System.out.println(" A luta esta intensa com " + this.desafiado.getNome() + " aplicando " + this.desafiado.getSorte() + " golpes contra " + 
                    this.desafiante.getNome());
            System.out.println(" ");
            vencedor = aleatorio.nextInt(6);
            this.desafiante.setSorte(this.desafiante.getSorte() + vencedor);
             System.out.println(" A luta continua  louca com " + this.desafiante.getNome() + " aplicando " + this.desafiante.getSorte() + " golpes contra " + 
                    this.desafiado.getNome());
             System.out.println(" ");
            System.out.println("===== RESULTADO DA LUTA =====");
            if (this.desafiado.getSorte() > this.desafiante.getSorte()) {                   
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
            } else if (this.desafiante.getSorte() > this.desafiado.getSorte()) {
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();               
            } else {
                    System.out.println("Empatou!");
                    this.desafiado.empatarLutar();
                    this.desafiante.empatarLutar();               
            }
            System.out.println("=========================");    
        } else {
            System.out.println("A luta nao pode acontecer!");
        }
        
    }
    
    // METODOS ESPECIAIS 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

   
    
    
    
}
