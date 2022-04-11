/*
caminar
correr
propulsar
volar
 */
package implement;

import constants.Constant;
import entity.Armadura;
import entity.Objetos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AccionesImplementService {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    RadarImplementService radServ = new RadarImplementService();

    public Integer caminar(Armadura mark3) throws IOException {

        System.out.println("CAMINAR");
        int metros = comprobarMetros();

        if (mark3.getGenerador()) {
            return metros;
        } else {
            if (metros <= 1000) {
                if (mark3.getBotas().getEnergia() < 25) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 25);
                }
            } else if (metros >= 1000 && metros <= 10000) {
                if (mark3.getBotas().getEnergia() < 50) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 50);
                }
            } else if (metros > 10000) {
                if (mark3.getBotas().getEnergia() < 75) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 75);
                }
            }
        }
        return metros;
    }

    public Integer correr(Armadura mark3) throws IOException {

        System.out.println("CORRER");
        int metros = comprobarMetros();

        if (mark3.getGenerador()) {
            return metros;
        } else {
            if (metros <= 1000) {
                if (mark3.getBotas().getEnergia() < 50) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 50);
                }
            } else if (metros >= 1000 && metros <= 10000) {
                if (mark3.getBotas().getEnergia() < 75) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 75);
                }
            } else if (metros > 10000) {
                if (mark3.getBotas().getEnergia() < 100) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 100);
                }
            }
        }
        return metros;
    }

    public Integer propulsar(Armadura mark3) throws IOException {

        System.out.println("PROPULSAR");
        int metros = comprobarMetros();

        if (mark3.getGenerador()) {
            return metros;
        } else {
            if (metros <= 1000) {
                if (mark3.getBotas().getEnergia() < 10 && mark3.getGuantes().getEnergia() < 5) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 10);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 5);
                }
            } else if (metros >= 1000 && metros <= 10000) {
                if (mark3.getBotas().getEnergia() < 25 && mark3.getGuantes().getEnergia() < 10) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 25);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 10);
                }
            } else if (metros > 10000) {
                if (mark3.getBotas().getEnergia() < 50 && mark3.getGuantes().getEnergia() < 15) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 50);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 15);
                }
            }
        }
        return metros;

    }

    public Integer volar(Armadura mark3) throws IOException {

        System.out.println("VOLAR");
        int metros = comprobarMetros();

        if (mark3.getGenerador()) {
            return metros;
        } else {
            if (metros <= 1000) {
                if (mark3.getBotas().getEnergia() < 20 && mark3.getGuantes().getEnergia() < 10) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 20);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 10);
                }
            } else if (metros >= 1000 && metros <= 10000) {
                if (mark3.getBotas().getEnergia() < 35 && mark3.getGuantes().getEnergia() < 20) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 35);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 20);
                }
            } else if (metros > 10000) {
                if (mark3.getBotas().getEnergia() < 60 && mark3.getGuantes().getEnergia() < 25) {
                    System.out.println(Constant.accionDenegada);
                    metros = 0;
                } else {
                    mark3.getBotas().setEnergia(mark3.getBotas().getEnergia() - 60);
                    mark3.getGuantes().setEnergia(mark3.getGuantes().getEnergia() - 25);
                }
            }
        }
        return metros;

    }

    public void daniosEnemigos(Objetos objeto) {
        switch (objeto.getNvlResis()) {
            case HRA:
                if (objeto.getSalud() < 50) {
                    objeto.setSalud(0);
                    break;
                }
                objeto.setSalud(objeto.getSalud() - 33);
                break;
            case HRB:
                objeto.setSalud(objeto.getSalud() - 50);
                break;
            case HRC:
                objeto.setSalud(objeto.getSalud() - 50);
                break;
        }
    }

    public void disparar(Armadura mark3, ArrayList<Objetos> objetos) {

        System.out.println("DISPARAR");
        System.out.println("Disparando al enemigo mas cercano...");
        comprobarDisparo(objetos, mark3);
        consultarDistancia(null, objetos, mark3);

    }

    public void comprobarDisparo(ArrayList<Objetos> objetos, Armadura mark3) {
        if (mark3.getGenerador()) {
            for (Objetos objeto : objetos) {
                if (objeto.getHostil() && radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()) < 5000) {
                    daniosEnemigos(objeto);
                    if (objeto.getSalud() == 0) {
                        System.out.println("Enemigo " + objeto.getNombre() + " eliminado");
                        objetos.remove(objeto);
                    } else {
                        System.out.println("Enemigo " + objeto.getNombre() + " ha resistido, vida restante: " + objeto.getSalud());
                    }
                    break;
                } else if (objeto.getHostil() && radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()) > 5000) {
                    System.out.println("Objetivo: " + objeto.getNombre() + " fuera de alcance");
                }
            }
        } else {
            for (Objetos objeto : objetos) {
                if (objeto.getHostil() && radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()) < 5000) {
                    if (mark3.getGuantes().getEnergia() < 10) {
                        System.out.println(Constant.accionDenegada);
                        break;
                    } else {
                        daniosEnemigos(objeto);
                        mark3.getGuantes().setEnergia(mark3.getNvlEnergia() - 10);
                        if (objeto.getSalud() == 0) {
                            System.out.println("Enemigo " + objeto.getNombre() + " eliminado");
                            objetos.remove(objeto);
                        } else {
                            System.out.println("Enemigo " + objeto.getNombre() + " ha resistido, vida restante: " + objeto.getSalud());
                        }
                        break;
                    }
                } else if (objeto.getHostil() && radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()) > 5000) {
                    System.out.println("Objetivo: " + objeto.getNombre() + " fuera de alcance");
                }
            }
        }

    }

    public Integer comprobarMetros() throws IOException {
        boolean bandera = false;
        int metros = 0;
        System.out.println("Cantidad de metros a recorrer: ");
        do {
            try {
                metros = Integer.parseInt(br.readLine());
                bandera = true;
            } catch (NumberFormatException e) {
                System.out.println("Se debe agregar un valor númerico entero");
            }
        } while (!bandera);
        return metros;
    }

    public String consejo() {
        String[] notas = new String[6];
        notas[0] = "Nota: El generador si esta prendido mucho tiempo te hara daño, pero no consumiras energia alguna a la hora de hacer acciones...";
        notas[1] = "Nota: Mantente en movimiento para evitar misiles de enemigos";
        notas[2] = "Nota: Si escribes el nombre de tu objetivo Jarvis evaluara lo que debe hacer";
        notas[3] = "Nota: La posibilidad de que un enemigo te golpee es del 100% si no te has movido y reduce a un 20% si te has movido.";
        notas[4] = "Nota: Dependiendo el nivel de dureza de tu armadura mas daño te causaran los enemigos";
        notas[5] = "Nota: Niveles de dureza\n"
                + "HRA: 15 Golpes.\n"
                + "HRB: 10 Golpes.\n"
                + "HRC: 5 Golpes.\n";
        return notas[(int) (Math.random() * 5)];
    }

    public void consultarDistancia(String enemigo, ArrayList<Objetos> objetos, Armadura mark3) {
        boolean bandera = false;
        if (enemigo == null && mark3.getGenerador()) {
            for (Objetos objeto : objetos) {
                if (objeto.getHostil()) {
                    System.out.println(objeto);
                }
            }
        } else if (enemigo != null && mark3.getGenerador()) {
            for (Objetos objeto : objetos) {
                if (objeto.getNombre().equalsIgnoreCase(enemigo)) {
                    System.out.println(objeto + " eliminado");
                    mark3.setPosicX(objeto.getPosicX());
                    mark3.setPosicY(objeto.getPosicY());
                    mark3.setPosicZ(objeto.getPosicZ());
                    mark3.setDistanciaRecorrida((radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()))+mark3.getDistanciaRecorrida());
                    objetos.remove(objeto);
                    bandera = true;
                    break;
                }
            }
        }
        if (enemigo == null && !mark3.getGenerador()) {
            for (Objetos objeto : objetos) {
                if (objeto.getHostil()) {
                    System.out.println(objeto);
                    mark3.getCasco().setEnergia(mark3.getCasco().getEnergia() - 5);
                }
            }
        } else if (enemigo != null && !mark3.getGenerador()) {
            for (Objetos objeto : objetos) {
                if (objeto.getNombre().equalsIgnoreCase(enemigo)) {
                    if (mark3.getCasco().getEnergia() < 20 && mark3.getGuantes().getEnergia() < 10) {
                        System.out.println(Constant.accionDenegada);
                        break;
                    } else {
                        System.out.println(objeto + " eliminado");
                        mark3.setPosicX(objeto.getPosicX());
                        mark3.setPosicY(objeto.getPosicY());
                        mark3.setPosicZ(objeto.getPosicZ());
                        mark3.setDistanciaRecorrida((radServ.distancia(mark3.getPosicX(),mark3.getPosicY(),mark3.getPosicZ(), objeto.getPosicX(), objeto.getPosicY(), objeto.getPosicZ()))+mark3.getDistanciaRecorrida());
                        objetos.remove(objeto);
                        mark3.getCasco().setEnergia(mark3.getCasco().getEnergia() - 20);
                        mark3.getGuantes().setEnergia(mark3.getNvlEnergia() - 25);
                        bandera = true;
                        break;
                    }
                }
            }
        }
        if (!bandera && enemigo != null) {
            System.out.println("El enemigo: " + enemigo + " no se ha encontrado");
        }
    }
}
