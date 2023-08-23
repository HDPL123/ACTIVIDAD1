/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author henri
 */
class AnimalTerrestre {
    String getNombre() {
        return "Animales terrestres";
    }

    void getTotalEspecies() {
        System.out.println("Los " + getNombre() + " tienen n especies");
    }
}

class Zorro extends AnimalTerrestre {
    @Override
    String getNombre() {
        return "Zorro";
    }

    @Override
    void getTotalEspecies() {
        System.out.println(getNombre());
        System.out.println("Los " + "Animales terrestres" + ", como el " + getNombre() + ", tienen 50 mil especies");
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalTerrestre animalTerrestre = new AnimalTerrestre();
        Zorro zorro = new Zorro();

        animalTerrestre.getTotalEspecies();
        System.out.println();

        zorro.getTotalEspecies();
    }
}
