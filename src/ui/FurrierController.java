package ui;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import CustomExceptions.AlreadyAddedNumberException;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Central;
import model.Client;

public class FurrierController {
	
	private Central c;
	
	private Stage stage;
	@FXML
	private BorderPane basePane;
	
	public FurrierController(Stage s) throws IOException {
		stage=s;
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
		loadDeliveriesScreen();
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
    private DatePicker admisionText;

    @FXML
    private TextField consecutivoClientText;

    @FXML
    private DatePicker deliveryText;

    @FXML
    private TextArea descriptionText;

    @FXML
    void addEntry(ActionEvent event) {

    }
    public void loadDeliveriesScreen(){
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("Deliveries.fxml"));
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
    	loadTableDeliveries();
    }

   public void loadTableDeliveries() {
    	basePane.setOnKeyPressed(null);
		FXMLLoader fxmload = new FXMLLoader(getClass().getResource("Deliveries.fxml"));
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
			ObservableList<Client>list= FXCollections.observableArrayList();
			tableReports.setItems(list);
			idName.setCellValueFactory(new PropertyValueFactory<Client,String>("name"));
			idLastName.setCellValueFactory(new PropertyValueFactory<Client,String>("lastName"));
			idIdentification.setCellValueFactory(new PropertyValueFactory<Client,Integer>("id"));
			idPhone.setCellValueFactory(new PropertyValueFactory<Client,String>("phone"));
			idRemainingBalance.setCellValueFactory(new PropertyValueFactory<Client,Double>("remainingBalance"));
			idPayment.setCellValueFactory(new PropertyValueFactory<Client,Double>("pays"));
			idState.setCellValueFactory(new PropertyValueFactory<Client,String>("state"));
			
    }
   @FXML
   void loadBack(ActionEvent event) {
	   loadMenuScreen();
   }
   @FXML
   void loadBackReports(ActionEvent event) {
	   loadMenuScreen();
   }

/*	@FXML
   void loadSave(ActionEvent event) {
	   totalPayment();
	   
	   Timer timer = new Timer();
	   
	   TimerTask loadAgain = new TimerTask() {
		
		@Override
		public void run() {
			
			Platform.runLater(new Runnable() {
				public void run() {
					loadEntryScreen();
				}
			});
		}
	};
	timer.schedule(loadAgain, 3000);
	}*/
   
   @FXML
   void loadSave(ActionEvent event) {
	   double initial = Double.parseDouble(initialPaymentText.getText());
	   double reimaning = Double.parseDouble(reimaningBalanceText.getText());
	   double total = initial + reimaning;
	   JOptionPane.showMessageDialog(null, "El saldo total es: " + total);
	   try {
		c.addClients(nameClienteText.getText(), lastNameClienteText.getText(), phoneText.getText());
		loadEntryScreen();
	} catch (AlreadyAddedNumberException e) {
		
		e.printStackTrace();
	}
	   loadEntryScreen();
   }
   
   void loadProduct() {
	   
   }
   
   @FXML
   void loadSearch(ActionEvent event) {
	   
	   String phone = idText.getText();
	   Client client = c.search(phone);
	   if( client != null){
		   //consecutivoText.setText(client.getRepair().get(0).getConsecutive() + "");
		   consecutivoText.setText("Hola c:");
	   }
	   
   }
   /*@FXML
   void totalPayment() {
	   if(initialPaymentText.getText() != null && reimaningBalanceText.getText() != null) {
		   double initial = Double.parseDouble(initialPaymentText.getText());
		   double reimaning = Double.parseDouble(reimaningBalanceText.getText());
		   totalBalanceText.setText(initial+reimaning+"");
	   }
   }*/
}
