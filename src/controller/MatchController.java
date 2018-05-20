package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.StageMap;
import consulate.America;
import consulate.Britain;
import consulate.Canada;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import universityRank.UniversityRank;

public class MatchController extends Controller{

	@FXML
	private ChoiceBox<String> sat;
	@FXML
	private TextArea collegeChoice;
	
	public MatchController() {
		super(StageMap.matchViewID);
	}
	
	public UniversityRank u = new UniversityRank();
	public String[] name = u.university;
	public int[] score = u.upperSAT;
	
	int idx = -1;

	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		sat.setItems(FXCollections.observableArrayList("1600", "1590", "1580", "1570", "1560", "1550", "1540", 
				"1530", "1520", "1510", "1500", "1490", "1480", "1470", "1460", "1450", "1440", "1430", "1420",
				"1410", "1400", "1390", "1380", "1370"));
		sat.setTooltip(new Tooltip("Select your sat score"));
		
		sat.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Object>() 
		{
			public void changed(ObservableValue observable, Object oldValue, Object newValue)
			{
				idx = (int) newValue;
				int inputScore = -10 * idx + 1600;
				String res = "";
				for(int i=0; i<name.length; i++)
				{
					if(inputScore > score[i] - 20 && inputScore < score[i] + 20)
					{
						res += name[i] + " upperSAT:" + score[i] + "\n";
					}
				}
				collegeChoice.setText(res);
			}
		});
		
		
	}
}
