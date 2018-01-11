package controller;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import controller.ControlledStage;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StageController 
{
	public HashMap<String, Stage> stages = new HashMap<String, Stage>();
	
	public void addStage(String name, Stage stage)
	{
		this.stages.put(name, stage);
	}
	
	public Stage getStage(String name)
	{
		return stages.get(name);
	}
	
	public void setPrimaryStage(String name, Stage stage)
	{
		this.addStage(name, stage);
	}
	
	public boolean loadStage(String name, String resources)
	{
		try
		{
			System.out.println(StageController.class.getResource(resources));
			FXMLLoader loader = new FXMLLoader(getClass().getResource(resources));
			Pane tempPane = (Pane) loader.load();
			
			ControlledStage controlledStage = (ControlledStage) loader.getController();
			controlledStage.setStageController(this);
			
			Scene tempScene = new Scene(tempPane, 800, 800);
			Stage tempStage = new Stage();
			tempStage.setScene(tempScene);
			this.addStage(name, tempStage);
			
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean setStage(String name)
	{
		this.getStage(name).show();
		return true;
	}
	
	public boolean setStage(String show, String close)
	{
		this.getStage(close).close();
		setStage(show);
		return true;
	}
	
	public boolean unloadStage(String name)
	{
		if(stages.remove(name) == null)
		{
			System.out.println("Stage cannot be found");
			return false;
		}
		else
		{
			System.out.println("Stage successfully unloaded");
			return true;
		}
	}
	
	
}
