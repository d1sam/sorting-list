module com.example.sortinglist2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sortinglist2 to javafx.fxml;
    exports com.example.sortinglist2;
}
