package _2_structural_pattern.BridgePattern;

public class Phone {

    Camera camera;

    String name;

    public Phone(Camera camera, String name) {
        this.camera = camera;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void takePicture(){
        System.out.println(getName() + " " + camera.useCamera());
    }


}
