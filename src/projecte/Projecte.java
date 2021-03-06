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
        inicialitzarVariables();
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
        System.out.println("0. Sortir de la App.");
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

    public static void introduirPersonatge() {

        Scanner ent = new Scanner(System.in);

        // Primer recorrem l'array fins trobar una casella no omplida o arribar al seu final
        int i;
        for (i = 0; i < array.length && array[i].isOmplit(); i++);

        // Si no hem arribat al final és per que hem trobat una casella buida (no omplida)
        boolean nom_disponible = true;
        String nom;

        if (i < array.length) {

            System.out.println("\nNom:");
            nom = ent.nextLine().trim();

            for (int j = 0; j < array.length; j++) {

                if (array[j].getNom().trim().equalsIgnoreCase(nom) && array[j].isOmplit()) {
                    nom_disponible = false;
                }

            }

            if (i < array.length) {
                
                if (nom_disponible) {
                    
                    array[i].setNom(nom);

                System.out.println("Raça:");
                array[i].setRaça(ent.skip("[\r\n]*").nextLine());

                System.out.println("Familia:");
                array[i].setFamilia(ent.skip("[\r\n]*").nextLine());

                System.out.println("Habilitats:");
                array[i].setHabilitats(ent.skip("[\r\n]*").nextLine());

                System.out.println("Transformacions:");
                array[i].setTransformacions(ent.skip("[\r\n]*").nextLine());

                char esHome;

                do {

                    System.out.println("És home o dona?(H/D):");
                    esHome = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);

                } while (esHome != 'H' && esHome != 'D');

                if (esHome == 'H') {
                    array[i].setSexe(Personatges.Sexe.HOME);
                } else {
                    array[i].setSexe(Personatges.Sexe.DONA);
                }
                array[i].setOmplit(true);
                    
                } else {
                    
                    System.out.println("El  nom ja esta fet servir");
                    
                }
                
                

            } else {
                System.out.println("\nNo en caben més, si vols, primer borra'n");
            }

        }

    }

    public static void modificarPersonatge() {
    }

    public static void borrarPersonatge() {
    }

    public static void llistarPersonatges() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

}
