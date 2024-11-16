module com.eiman.ejr {
    requires com.eiman.ejq;
    requires javafx.fxml;
    requires javafx.controls;


    opens com.eiman.ejr to javafx.fxml;
    exports com.eiman.ejr;
}