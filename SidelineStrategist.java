import javax.swing.*;
import java.awt.*;

public class SidelineStrategist {
    private CardLayout cardLayout;
    private JPanel mainpainel;

    public SidelineStrategist() {
        // Create the main JFrame
        JFrame frame = new JFrame("Sideline Strategist");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setResizable(false);

        // Initialize the main JPanel and CardLayout
        cardLayout = new CardLayout(); 
        mainpainel = new JPanel(cardLayout);

        // Add the title screen to the main JPanel
        TitleScreen titleScreen = new TitleScreen(cardLayout, mainpainel);
        mainpainel.add(titleScreen, "titleScreen");

        // Add mainpainel to the JFrame
        frame.add(mainpainel);

        // Show the title screen
        cardLayout.show(mainpainel, "titleScreen");

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of SidelineStrategist
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SidelineStrategist();
            }
        });
    }
}