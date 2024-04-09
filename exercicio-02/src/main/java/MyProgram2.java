import java.util.ArrayList;

public class MyProgram2 {
    public static void main(String[] args) {
        
        Kate heroina = new Kate();
        MadCat inimigoMC1 = new MadCat();
        MadCat inimigoMC2 = new MadCat();
        BadFish inimigoBF1 = new BadFish();
        BadFish inimigoBF2 = new BadFish();
        BadFish inimigoBF3 = new BadFish();

        SuperBark superBark = new SuperBark();
        EyeBeam eyeBeam = new EyeBeam(superBark);
        RearRocket rearRocket = new RearRocket(eyeBeam); 

        heroina.setPoderAdquiridos(new ArrayList<>());

        heroina.addPoder(superBark);
        heroina.addPoder(eyeBeam);
        heroina.addPoder(rearRocket);

        heroina.trocaPoder();
        heroina.usaPoder(eyeBeam);
        heroina.usaPoder(eyeBeam);
        heroina.usaPoder(eyeBeam);

        if (inimigoBF1.getVida() <= 0) {
            System.out.println(inimigoBF1.getNome() + " foi derrotado!");
        }

        System.out.println("Vigor restante de Kate: " + heroina.getEnergiaRestante());
    }
}
