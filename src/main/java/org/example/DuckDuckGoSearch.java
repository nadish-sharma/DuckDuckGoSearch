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
    }
}