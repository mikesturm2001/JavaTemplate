import DependencyInjection.Car;
import DependencyInjection.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    //@Before
    //Executed before each test. It is used to prepare the test environment (e.g., read input data, initialize the class).

    @Test
    public void vehicleLocationTest() {
        Car car = new Car();

        Vehicle tester = new Vehicle(car); // MyClass is tested
        tester.setDestination("Dallas");

        // assert statements
        assertEquals("Dallas", tester.getDestination(), "Dallas");
    }

    //@After
    //Executed after each test. It is used to cleanup the test environment (e.g., delete temporary data, restore defaults).
    // It can also save memory by cleaning up expensive memory structures.
}
