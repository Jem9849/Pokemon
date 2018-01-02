package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
	private PokemonController appController; 
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController appController)
	{
		super();
		
		this.appController = appController; 
		//appPane = new PokemonPanel(appController);
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		//this.setContentPane(appPane);
		this.setTitle("POKEDEX");
		this.setResizable(false);
		this.setSize(1000, 500);
		this.setVisible(true);
	}
	
	public PokemonController getBaseController()
	{
		return appController; 
	}
}
