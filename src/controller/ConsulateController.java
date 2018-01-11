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

public class ConsulateController extends Controller
{
	@FXML
	private ChoiceBox<String> nation;
	@FXML
	private ChoiceBox<String> district;
	@FXML
	private TextArea consulateInfo;
	
	private int nationCode = -1;

	public ConsulateController()
	{
		super(StageMap.consulateViewID);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		nation.setItems(FXCollections.observableArrayList("America", "Canada", "Britain"));
		nation.setTooltip(new Tooltip("Select the nation"));
		ObservableList<String> AmericanCity = FXCollections.observableArrayList(
				"New York", "San Francisco", "Chicago", "Houston", "Los Angles"
		);
		ObservableList<String> CanadianCity = FXCollections.observableArrayList(
				"Ottawa", "Toronto", "Vancouver", "Calgary", "Montreal"
		);
		ObservableList<String> BritishCity = FXCollections.observableArrayList(
				"Edinburgh", "Manchester", "Belfast"
		);
		
		nation.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Object>() 
		{
			public void changed(ObservableValue observable, Object oldValue, Object newValue)
			{
				nationCode = (int) newValue;
				switch((int) newValue)
				{
				case 0:
					district.setItems(AmericanCity);
					break;
				case 1:
					district.setItems(CanadianCity);
					break;
				case 2:
					district.setItems(BritishCity);
					break;
				default:
					district.setItems(FXCollections.observableArrayList("Select nation"));
					break;
				}
			}
		});
		district.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Object>() 
		{
			public void changed(ObservableValue observable, Object oldValue, Object newValue)
			{
				switch(nationCode)
				{
				case 0:
					America america = new America((int) newValue);
					String aRes = america.getInformation();
					consulateInfo.setText(aRes);
					break;
				case 1:
					Canada canada = new Canada((int) newValue);
					String cRes = canada.getInformation();
					consulateInfo.setText(cRes);
					break;
				case 2:
					Britain britain = new Britain((int) newValue);
					String bRes = britain.getInformation();
					consulateInfo.setText(bRes);
					break;
				}
			}
		});
		
	}

}
