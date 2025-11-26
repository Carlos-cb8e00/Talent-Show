package TalentShow.modelo.procesos;

import TalentShow.modelo.beans.Cantante;
import TalentShow.modelo.beans.Concursante;
import TalentShow.modelo.beans.Malabarista;
import TalentShow.modelo.beans.Poeta;

import java.util.ArrayList;
import java.util.List;

public class Datos{
    public ArrayList<String> Nombres() {
        return new ArrayList<>(List.of("Juan", "Pedro", "María", "José", "Josefa", "Carlota", "Mari Ángeles", "Eugenio", "Francisco José", "Laura","Ángela"));
    }
    public ArrayList<String> Poemas() {
        return new ArrayList<>(List.of("Mio Cid","A un olmo seco","Rima LIII","Tú me quieres alba","La canción del pirata",
                "Oda a la cebolla","The Raven","Poema 20","La Odisea","El camino no elegido","Beowulf","Coplas a la muerte de su padre"));
    }

    public ArrayList<String> Objetos() {
        return new ArrayList<>(List.of("pelotas","macetas","bolas","papeles higiénicos","cabezas","cebollas","hámsters","extintores"));
    }

    public ArrayList<String> Canciones() {
        return new ArrayList<>(List.of("Like a Rolling Stone","Imagine","Claro de Luna","Superestrella","Für Elise","Despacito",
                "Shape of You","Respect","Cumpleaños feliz","A quién le importa","No Dudaría","Fiesta pagana","Vivir así es Morir de amor"));
    }

    public ArrayList<Concursante> crearConcursante(int tamanio_concurso){
        ArrayList<Concursante> concursantes= new ArrayList<>();
        ArrayList<String> nombres = Nombres();
        for (int i=1;i < tamanio_concurso;i++) {
            if (i%3==1) {
                concursantes.add(new Malabarista(i,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0)); //por eso de que no puedan asistir bebés
            }else if (i%3==2) {
                concursantes.add(new Cantante(i+1,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0));
            } else {
                concursantes.add(new Poeta(i+2,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0));
            }
        }

        return concursantes;
    }


}
