package BuilderPattern.TourPlanBuilder;

import BuilderPattern.TourPlan.DefaultTourPlan;
import BuilderPattern.TourPlan.TourPlan;

public class DefaultTourPlanBuilder extends AbstractTourPlanBuilder implements TourPlanBuilder{


    @Override
    public TourPlanBuilder nightAndDays(int night, int day){
        setNight(night);
        setDay(day);
        return this;
    }

    @Override
    public TourPlanBuilder plan(String plan){
        setPlan(plan);
        return this;
    }

    @Override
    public TourPlanBuilder resort(String resort){
       setResort(resort);
        return this;
    }

    @Override
    public TourPlanBuilder traffic(String traffic){
        setTraffic(traffic);
        return this;
    }

    @Override
    public TourPlan getTourPlan(){
        return new DefaultTourPlan(getNight(),getDay(),getPlan(),getResort(),getTraffic());
    }
}
