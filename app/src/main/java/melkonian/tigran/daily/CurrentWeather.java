package melkonian.tigran.daily;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Tigran on 12/30/2017.
 */

public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;


    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconID(){
        int iconID = R.drawable.clear_day;
        if (mIcon.equals("clear-day")){
            iconID = R.drawable.clear_day;
        }else if(mIcon.equals("clear-night")){
            iconID = R.drawable.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconID = R.drawable.rain;
        }
        else if (mIcon.equals("snow")) {
            iconID = R.drawable.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconID = R.drawable.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconID = R.drawable.wind;
        }
        else if (mIcon.equals("fog")) {
            iconID = R.drawable.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconID = R.drawable.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconID = R.drawable.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconID = R.drawable.cloudy_night;
        }
        return iconID;
    }

    public long getTime() {
        return mTime;
    }
    public String getFormattedTime(){
        SimpleDateFormat formatter =  new SimpleDateFormat("h:mm a", Locale.US);
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipChance = mPrecipChance * 100;
        return (int)Math.round(precipChance);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
