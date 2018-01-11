package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import application.StageMap;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXML;

public class CalController extends Controller
{
	@FXML
	private SwingNode swingNode;

	public CalController()
	{
		super(StageMap.calViewID);
	}
	
//	@Override
//	public void initialize(URL location, ResourceBundle resources)
//	{
//		createSwingContent(swingNode);
//	}
//	
//	private void createSwingContent(final SwingNode swingNode) {
//        SwingUtilities.invokeLater(() -> {
//            swingNode.setContent(new Conversion());
//        });
//    }

}
