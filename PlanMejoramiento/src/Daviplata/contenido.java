package Daviplata;

import java.util.Scanner;

public class contenido {
    // Atributos
    public int registro ; // atributo con visibilidad publica
    public int contraseña ; // atributo con visibilidad publica
    public int plata ; // atributo con visibilidad publica
    public int plata1; // atributo con visibilidad publica
    public int total ;// atributo con visibilidad publica
    public int meterPlata ; // atributo con visibilidad publica
    public int sacarPlata ; // atributo con visibilidad publica
    public int consultarSaldo=0 ; // atributo con visibilidad publica inicializado en 0
    public int Recarga ; // atributo con visibilidad publica
    public int recargaCel ;// atributo con visibilidad publica
    public int numCel;// atributo con visibilidad publica
    // Metodos
    Scanner capturar = new Scanner (System.in);
    public void logueoUsuario(){ // metodo para que el usuario se logue 
        
        System.out.println("Por favor escriba su numero de documento: ");
        registro=capturar.nextInt(); 
        System.out.println("Escriba su contraseña: ");
        contraseña=capturar.nextInt();
    }
    public void meterplataDaviplata (){ // metodo para meter plata en el daviplara 
        System.out.println("quiere meter plata a su daviplata escriba 1 para si de lo contrario oprima 2 ");
        plata=capturar.nextInt();
        if (plata==1){
            System.out.println("Numero de celular: ");
            numCel=capturar.nextInt();
            System.out.println("Digite la cantidad de dinero que quiere ingresar a su cuenta: ");
            meterPlata=capturar.nextInt();
        } else 
            System.out.println("Gracias por su seleccion");
        }
    
    public void SacarplataDaviplata (){ // metodo para sacar plata 
        System.out.println("quiere retirar plata digite el numero 1 de lo contrario el numero 2");
        plata1=capturar.nextInt();
        if (plata1==1){
            System.out.println("Escriba cuanta plata quiere retirar ");
            sacarPlata=capturar.nextInt();
        } else 
            System.out.println("Gracias por su seleccion");
        }
       
    
    public void recargaCelular (){ // metodo para realizar recarga del celular 
        System.out.println("quiere realizar una recarga digite el numero 1 de lo contrario el numero 2");
        recargaCel=capturar.nextInt();
        if (recargaCel==1){
            System.out.println("escriba el numero de su numero de celular para realizar la recarga : ");
            Recarga=capturar.nextInt();
        } else 
            System.out.println("Gracias por su seleccion");
        
        
    }
    public void consultaSaldo (){ // metodo para consultar saldo 
        System.out.println("para saber su saldo digite el numero 1 de lo contrario el numero 2");
        consultarSaldo=capturar.nextInt();
        if (consultarSaldo==1){
             total = meterPlata-sacarPlata-Recarga ;
            System.out.println("Su saldo es: " + total );
        } else if (consultarSaldo==2){
            System.out.println("Gracias por su seleccion");
        }
    }
    
}
   

