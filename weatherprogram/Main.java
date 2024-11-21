package weatherprogram;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Main {

    private static final String API_KEY = "83093cb39f9e9ec882f2375898f2620d";
    private static final String CITY = "London"; // Replace this with the desired city name

    public static void main(String[] args) throws IOException {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + CITY + "&appid=" + API_KEY;
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    baos.writeBytes(inputLine.getBytes());
                }
            }

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(baos.toString());

            // Print formatted weather information
            System.out.println("Weather in " + jsonResponse.getString("name"));
            System.out.println("Temperature: " + (jsonResponse.getJSONObject("main").getDouble("temp") - 273.15) + "°C");
            System.out.println("Humidity: " + jsonResponse.getJSONObject("main").getInt("humidity") + "%");
            System.out.println("Description: " + jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description"));
        } finally {
            connection.disconnect();
        }
    }
}
