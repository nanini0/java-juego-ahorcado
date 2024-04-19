import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //clase scanner
        Scanner scanner = new Scanner(System.in);
        //declaraciones y asignaciones 
        String palabraSecreta =  "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraadivinado = false;

        // arreglos:

        char[] letrasadivinadas = new char[palabraSecreta.length()];
        // estructura de control iterativa (bucle)
        for (int i = 0; i < letrasadivinadas.length; i++) { 
            letrasadivinadas[i]='_';
        }

        // estructura de control: iterativa (bucle)

        while(!palabraadivinado && intentos < intentosMaximos){
                                                        // esto se usa cuando tenemos una palabra de char el valueof
            System.out.println("palabra a adivinar : " + String.valueOf(letrasadivinadas));

            System.out.println("introduce una letra,  por favor");
            // charat es para agarrar la primera letra que escribo sugun el indice que le colocamos en este caso 0
            //usamos la calse scanner
            char  letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraconrrecta = false;

            for (int i = 0; i < letrasadivinadas.length; i++) {
                // estructura de contron condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasadivinadas[i] = letra;
                    letraconrrecta = true;
                }
                
            }
            if(!letraconrrecta){
                intentos++;
                System.out.println("incorrecto te quedan " + (intentosMaximos-intentos) + " intentos" );
            }

            if(String.valueOf(letrasadivinadas).equals(palabraSecreta)){
                palabraadivinado = true; 
                System.out.println("felicidades has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if(!palabraadivinado){
            System.out.println("que pena te has quedado sin intentos ");
        }

        scanner.close();








    }
}
