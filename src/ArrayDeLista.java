import java.util.ArrayList;

public class ArrayDeLista {
    private static ArrayList<String> AEmails = new ArrayList<String>();
    private static ArrayList<String> ASenhas = new ArrayList<String>();

    public static ArrayList<String> getAEmails() {
        return AEmails;
    }

    public static ArrayList<String> getASenhas() {
        return ASenhas;
    }

    public static void setAEmails(String aEmails) {
        AEmails.add(aEmails);
    }

    public static void setASenhas(String aSenhas){
        ASenhas.add(aSenhas);
    }

}
