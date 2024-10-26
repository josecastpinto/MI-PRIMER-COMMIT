import java.util.Scanner;

public class TresPalabras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE POR FAVOR TRES PALABRAS");
        System.out.println("Palabra bumero uno");
        String palabra1 = scanner.next();
        System.out.println("Palabra bumero dos");
        String palabra2 = scanner.next();
        System.out.println("Palabra bumero tres");
        String palabra3 = scanner.next();

        System.out.printf("Las palabras  ingresadas fueron: %s, %s, %s%n ",palabra1, palabra2, palabra3);

scanner.close();
    }
    
}
