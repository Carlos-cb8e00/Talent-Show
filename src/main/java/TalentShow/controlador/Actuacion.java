package TalentShow.controlador;

import TalentShow.modelo.beans.Concursante;
import TalentShow.modelo.procesos.Datos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actuacion {
    public ArrayList<Concursante> concursantes;
    Scanner sc = new Scanner(System.in);

    public void proceder() {
        Datos datos = new Datos();

        try {
            System.out.println("Ponga el número de personas a asistir: ");  //hará un malabarista, cantante y poeta , y etc etc
            concursantes = datos.crearConcursante(sc.nextInt());
            int indice;

            for (Concursante concursante : concursantes) {
                mostrarConcursante(concursante);
            }

            System.out.println("Ingrese el número del concursante a meter (meta 0 para terminar): ");
            indice = sc.nextInt();
            while (indice>0 && indice<concursantes.size()) {
                System.out.println(toString(indice));
                System.out.println("Ingrese el número del concursante a meter (meta 0 para terminar): ");
                indice = sc.nextInt();
            }

        } catch (InputMismatchException eio) {
            System.out.println("Eso no es ni una puntuación ni un número de concursante");
        } finally {
            System.out.println("FINAL");
        }
    }

    public String toString(int indice) {
        return "Num_concursante: "+concursantes.get(indice-1).num_concursante+
                "\nNombre: "+concursantes.get(indice-1).nombre+
                "\nEdad: "+concursantes.get(indice-1).edad+
                "\nPuntuación: "+concursantes.get(indice-1).puntuacion;
    }

    public void mostrarConcursante(Concursante concursante) {
        concursante.saludar();
        concursante.actuar();
        concursante.despedirse();
        do {
            System.out.println("Puntuación: ");
            concursante.puntuacion = sc.nextInt();
        }while (concursante.puntuacion<1 || concursante.puntuacion>20);
    }
}
