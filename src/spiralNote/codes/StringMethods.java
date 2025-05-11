package spiralNote.codes;

public class StringMethods {
    public static void main(String[] args) {
        String txt = "Hello, World";
        System.out.println("Length of txt String is : " + txt.length()); // Outputs : Length of txt String is : 12
        System.out.println("World is located at position : " + txt.indexOf("World")); // Outputs : World is located at position : 7
        System.out.println(txt.toUpperCase()); // Outputs : HELLO, WORLD
        System.out.println(txt.toLowerCase()); // Outputs : hello, world
    }
}
