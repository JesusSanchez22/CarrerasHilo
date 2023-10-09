package com.example.carrerahilos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class HelloController {



    @FXML
    private Button buttonStart;

    @FXML
    private ProgressBar progressBar1;

    @FXML
    private ProgressBar progressBar2;

    @FXML
    private ProgressBar progressBar3;

    @FXML
    private ProgressBar progressBar4;

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        ProgressIndicator end = new ProgressIndicator(1);

        progressBar1.setProgress(1);
        ProgressIndicator indicator = new ProgressIndicator(0.6);

        while(progressBar1.getProgress() != 1){

        }

        int contador = 0;
        if (progressBar1.getProgress() != 1){

        } else if (progressBar2.getProgress() != 1) {

        } else if (progressBar3.getProgress() != 1) {

        } else if (progressBar4.getProgress() != 1) {

        }
    }

}
