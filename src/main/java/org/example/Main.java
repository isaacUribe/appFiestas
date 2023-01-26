package org.example;

public class Main {
    public static void main(String[] args) {

        //En el mein llamo a mis clases
        //En el main creo los objetos de mis clases
        //En el main creo una instancia de mis clase
        //En el main le saco copia a mis clases y creo objetos

        Invitado objetoDeClaseInvitado = new Invitado();
        Invitado objeto2 = new Invitado(33,true,"Isaac",10000);
        Invitado objeto3 = new Invitado("martha");

        //Obtener el valor de los atributos
        System.out.println(objetoDeClaseInvitado.nombre);
        System.out.println(objeto2.nombre);
    }
}