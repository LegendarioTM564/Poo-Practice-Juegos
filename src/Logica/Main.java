package Logica;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Punto 1: Cargamos la info de los juegos.
        VideoJuego juego1 = new VideoJuego(1,"Counter Strike 1.6","PC",64,"Multiplayer" );
        VideoJuego juego2 = new VideoJuego(2,"Mario Kart 64", "Nintendo 64", 12,"Multiplayer");
        VideoJuego juego3 = new VideoJuego(3,"Donkey Kong 64","Nintendo 64",1,"Plataforma");
        VideoJuego juego4 = new VideoJuego(4,"Mortal Kombat Armageddon", "Play Station 2", 1,"Lucha");
        VideoJuego juego5 = new VideoJuego(5,"Zelda","Nintendo 64",1,"Aventura");

        //Punto 2: Creamos el arrayList de objetos y añadimos los objetos a la lista
        List<VideoJuego> listaJuegos = new ArrayList<VideoJuego>();

        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);


        //Punto 3: Recorremos la lista con un forEach e imprimimos el Título, Consola y la cantJugadores.
        for ( VideoJuego juego:listaJuegos ) {
            System.out.println("El nombre del juego es: " + juego.getTitulo() + " la consola es: " + juego.getConsola() +  " la cantidad de jugadores es: " + juego.getCantJugadores());
        }

        //Punto 4: Seteamos un nuevo nombre y cantJugadores a dos juegos.

        juego1.setTitulo("CS:GO");
        juego1.setCantJugadores(10);
        juego4.setTitulo("Pes 2006");
        juego4.setCantJugadores(2);

        for ( VideoJuego juego:listaJuegos ) {
            System.out.println("El nombre del juego es: " + juego.getTitulo() + " la consola es: " + juego.getConsola() +  " la cantidad de jugadores es: " + juego.getCantJugadores());
        }


        //Punto 5: Mostramos por pantalla solos los juegos que pertenecen a Nintendo 64.
        for ( VideoJuego juego:listaJuegos ) {
            if(juego.getConsola().equals("Nintendo 64")){
                System.out.println(juego.toString());
            }
        }

    }
}