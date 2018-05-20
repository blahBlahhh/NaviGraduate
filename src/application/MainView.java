package application;
	
import controller.StageController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class MainView extends Application {
	
	private StageController stageController;
	
	@Override
	public void start(Stage primaryStage) {
		stageController = new StageController();
		stageController.setPrimaryStage("primaryStage", primaryStage);
		
		stageController.loadStage(StageMap.mainViewID, StageMap.mainViewRes);
		stageController.loadStage(StageMap.alarmViewID, StageMap.alarmViewRes);
		stageController.loadStage(StageMap.infoViewID, StageMap.infoViewRes);
		stageController.loadStage(StageMap.calViewID, StageMap.calViewRes);
		stageController.loadStage(StageMap.rankViewID, StageMap.rankViewRes);
		stageController.loadStage(StageMap.consulateViewID, StageMap.consulateViewRes);
		stageController.loadStage(StageMap.matchViewID, StageMap.matchViewRes);
		
		stageController.setStage(StageMap.mainViewID);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
