module com.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens oose.oose.fis.lab.student.manager to javafx.fxml;
    exports oose.oose.fis.lab.student.manager;
}