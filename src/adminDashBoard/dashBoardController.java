package adminDashBoard;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class dashBoardController {
    @FXML
    private Button btnLoad;
    @FXML
    private TableView<Employee> employeeTable;
    //add colum from SB
    @FXML
    private  TableColumn<Employee,Integer> briid;
    @FXML
    private TableColumn<Employee,String> briname;
    @FXML
    private TableColumn<Employee String> briPosition;
    @FXML
    private TableColumn<Employee Double> briemail;
    @FXML
    private  TableColumn<Employee Double> briSalary

}
