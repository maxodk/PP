module com.example.tarik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;


    opens com.example.tarik to javafx.fxml;
    opens data to javafx.fxml;
    opens database to javafx.fxml;
    exports com.example.tarik;
    exports data;
    exports database;
}