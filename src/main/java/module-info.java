module com.example.aventurasdemarcoyluis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aventurasdemarcoyluis to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model;
    opens com.example.aventurasdemarcoyluis.model to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters;
    opens com.example.aventurasdemarcoyluis.model.Characters.PrincipalCharacters to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.Characters.Enemies;
    opens com.example.aventurasdemarcoyluis.model.Characters.Enemies to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.model.Items;
    opens com.example.aventurasdemarcoyluis.model.Items to javafx.fxml;
}