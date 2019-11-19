import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before(){
        bus = new Bus("Fife",2);
        passenger = new Person();
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void passengerAllowedOnBus(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void passengerNotAllowed(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(2, bus.countPassengers());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }
}
