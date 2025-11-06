module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires openai.java.client.okhttp;
    requires openai.java.core;


    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
}