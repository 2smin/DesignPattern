package BuilderPattern.TourPlanBuilder;

public abstract class AbstractTourPlanBuilder {

    private int night;

    private int day;

    private String plan;

    private String traffic;

    private String resort;

    public void setNight(int night) {
        this.night = night;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    public int getNight() {
        return night;
    }

    public int getDay() {
        return day;
    }

    public String getPlan() {
        return plan;
    }

    public String getTraffic() {
        return traffic;
    }

    public String getResort() {
        return resort;
    }
}
