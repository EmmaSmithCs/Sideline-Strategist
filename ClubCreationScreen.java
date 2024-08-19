import javax.swing.*;
import java.awt.*;

public class ClubCreationScreen extends JPanel{

    public ClubCreationScreen(CardLayout cardLayout, JPanel mainPanel) {
        // Set the layout of the title screen
        setLayout(new BorderLayout());

        // Create a JLabel to display the title
        JLabel titleLabel = new JLabel("Create Your Club!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Create a JPanel to hold the two sections
        JPanel creationPanels = new JPanel();
        creationPanels.setLayout(new GridLayout(1, 2));

        // Create a JPanel to hold the club details
        JPanel clubDetailsPanel = new JPanel();
        clubDetailsPanel.setLayout(new BorderLayout());

        // Create a JLabel for the club details title
        JLabel clubDetailsLabel = new JLabel("Club Details");
        clubDetailsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        clubDetailsLabel.setHorizontalAlignment(JLabel.CENTER);
        clubDetailsPanel.add(clubDetailsLabel, BorderLayout.NORTH);

        // Create a JPanel to hold the club details form
        JPanel clubDetailsForm = new JPanel();
        clubDetailsForm.setLayout(new GridLayout(3, 2));

        // Create JLabels and JTextFields for the club details form
        JLabel clubNameLabel = new JLabel("Club Name:");
        JTextField clubNameField = new JTextField();    
        JLabel clubAcronymLabel = new JLabel("Club Acronym:");
        JTextField clubAcronymField = new JTextField(3);
        JLabel clubColourLabel = new JLabel("CLub Colour:");
        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink", "Brown", "Black", "White"};
        JComboBox<String> clubColourField = new JComboBox<>(colours);

        // Add the components to the club details form
        clubDetailsForm.add(clubNameLabel);
        clubDetailsForm.add(clubNameField);
        clubDetailsForm.add(clubAcronymLabel);
        clubDetailsForm.add(clubAcronymField);
        clubDetailsForm.add(clubColourLabel);
        clubDetailsForm.add(clubColourField);

        // Add the club details form to the club details panel
        clubDetailsPanel.add(clubDetailsForm, BorderLayout.CENTER);

        // Add the club details panel to the creation panels
        creationPanels.add(clubDetailsPanel);

        // Create a JPanel to hold the manager details
        JPanel managerDetailsPanel = new JPanel();
        managerDetailsPanel.setLayout(new BorderLayout());

        // Create a JLabel for the manager details title
        JLabel managerDetailsLabel = new JLabel("Manager Details");
        managerDetailsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        managerDetailsLabel.setHorizontalAlignment(JLabel.CENTER);
        managerDetailsPanel.add(managerDetailsLabel, BorderLayout.NORTH);

        // Create a JPanel to hold the manager details form
        JPanel managerDetailsForm = new JPanel();
        managerDetailsForm.setLayout(new GridLayout(2, 2));

        // Create JLabels and JTextFields for the manager details form
        JLabel managerNameLabel = new JLabel("Manager Name:");
        JTextField managerNameField = new JTextField();
        JLabel managerGenderLabel = new JLabel("Manager Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        // Create a ButtonGroup to group the radio buttons together
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        // Create a JPanel to hold the radio buttons
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout());
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);

        // Add the components to the manager details form
        managerDetailsForm.add(managerNameLabel);
        managerDetailsForm.add(managerNameField);
        managerDetailsForm.add(managerGenderLabel);
        managerDetailsForm.add(genderPanel);

        // Add the manager details form to the manager details panel
        managerDetailsPanel.add(managerDetailsForm, BorderLayout.CENTER);

        // Add the manager details panel to the creation panels
        creationPanels.add(managerDetailsPanel);

        // Add the creation panels to the main panel
        add(creationPanels, BorderLayout.CENTER);

        // Create a JPanel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create a JButton for creating the club
        JButton createButton = new JButton("Create Club");
        createButton.setFont(new Font("Arial", Font.BOLD, 18));
        createButton.setPreferredSize(new Dimension(500, 250));
        
        createButton.addActionListener(e -> {
            // Switch to the main panel when the button is clicked
            cardLayout.show(mainPanel, "mainPanel");
        });

        // Create a JButton to go back
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 18));
        backButton.setPreferredSize(new Dimension(500, 250));

        backButton.addActionListener(e -> {
            // Switch to the title screen when the button is clicked
            cardLayout.show(mainPanel, "titleScreen");
        });

        // Add components to the panel
        buttonPanel.add(createButton);
        buttonPanel.add(backButton);
        add(buttonPanel, BorderLayout.SOUTH);

    



    }



        
        

    
    
}
