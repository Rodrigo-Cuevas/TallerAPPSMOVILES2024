import java.util.Random;
// Clase Mano con dos atributos y un método
class Mano_RACB {
    int dedos_RACB = 5; // Atributo: número de dedos
    String tipo_RACB = "mecanica"; // Atributo: tipo de mano
    // Método para mover la mano
    void mover_RACB() {
        System.out.println("Moviendo la mano de tipo " + tipo_RACB + " con " + dedos_RACB + " dedos.");
    }
}
// Clase Pierna con dos atributos y un método
class Pierna_RACB {
    String material_RACB = "resortes"; // Atributo: material/tipo de pierna
    boolean estaCaminando_RACB = false; // Atributo: si está caminando o no
    // Método para caminar
    void caminar_RACB() {
        estaCaminando_RACB = true;
        System.out.println("Caminando con piernas de " + material_RACB);
    }
}
// Clase Torso con dos atributos y un método
class Torso_RACB {
    String resistencia_RACB = "Alta"; // Atributo: nivel de resistencia
    int peso_RACB = 999; // Atributo: peso del torso
    // Método para mostrar el peso y la resistencia
    void mostrarResistencia_RACB() {
        System.out.println("Torso con resistencia: " + resistencia_RACB + " y peso de " + peso_RACB + " kg.");
    }
}
// Clase Cabeza con dos atributos y un método
class Cabeza_RACB {
    String capacidad_RACB = "Análisis de peligros"; // Atributo: capacidad especial de cabeza de robot
    int peligrosDetectados_RACB; // Atributo: cantidad de peligros detectados
    // Método para analizar peligros
    void analizarPeligros_RACB() {
        Random random = new Random(); 
        peligrosDetectados_RACB = random.nextInt(10); // Genera un número entre 0 y 9
        System.out.println("Peligros detectados: " + peligrosDetectados_RACB);
    }
}
// Clase principal del Robot con todos los componentes
class Robot_RACB {
    Mano_RACB mano_RACB = new Mano_RACB(); // Componente Mano
    Pierna_RACB pierna_RACB = new Pierna_RACB(); // Componente Pierna
    Torso_RACB torso_RACB = new Torso_RACB(); // Componente Torso
    Cabeza_RACB cabeza_RACB = new Cabeza_RACB(); // Componente Cabeza
    // Método para que el robot realice sus acciones
    void realizarAcciones_RACB() {
        mano_RACB.mover_RACB(); // Mover la mano
        pierna_RACB.caminar_RACB(); // Caminar con las piernas
        torso_RACB.mostrarResistencia_RACB(); // Mostrar resistencia del torso
        cabeza_RACB.analizarPeligros_RACB(); // Analizar peligros con la cabeza
    }
}
// Clase Outfit general
class Outfit_RACB {
    String color_RACB; // Atributo: color del outfit
    String estilo_RACB; // Atributo: estilo del outfit
    // Constructor para inicializar color y estilo
    Outfit_RACB(String color_RACB, String estilo_RACB) {
        this.color_RACB = color_RACB;
        this.estilo_RACB = estilo_RACB;
    }
    // Método para aplicar el outfit
    void aplicarOutfit_RACB() {
        System.out.println("Aplicando outfit color " + color_RACB + " de estilo " + estilo_RACB);
    }
}
// Subclase OutfitLuffy
class OutfitLuffy_RACB extends Outfit_RACB {
    OutfitLuffy_RACB() {
        super("Rojo", "Pirata"); // Inicializa el color y estilo del outfit de Luffy
    }
    @Override
    void aplicarOutfit_RACB() {
        super.aplicarOutfit_RACB(); // Aplica el outfit base
        System.out.println("Outfit de Luffy con sombrero de paja.");
    }
}
// Subclase OutfitZoro
class OutfitZoro_RACB extends Outfit_RACB {
    OutfitZoro_RACB() {
        super("Verde", "Samurái"); // Inicializa el color y estilo del outfit de Zoro
    }

    @Override
    void aplicarOutfit_RACB() {
        super.aplicarOutfit_RACB(); // Aplica el outfit base
        System.out.println("Outfit de Zoro con tres espadas.");
    }
}
// Subclase OutfitSanji
class OutfitSanji_RACB extends Outfit_RACB {
    OutfitSanji_RACB() {
        super("Negro", "Chef"); // Inicializa el color y estilo del outfit de Sanji
    }

    @Override
    void aplicarOutfit_RACB() {
        super.aplicarOutfit_RACB(); // Aplica el outfit base
        System.out.println("Outfit de Sanji con traje negro.");
    }
}
// Clase para generar un outfit aleatorio
class GeneradorOutfit_RACB {
    // Método para generar y aplicar un outfit aleatorio
    void generarOutfitAlAzar_RACB() {
        Random random = new Random(); // Objeto para generar números aleatorios
        int opcion = random.nextInt(3); // Genera número aleatorio entre 0 y 2

        switch (opcion) {
            case 0 -> {
                OutfitLuffy_RACB luffy = new OutfitLuffy_RACB(); // Crea outfit de Luffy
                luffy.aplicarOutfit_RACB(); // Aplica el outfit de Luffy
            }
            case 1 -> {
                OutfitZoro_RACB zoro = new OutfitZoro_RACB(); // Crea outfit de Zoro
                zoro.aplicarOutfit_RACB(); // Aplica el outfit de Zoro
            }
            case 2 -> {
                OutfitSanji_RACB sanji = new OutfitSanji_RACB(); // Crea outfit de Sanji
                sanji.aplicarOutfit_RACB(); // Aplica el outfit de Sanji
            }
        }
    }
}
// Clase principal
public class Main_RACB {
    public static void main(String[] args) {
        // Crear un robot
        Robot_RACB robot_RACB = new Robot_RACB(); 
        robot_RACB.realizarAcciones_RACB(); // Realizar acciones del robot
        // Generar un outfit aleatorio
        GeneradorOutfit_RACB generadorOutfit_RACB = new GeneradorOutfit_RACB();
        generadorOutfit_RACB.generarOutfitAlAzar_RACB(); // Aplicar un outfit al azar
    }
}