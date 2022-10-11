package org.example;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import static jdk.internal.org.objectweb.asm.Type.getType;

public class DuckDuckGoSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Creating a user input for search
        String qTemp = "";
        System.out.println("Please type what you want to search");
        Scanner scan = new Scanner(System.in);
        qTemp = scan.nextLine();
        StringBuilder q = new StringBuilder();
        String[] arr = qTemp.split(" ");
        for(int i = 0; i < arr.length; i++) {
            q.append(arr[i]);
            if(i != arr.length - 1)
                q.append("%20");
        }
        // GET request sent
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://duckduckgo8.p.rapidapi.com/?q="+q))
                .header("X-RapidAPI-Key", "8c4ea13a70mshdf3abffbd1c5fc2p1a3a20jsne68f5efa41cc")
                .header("X-RapidAPI-Host", "duckduckgo8.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
       // RESPONSE from GET is captured in response.body()
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
}