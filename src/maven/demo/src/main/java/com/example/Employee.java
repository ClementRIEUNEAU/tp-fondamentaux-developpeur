package com.example;

/**
* Représente un employé dans une entreprise avec un nom, un identifiant et une position.
*/
public class Employee {

    private String nom;
    private int id;
    private String position;
    
    /**
    * Initialise un nouvel employé.
    * @param name Le nom de l'employé (non vide).
    * @param id L'identifiant unique de l'employé (positif).
    * @param position Le poste de l'employé.
    * @throws IllegalArgumentException Si le nom est vide ou si l'id est non valide.
    */
    public Employee(String nom, int id, String position) {
        if (nom.isEmpty() || nom == null) {
            throw new IllegalArgumentException("Le nom doit être valide (non vide et non null) !");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("L'id doit être positif !");
        }
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    /**
     * Retourne le nom de l'employé courant
     * @return le nom de l'employé
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne l'identifiant de l'employé courant
     * @return l'identifiant de l'employé
     */
    public int getId() {
        return this.id;
    }

    /**
     * Retourne la position dans l'entreprise de l'employé courant
     * @return la position de l'employé courant
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Représente un Employée sous format de texte
     */
    public String toString() {
        return this.nom + "[ " + this.id + " ] - " + this.position;
    }
    }
    