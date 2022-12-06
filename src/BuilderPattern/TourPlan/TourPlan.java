package BuilderPattern.TourPlan;

public abstract class TourPlan {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    private int night;

    private int day;

    private String plan;

    private String traffic;

    private String resort;


    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public String getResort() {
        return resort;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "type='" + type + '\'' +
                ", night=" + night +
                ", day=" + day +
                ", plan='" + plan + '\'' +
                ", traffic='" + traffic + '\'' +
                ", resort='" + resort + '\'' +
                '}';
    }
}
