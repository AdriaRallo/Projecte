/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author rallito
 */
public class Projecte {

    private static final int MAX_PERSONATGES = 5;
    private static Personatges[] array = new Personatges[MAX_PERSONATGES];
    public static int opcio;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicialitzarVariables;
        do {
            demanarOpcio();
            tractarOpcio();

        } while (!opcioFinal());

    }

    public static void inicialitzarVariables() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Personatges();
            array[i].setOmplit(false);

        }
    }

    public static void demanarOpcio() {
        Scanner ent = new Scanner(System.in);
        System.out.println("1. Introduir Personatge.");
        System.out.println("2. Modificar Personatge.");
        System.out.println("3. Borrar Personatge.");
        System.out.println("4. Llistar tots els Personatges.");
        System.out.println("Sortir de la App.");
        opcio = ent.skip("[\r\n]*").nextInt();

    }

    public static void tractarOpcio() {

        switch (opcio) {

            case 0:
                System.out.println("");
                break;

            case 1:
                introduirPersonatge();
                break;

            case 2:
                modificarPersonatge();
                break;

            case 3:
                borrarPersonatge();
                break;

            case 4:
                llistarPersonatges();
                break;

            default:
                System.out.println("\nOpció Incorrecta!");
        }
    }

    public static boolean opcioFinal() {
        return opcio == 0;
    }
}
