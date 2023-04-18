package Daviplata;

public class ejecucion {
    public static void main(String[] args) {
        // creacion de un objeto -> lo cual es la instancia de una clase 
        contenido cont = new contenido();
        // invocacion de los metodos
        cont.logueoUsuario();
        cont.meterplataDaviplata();
        cont.SacarplataDaviplata();
        cont.recargaCelular();
        cont.consultaSaldo();
    }
}
