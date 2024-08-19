import javax.swing.*;
import java.awt.*;

public class TitleScreen extends JPanel{

    public TitleScreen(CardLayout cardLayout, JPanel mainPanel) {
        // Set the layout of the title screen
        setLayout(new BorderLayout());

        // Create a JLabel to display the title
        JLabel titleLabel = new JLabel("Welcome to Sideline Strategist");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create a JPanel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create a JButton for starting the game
        JButton startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 18));
        startButton.setPreferredSize(new Dimension(500, 250));

        startButton.addActionListener(e -> {
            // Switch to the club creation screen when the button is clicked
            cardLayout.show(mainPanel, "clubCreationScreen");
            
        });

        //Create a JButton to exit
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 18));
        exitButton.setPreferredSize(new Dimension(500, 250));

        exitButton.addActionListener(e -> {
            // Exit the game when the button is clicked
            System.exit(0);
        });

        // Add components to the panel
        add(titleLabel, BorderLayout.CENTER);
        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    
    
}
