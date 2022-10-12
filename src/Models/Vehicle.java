package Models;

public class Vehicle extends BaseModel{
    private String number;
    private VehicleType vahicleType;

    public VehicleType getVahicleType() {
        return vahicleType;
    }

    public void setVahicleType(VehicleType vahicleType) {
        this.vahicleType = vahicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
