public class Personagem {
    
    private String nome;
    private int vida;
    
    public Personagem() {
        
    }

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void usoPoder(Poder poder) {
        this.vida -= poder.getDanoFeito();
        if (this.vida <= 0) {
            System.out.println(this.nome + " foi derrotado!");
        }
        else {
            System.out.println(this.nome + " recebeu " + poder.getNome() + ", " + poder.getDanoFeito() + " de dano");
            System.out.println("Vida restante: " + this.vida);
        }
    }

}
