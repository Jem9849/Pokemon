package pokemon.view;

import pokemon.controller.PokemonController;
import java.awt.Color;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	private JLabel iconLabel_1;
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		//Update basic fields
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		// Update text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		setBackground(Color.LIGHT_GRAY);
		this.appController = appController;
		appLayout = new SpringLayout();
		iconLabel = new JLabel ("", new ImageIcon(getClass().getResource("/pokemon/view/pictures/PokemonDefault.png")), 
				JLabel.CENTER);
		evolvableBox = new JCheckBox();
		nameField = new JTextField("Name");
		numberField = new JTextField("##");
		attackField = new JTextField("AP");
		healthField = new JTextField("HP");
		modifierField = new JTextField("MOD");
		healthLabel = new JLabel("5");
		attackLabel = new JLabel("5");
		nameLabel = new JLabel("5");
		numberLabel = new JLabel("5");
		evolvableLabel = new JLabel("5");
		modifierLabel = new JLabel("5");
		iconLabel_1 = new JLabel("5");
		descriptionArea = new JTextArea(10, 25);
		typeArea = new JTextArea(10, 25);
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		setupPanel();
		setupLayout();
		setupListeners();
		setupComboBox();
		setupTypePanels();
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50,50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	
	public void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel_1);
		this.add(saveButton);
		this.add(clearButton);
		this.add(nameField);
		this.add(evolvableBox);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		descriptionArea.setEnabled(false);
		descriptionArea.setEditable(false);
		typeArea.setEnabled(false);
		typeArea.setEditable(false);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		// Change this to match your 3 minimum Types in your pokedex.
		
		if (types[0].equals("Normal"))
		{
			firstType.setBackground(Color.LIGHT_GRAY);
		}
		else if (types[0].equals("Fire"))
		{
			firstType.setBackground(Color.red);
		}
		else if (types[0].equals("Ice"))
		{
			firstType.setBackground(Color.cyan);
		}
		if(types.length > 1)
			if (types[1].equals("Normal"))
			{
				secondType.setBackground(Color.LIGHT_GRAY);
			}
		if(types.length > 1)
			if (types[1].equals("Fire"))
			{
				secondType.setBackground(Color.red);
			}
		if(types.length > 1)
			if (types[1].equals("Ice"))
			{
				secondType.setBackground(Color.cyan);
			}
		
		if (types.length == 3)
		{
			if (types[2].equals("Normal"))
			{
				thirdType.setBackground(Color.LIGHT_GRAY);
			}
		}
		
		if (types.length == 3)
		{
			if (types[2].equals("Fire"))
			{
				thirdType.setBackground(Color.cyan);
			}
		}
		
		if (types.length == 3)
		{
			if (types[2].equals("Ice"))
			{
				thirdType.setBackground(Color.cyan);
			}
		}
	}
	
	private void updateImage()
	{
		String path = "/pokemon/view/pictures/";
		String defaultName = "PokemonDefault";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
					{
						int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
						updatePokedexInfo(selectedPokemonIndex);
						updateImage();
						updateTypePanels();
						repaint();
					}
				});
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 66, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -10, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 8, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, -85, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 59, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 3, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 6, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 64, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 69, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 6, SpringLayout.EAST, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, -7, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 92, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -220, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 66, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -256, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 6, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -228, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 6, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -106, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 92, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 3, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -187, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableLabel, -195, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel_1, 6, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel_1, -6, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel_1, -6, SpringLayout.WEST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 3, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 8, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 89, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel_1, 0, SpringLayout.WEST, saveButton);
	}
		
}
