package org.example.demo.Model;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.ResponseCreateParams;
//Sends request to API
public class OpenAPIClient {

    public void sendRequest(String requestMessage, String Model){
        OpenAIClient client = OpenAIOkHttpClient.fromEnv();

        ResponseCreateParams params = ResponseCreateParams.builder()
                .input(requestMessage)
                .model(Model)
                .build();
    }

}
