/**
* Représente un employé dans une entreprise.
*/
public class Employee {
    
    // TODO: Ajoutez les attributs ici (nom, id, position).
    private String nom;
    private int id;
    private String position;
    
    // TODO: Ajoutez un constructeur pour initialiser les attributs.
    public Employee(String nom, int id, String position) {
        this.nom = nom;
        this.id = id;
        this.position = position;
    }

    // TODO: Ajoutez des méthodes pour récupérer les valeurs des attributs (getters).
    public String getNom() {
        return this.nom;
    }

    public int getId() {
        return this.id;
    }

    public String getPosition() {
        return this.position;
    }

    // TODO: Ajoutez une méthode toString() pour représenter un employé en texte.
    public String toString() {
        return this.nom + "[ " + this.id + " ] - " + this.position;
    }
    }
    