package Colecciones.HashMap;

public class Usuario implements Comparable<Usuario> {


    private String nombre;
    private String passwd;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Usuario(String nombre, String passwd) {
        super();
        this.nombre = nombre;
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", passwd=" + passwd + "]";
    }

    @Override
    public int compareTo(Usuario otro) {
        // TODO Auto-generated method stub
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

}
