package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.CheckProblemsItems;

public class MainController {
    @FXML
    public TableColumn trainPart;
    public TableColumn num;
    public TableColumn statusName;
    public TableColumn charger;
    public TableColumn phone;
    public TableView checkProblemsTable;


    @FXML
    public Button menDocButton;
    public Button updateStatusButton;

//    @FXML
//    private TableView CheckProblemsItems;

    @FXML
    public void initialize(){
        ObservableList<CheckProblemsItems> list = FXCollections.observableArrayList();
        CheckProblemsItems checkProblemsItems = new CheckProblemsItems();
//        这里后期换数据库
        checkProblemsItems.setTrainPart("XX局XX段");
        checkProblemsItems.setNum("001");
        checkProblemsItems.setStatusName("故障");
        checkProblemsItems.setCharger("XXX");
        checkProblemsItems.setPhone("123456");
        list.addAll(checkProblemsItems);

        trainPart.setCellValueFactory(new PropertyValueFactory("trainPart"));
        num.setCellValueFactory(new PropertyValueFactory("num"));
        statusName.setCellValueFactory(new PropertyValueFactory("statusName"));
        charger.setCellValueFactory(new PropertyValueFactory("charger"));
        phone.setCellValueFactory(new PropertyValueFactory("phone"));

        checkProblemsTable.setItems(list);


        ImageView imageView = new ImageView(new Image("file:../../static/imgs/search.png"));
//        Button button = new Button("acc",new ImageView(imageView));
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        menDocButton.setGraphic(imageView);

        ImageView imageView1 = new ImageView(new Image("file:../../static/imgs/refresh.png"));
//        Button button = new Button("acc",new ImageView(imageView));
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);
        updateStatusButton.setGraphic(imageView1);


    }
}
