/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author rallito
 */
public class Personatges {

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getHabilitats() {
        return habilitats;
    }

    public void setHabilitats(String habilitats) {
        this.habilitats = habilitats;
    }

    public String getTransformacions() {
        return transformacions;
    }

    public void setTransformacions(String transformacions) {
        this.transformacions = transformacions;
    }

    public boolean isOmplit() {
        return Omplit;
    }

    public void setOmplit(boolean Omplit) {
        this.Omplit = Omplit;
    }

    public enum Sexe {
        HOME, DONA
    };

    private String nom="";
    private Sexe sexe;
    private String familia="";
    private String raça="";
    private String habilitats="";
    private String transformacions="";
    private boolean Omplit = false;

    @Override
    public String toString() {
        return "Personatges{" + "Nom= " + nom + ", Familia= " + familia + ", Ra\u00e7a= " + raça + ", Habilitats= " + habilitats + ", Transformacions= " + transformacions + ", Sexe= " + sexe;
    }
        
}