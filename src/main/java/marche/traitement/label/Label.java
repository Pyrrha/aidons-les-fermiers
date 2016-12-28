package marche.traitement.label;

/**
 * Creation de la classe abstraite Label représentant une idée de qu'on peut être représenté un label
 * @version 1.1
 */
public abstract class Label {
    /**
     * Identifiant d'un label. Il n'est pas modifiable.
     * @see Label#getIdLabel()
     */
    protected int idLabel;

    /** Retourne l'identifiant d'un label
     *
     * @return l'identifiant d'un label
     */
    protected int getIdLabel() {
        return idLabel;
    }

}
