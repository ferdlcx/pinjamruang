
import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        // Gunakan setup() untuk menghindari masalah exception
        FlatLightLaf.setup();

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }

        });
    }
}
