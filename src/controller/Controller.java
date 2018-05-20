package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.StageMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller implements Initializable, ControlledStage
{
	
	private StageController myController;
	public String currentStage;
	
	@FXML
	private Button alarm;
	@FXML
	private Button info;
	@FXML
	private Button cal;
	@FXML
	private Button rank;
	@FXML
	private Button consulate;
	@FXML
	private Button match;
	
	public Controller(String stage)
	{
		this.currentStage = stage;
	}

	@Override
	public void setStageController(StageController stageController)
	{
		this.myController = stageController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		
	}
	
	public void gotoAlarm()
	{
		myController.setStage(StageMap.alarmViewID, this.currentStage);
	}
	
	public void gotoInfo()
	{
		myController.setStage(StageMap.infoViewID, this.currentStage);
	}
	
	public void gotoCal()
	{
		myController.setStage(StageMap.calViewID, this.currentStage);
	}
	
	public void gotoRank()
	{
		myController.setStage(StageMap.rankViewID, this.currentStage);
	}
	
	public void gotoConsulate()
	{
		myController.setStage(StageMap.consulateViewID, this.currentStage);
	}
	
	public void gotoMatch()
	{
		myController.setStage(StageMap.matchViewID, this.currentStage);
	}

}
