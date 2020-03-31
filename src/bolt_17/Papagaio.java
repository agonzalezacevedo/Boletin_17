package bolt_17;

/**
 *
 * @author agonzalezacevedo
 */
public class Papagaio extends Aves implements IPodeCamiñar, IPodeVolar {

    @Override
    public void camiñar() {
        System.out.println("Pode camiñar");
    }

    @Override
    public void volar() {
        System.out.println("Pode volar");
    }

}
