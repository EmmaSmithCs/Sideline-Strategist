import javax.swing.*;
import java.awt.*;

public class SidelineStrategist {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public SidelineStrategist() {
        // Create the main JFrame
        JFrame frame = new JFrame("Sideline Strategist");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setResizable(false);

        // Initialize the main JPanel and CardLayout
        cardLayout = new CardLayout(); 
        mainPanel = new JPanel(cardLayout);

        // Add the title screen to the main JPanel
        TitleScreen titleScreen = new TitleScreen(cardLayout, mainPanel);
        ClubCreationScreen clubCreationScreen = new ClubCreationScreen(cardLayout, mainPanel);
        mainPanel.add(titleScreen, "titleScreen");
        mainPanel.add(clubCreationScreen, "clubCreationScreen");

        // Add mainpainel to the JFrame
        frame.add(mainPanel);

        // Show the title screen
        cardLayout.show(mainPanel, "titleScreen");

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