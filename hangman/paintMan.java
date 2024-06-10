package hangman;

public class paintMan {
    protected static void paintMan(int numErrors){
        System.out.println("╔ ═ ═ ═ ═ ═ ═ ═");
        System.out.println("║" + (numErrors > 0 ? "           │" : ""));
        System.out.println("║" + (numErrors > 1 ? "           ◯" : ""));
        System.out.println("║" + (numErrors > 2 ? "          /" : "") + (numErrors > 3 ? "│" : "") + (numErrors > 4 ? "\\" : ""));
        System.out.println("║" + (numErrors > 5 ? "          /" : "") + (numErrors > 6 ? " \\" : ""));
        System.out.println("║");
        System.out.println("║");
        System.out.println("╚═ ═ ═ ═ ═ ═ ═ ═ ");

    }
}
