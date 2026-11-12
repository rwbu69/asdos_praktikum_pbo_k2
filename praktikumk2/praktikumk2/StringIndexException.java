package praktikumk2;

public class StringIndexException {
    static String divLine2 = " IS ";
    static String uInput = " A Cat Is Test ";

    public static void main(String[] args) {
        try {
            int i = uInput.indexOf(divLine2 + divLine2.length());
            System.out.println(uInput.substring(i));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan string index " + e);
        }
    }
}
