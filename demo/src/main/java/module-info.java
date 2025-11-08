module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires openai.java.client.okhttp;
    requires openai.java.core;
    requires com.google.gson;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires org.apache.httpcomponents.core5.httpcore5;

    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
}