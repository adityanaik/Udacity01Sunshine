package ga.aditya.udacity01sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Aditya on 3/7/2015.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException {

        JSONObject weather = new JSONObject(weatherJsonStr);

        JSONArray days = weather.getJSONArray("list");

        JSONObject day = days.getJSONObject(dayIndex);

        JSONObject temperature = day.getJSONObject("temp");
        Double maxTemperature = temperature.getDouble("max");

        return maxTemperature;
    }
}
