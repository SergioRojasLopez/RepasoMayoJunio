package Herencia.JuegoInfantil;

import Herencia.JuegoInfantil.utils.UserDataCollector;

public class Principal {

    public static final int MAX_JUGUETES = 10;
    public static Juguete[] juguetes = new Juguete[MAX_JUGUETES];
    public static int numJuguetes = 0;

    public static void main(String[] args) {
        boolean salir = false;

        try {
            FiguraMadera j1 = new FiguraMadera("Cubo", "Cubemax", "España", 2020, "Rojo", 6);
            FiguraMadera j2 = new FiguraMadera("Dodecaedro", "Cubemax", "Camerún", 2022, "Amarillo", 12);
            InstrumentoMusical j3 = new InstrumentoMusical("Xilófono", "Matel", "Brasil", 1999, 10);
            VehiculoPlastico j4 = new VehiculoPlastico("Ferrari F11", "Ferrari", 4);
            VehiculoPlastico j5 = new VehiculoPlastico("Camión Pegaso", "Juguematic", 8);
            PiezaLego j6 = new PiezaLego("Bloque de lego", "Lego", 4, "Azul");
            PiezaLego j7 = new PiezaLego("Bloque de lego", "Lego", 2, "Verde");
            addJuguete(j1);
            addJuguete(j2);
            addJuguete(j3);
            addJuguete(j4);
            addJuguete(j5);
            addJuguete(j6);
            addJuguete(j7);

        } catch (JugueteException jugueteException) {

        }


        do {
            System.out.println(menu());
            int opcion = UserDataCollector.getEnteroMinMax("Selecciona una opción", 1, 7);

            switch (opcion) {
                case 1:
                    String nombre = UserDataCollector.getString("Introduce el nombre");
                    String marca = UserDataCollector.getString("Introduce la marca");
                    String origen = UserDataCollector.getString("Introduce el origen de la madera");
                    int anoTala = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    int numLados = UserDataCollector.getEntero("Introduce el número de lados de la figura");
                    String color = UserDataCollector.getString("Introduce el color de la figura");

                    try {
                        FiguraMadera figuraMadera = new FiguraMadera(nombre, marca, origen, anoTala, color, numLados);
                        addJuguete(figuraMadera);

                    } catch (JugueteException jugueteException) {
                        System.out.println(jugueteException.getMessage());
                    }
                    break;

                case 2:
                    String nombre_c2 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c2 = UserDataCollector.getString("Introduce la marca");
                    String origen_c2 = UserDataCollector.getString("Introduce el origen de la madera");
                    int anoTala_c2 = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                    int edadMin_c2 = UserDataCollector.getEntero("Introduce la edad mínima");

                    try {
                        InstrumentoMusical instrumentoMusical = new InstrumentoMusical(nombre_c2,marca_c2,origen_c2,anoTala_c2,edadMin_c2);
                        addJuguete(instrumentoMusical);
                    } catch (JugueteException jugueteException) {
                        System.out.println(jugueteException.getMessage());
                    }

                    break;

                case 3:
                    String nombre_c3 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c3 = UserDataCollector.getString("Introduce la marca");
                    int numRuedas_c3 = UserDataCollector.getEntero("Introduce el número de ruedas");

                    try {
                        VehiculoPlastico vehiculoPlastico = new VehiculoPlastico(nombre_c3,marca_c3,numRuedas_c3);
                        addJuguete(vehiculoPlastico);
                    } catch (JugueteException jugueteException) {
                        System.out.println(jugueteException.getMessage());
                    }

                    break;

                case 4:
                    String nombre_c4 = UserDataCollector.getString("Introduce el nombre");
                    String marca_c4 = UserDataCollector.getString("Introduce la marca");
                    String color_c4 = UserDataCollector.getString("Introduce el color");
                    int unidades_c4 = UserDataCollector.getEntero("Introduce la medida, en unidades");

                    try {
                        PiezaLego piezaLego = new PiezaLego(nombre_c4,marca_c4,unidades_c4,color_c4);
                        addJuguete(piezaLego);
                    } catch (JugueteException jugueteException) {
                        System.out.println(jugueteException.getMessage());
                    }

                    break;

                case 5:
                    mostrarJuguetes();
                    int opcion1_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                    Juguete j1_c5 = juguetes[opcion1_c5 - 1];


                    if (!(j1_c5 instanceof Apilable)){
                        System.out.println("El juguete no es apilable");
                        continue;
                    }

                        System.out.println("Selecciona con que juguete lo quieres apilar");
                        mostrarJuguetes();
                        int opcion1_c6 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                        Juguete j1_c6 = juguetes[opcion1_c6 - 1];
                        System.out.println("El juguete " + j1_c5.getNombre() + " se apilado con el juguete " + j1_c6.getNombre());

                        try {
                            ((Apilable)j1_c6).apilar(j1_c5);
                        } catch (JugueteException jugueteException) {
                            System.out.println(jugueteException.getMessage());
                    }

                    break;

                case 6:
                    mostrarJuguetes();
                    break;

                case 7:
                    salir = true;
            }
        } while (!salir);

        System.out.println("Adiós");

    }

    public static void mostrarJuguetes() {
        for (int i = 0; i < juguetes.length; i++) {
            System.out.println(juguetes[i]);
        }
    }

    public static void addJuguete(Juguete juguete) {
        if (numJuguetes < juguetes.length) {
            juguetes[numJuguetes++] = juguete;

        } else {
            System.out.println("No hay mas espacio para rellenar juguetes");
        }
    }

    private static String menu() {
        StringBuilder sb = new StringBuilder("Menú\n");
        sb.append("1. Crear una figura de madera\n");
        sb.append("2. Crear un instrumento musical\n");
        sb.append("3. Crear un vehículo de plástico\n");
        sb.append("4. Crear una pieza de lego\n");
        sb.append("5. Apilar un juguete\n");
        sb.append("6. Mostrar todos los juguetes\n");
        sb.append("7. Salir\n");

        return sb.toString();
    }

}
