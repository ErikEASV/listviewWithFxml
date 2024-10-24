module com.example.listviewwithfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listviewwithfxml to javafx.fxml;
    exports com.example.listviewwithfxml;
}