/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implement;

import entity.Armadura;
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
            objetos.add(new Objetos(random.nextBoolean(), letra.concat(String.valueOf(i)), NvlResistencia.values()[nvlResis], 100, (int)(Math.random()*1000), (int)(Math.random()*1000), (int)(Math.random()*1000)));
        }
        return objetos;
    }
    
    public Integer distancia(Armadura mark3, Objetos objeto){
        Integer x = 0 - objeto.getPosicX() - 0 - mark3.getPosicX();
        x = (int)(Math.pow(x, 2));        
        Integer y = 0-mark3.getPosicY() - 0-objeto.getPosicY();
        y = (int)(Math.pow(y, 2));
        Integer z = 0-mark3.getPosicZ() - 0-objeto.getPosicZ();
        z = (int)(Math.pow(z, 2));
        return (int)(Math.sqrt(x + y + z));
    }
}
