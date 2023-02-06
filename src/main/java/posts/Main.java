package posts;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import posts.models.Post;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OkHttpClient okHttpClient = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        String baseUrl = "https://jsonplaceholder.typicode.com/posts";

        HttpUrl.Builder weatherBuilder =  HttpUrl.parse(baseUrl).newBuilder();

        String url = weatherBuilder.build().toString();

        Request request = new Request.Builder().url(url).build();

        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();

            List<Post> postList = objectMapper.readValue(response.body()
                    .string(), new TypeReference<List<Post>>() {});

            postList.stream().
                    filter(e -> e.getUserId() % 2 == 0).forEach(x -> System.out.println(x));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
