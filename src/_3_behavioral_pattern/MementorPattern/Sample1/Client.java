package _3_behavioral_pattern.MementorPattern.Sample1;

public class Client {
    /*
   mementor pattern
   객체 내부의 상태를 저장하고싶을때 사용 / client는 객체 내부가 어케생겼는지 몰라야함 (객체지향 원칙이자너)
   저장하고자 하는 상태를 가진 객체 : originator
   상태를 저장하는 객체 : mementor
   memontor를 가지고 있는 객체 : careTaker (여기서는 client가 careTaker 수행)
    */
    public static void main(String[] args) {

        BatchTask batchTask = new BatchTask();
        batchTask.setStartFrom("2022-10-11");
        batchTask.setCurrentStep("stepC");

        BatchSave batchSave = batchTask.save();

        batchTask.setCurrentStep("StepX");
        batchTask.setStartFrom("2022-09-11");

        batchTask.restore(batchSave);

        System.out.println(batchTask.getCurrentStep());
        System.out.println(batchTask.getStartFrom());
    }
}
