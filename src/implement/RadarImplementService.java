/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implement;

import entity.Objetos;
import enums.NvlResistencia;
import java.util.ArrayList;
import java.util.Random;


public class RadarImplementService {

    public ArrayList<Objetos> pulsoRadar(){
        System.out.println("----------Pulso Radar----------");
        String letra = "A";
        ArrayList<Objetos> objetos = new ArrayList();
        Random random = new Random();
        int cantidad = (int) (Math.random()*10);
        for (int i = 0; i < cantidad; i++) {
            int nvlResis = random.nextInt(NvlResistencia.values().length);
            objetos.add(new Objetos(random.nextBoolean(), (int)(Math.random()*10000), letra.concat(String.valueOf(i)), NvlResistencia.values()[nvlResis]));
        }
        return objetos;
    }
}
