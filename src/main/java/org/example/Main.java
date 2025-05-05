import calcule.Addition;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        int resultat = addition.additionner(5, 7);
        System.out.println("Le résultat de l'addition est : " + resultat);
    }
}
