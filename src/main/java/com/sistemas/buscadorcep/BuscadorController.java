package com.sistemas.buscadorcep;

import com.google.gson.Gson;
import com.sistemas.buscadorcep.leitorJSON.LeitorAPI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.HashMap;
import java.util.Iterator;

public class BuscadorController {

    @FXML
    private Button btnBuscarCEP;

    @FXML
    private Button btnLimpar;

    @FXML
    private TextField txtBairro;

    @FXML
    private TextField txtCEP;

    @FXML
    private TextField txtComplemento;

    @FXML
    private TextField txtDDD;

    @FXML
    private TextField txtIBGE;

    @FXML
    private TextField txtLocalidade;

    @FXML
    private TextField txtLogradouro;

    @FXML
    private TextField txtUF;

    @FXML
    void buscarCEP(MouseEvent event) {



    /// apenas buscar sem validar
        LeitorAPI leitor = new LeitorAPI();
        Gson gson = new Gson();
        Endereco ende = gson.fromJson(leitor.buscarCEP(txtCEP.getText()),Endereco.class);
        txtBairro.setText(ende.getBairro());
        txtComplemento.setText(ende.getComplemento());
        txtDDD.setText(ende.getDdd());
        txtIBGE.setText(ende.getIbge());
        txtLocalidade.setText(ende.getLocalidade());
        txtUF.setText(ende.getUf());
        txtLogradouro.setText(ende.getLogradouro());

    }

    @FXML
    void limparCampos(MouseEvent event) {
        txtCEP.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtDDD.setText("");
        txtIBGE.setText("");
        txtLocalidade.setText("");
        txtUF.setText("");
        txtLogradouro.setText("");
    }

}
