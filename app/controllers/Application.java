package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        renderText("Servidor inicializado");
    }
    public static void inicializarBaseDatos(){
        Usuario us1 = new Usuario("12dewudi","mario", "mario123","marito","mario@gmail.com");
        us1.save();
        Usuario us2 = new Usuario("12dewdi","andres", "andres123","andre","andres@gmail.com");
        us2.save();
        Pelicula pl1 = new Pelicula("12dwudi","SAW","Peli", "Buena");
        pl1.save();
        us1.pelis.add(pl1);
        us1.save();
        pl1.user = us1;
        pl1.save();
        renderText("Base de datos inicializada");

    }
}