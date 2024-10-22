import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenResolution {
    public static void main(String[] args) {
        // Obtém a resolução da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        System.out.println("Resolução da tela: " + width + "x" + height);
    }
}
