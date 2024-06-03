package Herencia.JuegoInfantil;

public class VehiculoPlastico extends JuguetePlastico{

    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca,int numRuedas) throws JugueteException {
        super(nombre, marca, TPlastico.PVC);
        setNumRuedas(numRuedas);

    }

    public void setNumRuedas(int numRuedas) throws JugueteException{
        if (numRuedas < 0){
            throw new JugueteException("Numero de ruedas no valido");
        }
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public String toString() {
        return this.getNombre() + " con " + numRuedas + " ruedas";
    }
}
