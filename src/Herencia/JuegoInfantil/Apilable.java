package Herencia.JuegoInfantil;

public interface Apilable {

    default void apilar(Juguete juguete) throws JugueteException{

        if (this == juguete){
            throw new JugueteException ("No puedes aplilarte a ti mismo");
        }
        if (!(juguete instanceof Apilable)){
            throw new JugueteException("El juguete no es apilable");
        }
        if (this.getClass() != juguete.getClass()){
            throw new JugueteException("No puedo apilar estos tipos de juguete");
        }
    }
}
