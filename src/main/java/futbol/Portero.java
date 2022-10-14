package futbol;

public class Portero extends  Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad,short golesRecibidos, byte dorsal){
        super(nombre,edad,"Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }


    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return Math.abs( this.getGolesRecibidos() - ((Portero) o).getGolesRecibidos() );
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    //getters y setters
    public short getGolesRecibidos() {return golesRecibidos;}
    public void setGolesRecibidos(short golesRecibidos) {this.golesRecibidos = golesRecibidos;}

    public byte getDorsal() {return dorsal;}
    public void setDorsal(byte dorsal) {this.dorsal = dorsal;}
}
