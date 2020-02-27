package vehicle;

public abstract class Car implements IVehicle {
    private String brand;
    private String plate;

    private int actualSpeed;
    private int speedLimit;
    final int NO_SPEED = 0;

    private boolean isEngineON;


    Car(String brand, int speedLimit){
        this.brand = brand;
        this.actualSpeed = 0;
        this.speedLimit = speedLimit;
        this.isEngineON = false;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getPate() {
        return plate;
    }

    public boolean validateEngine(){
        if (isEngineON){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void accelerated(int ratio){
        int newSpeed = actualSpeed  + actualSpeed*ratio;

        if ( !validateEngine() ){
            System.out.println("Turn on Engine");
            return;
        }

        if(newSpeed > speedLimit){
            this.actualSpeed = this.speedLimit;
            System.out.println("You are at the limit");

        }else{
            this.actualSpeed = actualSpeed  + actualSpeed*ratio;
        }

        System.out.println("Speed at -> " + this.actualSpeed);
    }

    @Override
    public void stop(int ratio) {
        int newSpeed = actualSpeed  - actualSpeed*ratio;

        if ( !validateEngine() ){
            System.out.println("Turn on Engine");
            return;
        }

        if(newSpeed < NO_SPEED){
            this.actualSpeed = NO_SPEED;
            System.out.println("You are at the limit of non speed");

        }else{
            this.actualSpeed = actualSpeed  - actualSpeed*ratio;
        }

        System.out.println("Speed at -> " + this.actualSpeed);
    }

    @Override
    public void engineOn() {
        if( !(isEngineON)){
            System.out.println("Engine ON.");
            isEngineON = true;
        }else{
            System.out.println("Engine is already ON.");
        }

    }

    @Override
    public void engineOff() {
        if( isEngineON){
            System.out.println("Engine OFF.");
            isEngineON = false;
        }else{
            System.out.println("Engine is already OFF.");
        }
    }

}
