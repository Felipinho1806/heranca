public class RearRocket extends Poder {

    public RearRocket(Poder primeiroPoderSB) {
        super("RearRocket", primeiroPoderSB.getEnergiaGasta() + (primeiroPoderSB.getEnergiaGasta() * 50/100), 50);
    }

}
