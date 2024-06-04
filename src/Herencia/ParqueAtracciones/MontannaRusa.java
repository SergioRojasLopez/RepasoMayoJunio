package Herencia.ParqueAtracciones;

public class MontannaRusa extends Atraccion{

    private static final int ALTURA_MAXIMA = 250;
    private static final int ALTURA_MINIMA = 5;
    private static final int VELOCIDAD_MAXIMA = 150;
    private static final int VELOCIDAD_MINIMA = 0;
    private static final int PERSONAL_SEGURIDAD_MAX = 5;

    private int altura;
    private int velocidad;
    private int personalSeguridad;


    public MontannaRusa(String nombreAtraccion, int precioEntrada, int capacidadMaxima,int altura,int velocidad,int personalSeguridad) throws AtraccionException {
        super(nombreAtraccion, precioEntrada, capacidadMaxima);
        setAlturaMaxima(altura);
        setVelocidad(velocidad);
        setPersonalSeguridad(personalSeguridad);
    }

    public void setAlturaMaxima(int altura) throws AtraccionException{
        if (altura > ALTURA_MAXIMA || altura < ALTURA_MINIMA){
            throw new AtraccionException("La altura tiene que ser entre " + ALTURA_MINIMA + " y " + ALTURA_MAXIMA);
        }
        this.altura = altura;
    }

    public void setVelocidad(int velocidad) throws AtraccionException{
        if (velocidad < VELOCIDAD_MINIMA || velocidad > VELOCIDAD_MAXIMA){
            throw new AtraccionException("La velocidad no puede exceder los 150, ni ser menor que 0");
        }
        this.velocidad = velocidad;
    }

    public void setPersonalSeguridad(int personalSeguridad) throws AtraccionException {
        if (personalSeguridad > PERSONAL_SEGURIDAD_MAX || personalSeguridad <= 0){
            throw new AtraccionException("El personal de seguridad tiene que ser 5 o menos ");
        }
        this.personalSeguridad = personalSeguridad;
    }

    @Override
    public String calcularCosto() {
        return "El costo total de " + this.getNombreAtraccion() + " incluyendo seguridad es de 100000€";

    }

    @Override
    public String toString() {
        return this.getNombreAtraccion() + " con altura de " + altura + "metros y velocidad de " + velocidad + "km/h";
    }
}
