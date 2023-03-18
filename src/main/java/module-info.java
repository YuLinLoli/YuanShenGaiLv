module com.example.yuanshenchouka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yuanshenchouka to javafx.fxml;
    exports com.example.yuanshenchouka;
}