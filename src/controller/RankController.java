package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.StageMap;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import universityRank.StringUniversity;
import universityRank.University;
import universityRank.UniversityRank;

public class RankController extends Controller
{
	@FXML
	private TableView<University> table;
	@FXML
	private TableColumn<University, String> rankCol;
	@FXML
	private TableColumn<University, String> uCol;
	@FXML
	private TableColumn<University, String> satCol;
	@FXML
	private TableColumn<University, String> rateCol;

	public RankController()
	{
		super(StageMap.rankViewID);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		rankCol.setCellValueFactory(cellData -> cellData.getValue().rankProperty());
		uCol.setCellValueFactory(cellData -> cellData.getValue().nameProperty());  
        satCol.setCellValueFactory(cellData -> cellData.getValue().SATProperty());  
        rateCol.setCellValueFactory(cellData -> cellData.getValue().rateProperty()); 
        showList();
	}
	
	private void showList(){  
        ObservableList<University> list = FXCollections.observableArrayList();
        UniversityRank ur = new UniversityRank();
        for(int i=0; i<50; i++)
        {
	        StringUniversity tempStringU = new StringUniversity();  
	        tempStringU.setRank(String.valueOf(i+1));
	        tempStringU.setName(ur.university[i]);  
	        tempStringU.setSAT(String.valueOf(ur.upperSAT[i]));  
	        tempStringU.setRate(String.valueOf(ur.rate[i]));
	        University tempU = new University(tempStringU);
	        list.add(tempU);
        }
        table.setItems(list);  
    }  

}
