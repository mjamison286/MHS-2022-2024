import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;

public class ChatGPT {
    private static final String API_KEY = "<YOUR API KEY HERE>";
    private static final String API_URL = "https://api.openai.com/v1/engines/davinci/jobs";
    private static final OkHttpClient client = new OkHttpClient();
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public static String generateResponse(String prompt) throws IOException {
        String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 100}";
        RequestBody body = RequestBody.create(JSON, requestBody);
        Request request = new Request.Builder()
                .url(API_URL)
                .addHeader("Authorization", "Bearer " + API_KEY)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
