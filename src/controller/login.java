package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class login {
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    protected void loginButtonClick() throws Exception {
        if(username.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("请输入用户名");
            alert.show();return;
        }
        if(password.getText().equals("")){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("请输入密码");
            alert.show();return;
        }


        if(username.getText().equals("admin") && password.getText().equals("123456")){
            Parent root = FXMLLoader.load(getClass().getResource("../view/main.fxml"));
            ((Stage) username.getScene().getWindow()).hide();
            Stage mainStage = new Stage();
            mainStage.setScene(new Scene(root,1000,500));
            mainStage.setTitle("此处为系统名称");
            mainStage.show();
            mainStage.setResizable(false);
//            System.out.println("登录成功");
        }else{
//            System.out.println("登录失败");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("用户名或密码错误，请重试！");
            alert.show();
        }

    }
}
