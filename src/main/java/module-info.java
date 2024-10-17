module es.ieslosmontecillos.ejemplojavafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.ejemplojavafxml to javafx.fxml;
    exports es.ieslosmontecillos.ejemplojavafxml;
}