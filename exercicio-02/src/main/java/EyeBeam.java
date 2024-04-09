public class EyeBeam extends Poder {

    public EyeBeam(Poder primeiroPoderSB) {
        super("EyeBeam", primeiroPoderSB.getEnergiaGasta() + (primeiroPoderSB.getEnergiaGasta() * 20/100), 40);
    }

}
