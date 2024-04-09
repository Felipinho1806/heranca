import java.util.ArrayList;

public class Kate extends Personagem {

    private int energiaRestante = 100;
    private int poderAtual = 0;
    private ArrayList<Poder> poderAdquiridos;
    
    public Kate() {
        super("Kate", 5);
        this.poderAdquiridos = new ArrayList<>();
    }
    
    public Kate(int vidas, int energiaRestante, ArrayList<String> poder) {
        super("Kate", 5);
        this.energiaRestante = energiaRestante;
        this.poderAdquiridos = poderAdquiridos;
    }

    public int getEnergiaRestante() {
        return energiaRestante;
    }

    public void setEnergiaRestante(int energiaRestante) {
        this.energiaRestante = energiaRestante;
    }

    public ArrayList<Poder> getPoderAdquiridos() {
        return poderAdquiridos;
    }

    public void setPoderAdquiridos(ArrayList<Poder> poderAdquiridos) {
        this.poderAdquiridos = poderAdquiridos;
    }
     
    public void addPoder(Poder poder) {
        if(poderAdquiridos.size() < 4) {
            poderAdquiridos.add(poder);
        } 
        else {
            System.out.println("Barra de poderes cheia!");
        }
    }

    public void removerPoder(Poder poder) {
        poderAdquiridos.remove(poder);
        System.out.println("Poder " + poder + " removido!");
    }

    public void usaPoder(Poder poder) {
        if(this.getVida() <= 0) {
            System.out.println("O inimigo esta derrotado!");
            return;
        }
        Poder poderAtual = poderAdquiridos.get(this.poderAtual);
        energiaRestante -= poderAtual.getEnergiaGasta();
        if (energiaRestante < 0) {
            System.out.println("Sem energia para isso!");
            return;
        }
        System.out.println("Ataque: " + poderAtual.getNome());
        usoPoder(poderAtual);
    }

    public void trocaPoder() {
        poderAtual++;
        if(poderAtual >= poderAdquiridos.size()){
            poderAtual = 0;
        }

        System.out.println("O poder atual eh: " + poderAdquiridos.get(poderAtual).getNome());
    }
}
