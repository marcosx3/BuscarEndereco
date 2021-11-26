module com.sistemas.buscadorcep {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.google.gson;
    opens com.sistemas.buscadorcep to com.google.gson, javafx.fxml;
    exports com.sistemas.buscadorcep;
}