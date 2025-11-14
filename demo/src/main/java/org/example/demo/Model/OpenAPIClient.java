package org.example.demo.Model;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

import java.util.ArrayList;
import java.util.List;

//Sends request to API
public class OpenAPIClient {
    private final String apiKey = System.getenv("OPENAI_API_KEY");

    public Response sendRequest(List<String> requestMessage, String Model){
        List<ResponseCreateParams.Input> inputs = new ArrayList<>();

        if (apiKey == null) {
            throw new IllegalStateException("OPENAI_API_KEY is not set");
        }

        String prompt =
                "You are a music recommendation assistant. " +
                        "When the user asks for songs, always return a list of tracks. " +
                        "Keep responses short.";

        StringBuilder sb = new StringBuilder(prompt).append("\n\n");

        for (String line : requestMessage) {
            sb.append(line).append("\n");
        }

        ResponseCreateParams params = ResponseCreateParams.builder()
                .input(sb.toString())
                .model(Model)
                .build();

        OpenAIClient client = OpenAIOkHttpClient.fromEnv();
        //System.out.println("RESPONSE = " + client.responses().create(params));
        return client.responses().create(params);
    }
}
