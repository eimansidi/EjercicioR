module com.eiman.ejr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eiman.ejr to javafx.fxml;
    exports com.eiman.ejr;
}