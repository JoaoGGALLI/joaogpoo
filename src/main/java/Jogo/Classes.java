package Jogo;

public class Classes {
    
    private String nome;
    private String classe;
    private int vida = 200;
    private int defesa;
    private int ataque;
    private int level;
    
    
    public Classes(String nome, String classe, int level) {
        this.nome = nome;
        this.classe = classe;        
        this.level = level;
        
        
        calculaAtributos();
        calculaLevel();
        imprimeAtributos();
    }
    public int getVida(){
        return vida;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
 
    private void calculaLevel(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 2);
        defesa = defesa + (level / 2);
    }
    
    public void imprimeAtributos(){
        System.out.println("Nome: "+ this.nome + " | " +
                           "Classe: " + this.classe + " | " +
                           "Vida: " + this.vida + " | " +
                           "Level: " + this.level + " | " +
                           "Defesa: " + this.defesa + " | " +
                           "Ataque: " + this.ataque + " | ");
    }
    
    private void calculaAtributos(){        
        switch(this.classe){
            case "Warrior":
                this.ataque = 300; 
                this.defesa = 100;
                this.vida = this.vida - 20;
            break;
            
            case "Tank":
                this.ataque = 100; 
                this.defesa = 300;
                this.vida = this.vida + 50;
            break;
            
            case "Healer":
                this.ataque = 50; 
                this.defesa = 100;
                this.vida = this.vida + 400;
            break;
            
        }
    }   
    
}