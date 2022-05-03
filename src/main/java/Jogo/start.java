
package Jogo;

public class start {
    public static void main(String[] args) {
        System.out.println("Personagens criados:\n");
        Classes classe1  = new Classes("Matador", "Warrior", 100);
        Classes classe2 = new Classes("Paredao", "Tank", 80);
        Classes classe3 = new Classes("Curandeira", "Healer", 150);
        
        X1 luta1 = new X1();
        System.out.println("\nQUE O PRIMEIRO X1 COMECE!!!\n");
        System.out.println("O VITORIOSO SERA AQUELE COM MAIS ATAQUE!\n");
        System.out.println("\nSua classe:");
        classe1.imprimeAtributos();
        System.out.println("\nClasse inimiga:");
        classe2.imprimeAtributos();
        
        luta1.classe1(classe1.getNome(), classe1.getVida(), classe1.getAtaque(), classe1.getDefesa());
        luta1.classe2(classe2.getNome(), classe2.getVida(), classe2.getAtaque(), classe2.getDefesa());
        
        luta1.startBattle();
        
        
        X1 luta2 = new X1();
        System.out.println("\nQUE O SEGUNDO X1 COMECE!!!\n");
        System.out.println("O VITORIOSO SERA AQUELE COM MAIS DEFESA!\n");
        System.out.println("\nSua classe:");
        classe2.imprimeAtributos();
        System.out.println("\nClasse inimiga:");
        classe1.imprimeAtributos();
        
        luta2.classe1(classe1.getNome(), classe1.getVida(), classe1.getAtaque(), classe1.getDefesa());
        luta2.classe2(classe2.getNome(), classe2.getVida(), classe2.getAtaque(), classe2.getDefesa());
        
        
        
        luta2.startBattle2();
        
        X1 luta3 = new X1();
        System.out.println("\nQUE O TERCEIRO X1 COMECE!!!");
        System.out.println("\nO VITORIOSO SERA AQUELE COM MAIS VIDA!");
        System.out.println("\nSua classe:");
        classe3.imprimeAtributos();
        System.out.println("\nClasse inimiga:");
        classe2.imprimeAtributos();
        
        luta3.classe3(classe3.getNome(), classe3.getVida(), classe3.getAtaque(), classe3.getDefesa());
        luta3.classe2(classe2.getNome(), classe2.getVida(), classe2.getAtaque(), classe2.getDefesa());
        
        luta3.startBattle3();
  }
}
        
   
    
