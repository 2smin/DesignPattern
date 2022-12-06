package BuilderPattern;

import BuilderPattern.TourPlan.SpecialTourPlan;
import BuilderPattern.TourPlan.TourPlan;
import BuilderPattern.TourPlanBuilder.DefaultTourPlanBuilder;
import BuilderPattern.TourPlanBuilder.SpecialTourPlanBuilder;
import BuilderPattern.TourPlanBuilder.TourPlanBuilder;

public class Main {

    public static void main(String[] args) {

        TourPlanBuilder tourPlanBuilder = new DefaultTourPlanBuilder();

        TourPlan tourPlan = tourPlanBuilder
                .plan("밥")
                .nightAndDays(3,4)
                .resort("grand resort")
                .traffic("car").getTourPlan();

        System.out.println(tourPlan.toString());


        TourDirector director = new TourDirector(new DefaultTourPlanBuilder());

        TourPlan tourPlan1 = director.americaTrip();

        System.out.println(tourPlan1);

        director = new TourDirector(new SpecialTourPlanBuilder());

        TourPlan tourPlan2 = director.americaTrip();

        System.out.println(tourPlan2);

        System.out.println(tourPlan2.getClass());

        SpecialTourPlan plan = (SpecialTourPlan)tourPlan2;
        System.out.println(plan.getTicket());
    }
}
