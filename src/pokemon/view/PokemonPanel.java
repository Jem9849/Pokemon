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
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		
		this.appController = appController;
		
		healthLabel = new JLabel("5");
		attackLabel = new JLabel("5");
		nameLabel = new JLabel("5");
		numberLabel = new JLabel("5");
		evolvableLabel = new JLabel("5");
		modifierLabel = new JLabel("5");
		iconLabel = new JLabel("5");
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
		this.add(iconLabel);
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
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
		
}
