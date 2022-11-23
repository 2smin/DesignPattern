package Singleton;

public class Setting3 {
    private static class holder{
        private static final Setting3 INSTANCE = new Setting3();
    }

    //inner class는 getInstance 호출 시점에 class loading, 자동으로 thread safe
    //lazy loading도 가능
    public static Setting3 getInstance(){
        return holder.INSTANCE;
    }
}
