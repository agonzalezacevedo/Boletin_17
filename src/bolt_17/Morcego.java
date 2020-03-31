package bolt_17;

/**
 *
 * @author agonzalezacevedo
 */
public class Morcego extends Mamifero implements IPodeVolar{

    @Override
    public void volar() {
        System.out.println("Pode volar");
    }
}
