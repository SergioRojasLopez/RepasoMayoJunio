package Colecciones.GestionEstudiantes;

import java.util.*;

public class SistemaEstudiantes {

    private Map<Integer,Estudiante> sistemaEstudiantes;

    public SistemaEstudiantes() {
        this.sistemaEstudiantes = new HashMap<>();
    }

    public void annadirEstudiante (Estudiante estudiante) throws SistemaException {
        Integer id = estudiante.getId();
        if (sistemaEstudiantes.containsKey(id)){
            throw new SistemaException("El estudiante ya esta en el sistema");
        }
        sistemaEstudiantes.put(id,estudiante);
    }

    public void asignarNota (int idEstudiante,int nota)throws SistemaException{

        if (!sistemaEstudiantes.containsKey(idEstudiante)){
            throw new SistemaException("El estudiante no esta en el sistema");
        }
        sistemaEstudiantes.get(idEstudiante).getListaNotas().add(nota);
    }

    public double calcularPromedio () throws SistemaException{
        double suma = 0;
        int totalNotas = 0;
        for (Estudiante estudiante : sistemaEstudiantes.values()){
            List<Integer> notas = estudiante.getListaNotas();
           for (int nota : notas){
               suma += nota;
               totalNotas++;
           }
        }
        if (totalNotas == 0){
            throw new SistemaException("Las notas no pueden ser 0");
        }
        return suma / totalNotas;

        //listarEstudiantes().stream().mapToDouble(Integer::intValue).average().orElseThrow();
    }

    public List<Estudiante> listarEstudiantes(){

      return sistemaEstudiantes.values().stream().toList();

    }

}
