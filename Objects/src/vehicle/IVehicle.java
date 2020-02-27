package vehicle;

public interface IVehicle {

    String getBrand();
    String getPate();

    void accelerated(int ratio);
    void stop(int ratio);

    void engineOn();
    void engineOff();

}
