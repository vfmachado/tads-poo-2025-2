package Aula06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<IDirigir> drivers = new ArrayList<>();
        drivers.add(new Pessoa());
        drivers.add(new Robo());

        for (IDirigir i : drivers) {
            // i.nome = "Vinicius"; nao é acessivel pq nao faz parte da configuracao da interface
            i.dirigir();
        }

    }
}
