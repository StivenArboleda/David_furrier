package ui;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.Client;
import model.Player;

public class FurrierController {
	private Stage stage;
	@FXML
	private BorderPane basePane;
	
	public FurrierController(Stage s) throws IOException {
		stage=s;
	}
	public void initialize() {
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	
				@Override
				public void handle(WindowEvent event) {
					System.out.println(" ");
					try {
						//METODO PARA SERIALIZAR TODO INVENTARIO
						um.saveRootUsers();
					} catch (FileNotFoundException e) {
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			});
	}
	public void loadMenuScreen(){
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("InitialMenu.fxml"));
		fxmload.setController(this);
		Parent root;
		try {
			root = fxmload.load();
			basePane.getChildren().clear();
			basePane.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@FXML
	void loadDeliveries(ActionEvent event) {

	}

	@FXML
	void loadEntry(ActionEvent event) {
		loadEntryScreen();
	}

	@FXML
	void loadInventory(ActionEvent event) {

	}

	@FXML
	void loadReports(ActionEvent event) {
		loadReportsScreen();
	}
	public void loadEntryScreen(){
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("Entry.fxml"));
		fxmload.setController(this);
		Parent root;
		try {
			root = fxmload.load();
			basePane.getChildren().clear();
			basePane.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@FXML
    private TextField nameClienteText;

    @FXML
    private TextField lastNameClienteText;

    @FXML
    private TextField phoneText;

    @FXML
    private TextField idClientText;

    @FXML
    private TextField nameProductText;

    @FXML
    private TextField initialPaymentText;

    @FXML
    private TextField reimaningBalanceText;

    @FXML
    private TextField totalBalanceText;

    @FXML
    private TextField admisionText;

    @FXML
    private TextField consecutivoClientText;

    @FXML
    private TextField deliveryText;

    @FXML
    private TextArea descriptionText;

    @FXML
    void addEntry(ActionEvent event) {

    }
    public void loadReportsScreen(){
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("Reports.fxml"));
		fxmload.setController(this);
		Parent root;
		try {
			root = fxmload.load();
			basePane.getChildren().clear();
			basePane.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    @FXML
    private TableView<Client> tableReports;
    @FXML
    private TableColumn<Client, String> idName;

    @FXML
    private TableColumn<Client, String> idLastName;

    @FXML
    private TableColumn<Client, Integer> idIdentification;

    @FXML
    private TableColumn<Client, String> idPhone;

    @FXML
    private TableColumn<Client, Double> idRemainingBalance;

    @FXML
    private TableColumn<Client, Double> idPayment;

    @FXML
    private TableColumn<Client, String> idState;

    @FXML
    private TextField idText;

    @FXML
    private TextField consecutivoText;

    @FXML
    void searchReport(ActionEvent event) {

    }

    public void loadTableReports() {
    	basePane.setOnKeyPressed(null);
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("Reports.fxml"));
		fxmload.setController(this);
		Parent root;
		try {
			root = fxmload.load();
			basePane.getChildren().clear();
			basePane.setCenter(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
		tableReports.getItems().clear();
		//METODO PARA LISTAR TODOS LOS PRODUCTOS
			ObservableList<Client>list= FXCollections.observableArrayList(players);
			tableReports.setItems(list);
			idName.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
			idLastName.setCellValueFactory(new PropertyValueFactory<Client,String>("lastName"));
			idIdentification.setCellValueFactory(new PropertyValueFactory<Client,Integer>("id"));
			idPhone.setCellValueFactory(new PropertyValueFactory<Client,String>("phone"));
			idRemainingBalance.setCellValueFactory(new PropertyValueFactory<Client,Double>("remainingBalance"));
			idPayment.setCellValueFactory(new PropertyValueFactory<Client,Double>("pays"));
			idState.setCellValueFactory(new PropertyValueFactory<Client,String>("state"));
			
    }
}
