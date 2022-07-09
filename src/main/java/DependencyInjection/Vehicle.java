package DependencyInjection;

public class Vehicle {

    private String destination; // private = restricted access

    IVehicle vehicleService;

    public Vehicle(IVehicle vehicleService) {
        this.vehicleService = vehicleService;
    }

    public String getInfo() {
        return vehicleService.getInfo();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
