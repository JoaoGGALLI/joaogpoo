
package Jogo;


public class X1 {
    
    private int classe1Vida;
    private int classe2Vida;
    private int classe3Vida;
    
    private int classe1Defesa;
    private int classe2Defesa;
    private int classe3Defesa;
    
    private int classe1Ataque;
    private int classe2Ataque;
    private int classe3Ataque;
    
    private String classe1Nome;
    private String classe2Nome;
    private String classe3Nome;
    
    public void classe1(String nome, int vida, int ataque, int defesa){
        this.classe1Vida = vida;
        this.classe1Nome = nome;
        this.classe1Ataque = ataque;
        this.classe1Defesa = defesa;
        
    }
    
    public void classe2(String nome, int vida, int ataque, int defesa){
        this.classe2Vida = vida;
        this.classe2Nome = nome;
        this.classe2Ataque = ataque;
        this.classe2Defesa = defesa;
    }
    public void classe3(String nome, int vida, int ataque, int defesa){
        this.classe3Vida = vida;
        this.classe3Nome = nome;
        this.classe3Ataque = ataque;
        this.classe3Defesa = defesa;
        
        
    }
     public void startBattle(){
         System.out.println("O x1 vai comecar!...");
         System.out.println("\n");
         System.out.println("\n");
    
         if(classe1Ataque > classe2Vida){
             System.out.println("Voce foi o vitorioso " + classe1Nome + "!");
         }else{
             System.out.println("Voce foi derrotado " + classe1Nome + "!");
         }
     }
     
     public void startBattle2(){
         System.out.println("O segundo x1 vai comecar!...");
         System.out.println("\n");
         System.out.println("\n");
         
         if(classe1Defesa < classe2Defesa){
             System.out.println("Voce foi o vitorioso " + classe2Nome + "!");
             
         }else{
             System.out.println("Voce foi derrotado " + classe2Nome + "!");
         }
            }
     public void startBattle3(){
         System.out.println("O terceiro x1 vai comecar!...");
         System.out.println("\n");
         System.out.println("\n");
         
         if(classe3Vida > classe2Vida){
             System.out.println("Voce foi o vitorioso " + classe3Nome + "!");
             
         }else{
             System.out.println("Voce foi derrotado " + classe3Nome + "!");
         }
  
     }
    
}
