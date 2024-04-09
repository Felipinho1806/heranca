public class Poder {
    
    private String nome;
    private float energiaGasta;
    private int danoFeito;

    public Poder() {

    }
    
    public Poder(String nome, float energiaGasta, int danoFeito) {
        this.nome = nome;
        this.energiaGasta = energiaGasta;
        this.danoFeito = danoFeito;
    }

    public int getDanoFeito() {
        return danoFeito;
    }

    public void setDanoFeito(int danoFeito) {
        this.danoFeito = danoFeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getEnergiaGasta() {
        return energiaGasta;
    }

    public void setEnergiaGasta(float energiaGasta) {
        this.energiaGasta = energiaGasta;
    }

    public void usaPoder(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " usou " + this.getNome() + " contra " + alvo.getNome());
        alvo.usoPoder(this);
    }

}
