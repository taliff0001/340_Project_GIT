import java.util.ArrayList;

public class FlightsDAO {

	private ArrayList<Flight> flightsList;
		
	public FlightsDAO() {
		this.flightsList = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "FlightsDAO [flightsList=" + flightsList + "]";
	}

	public void addFlight(Flight f) {
		flightsList.add(f);
	}

	public ArrayList<Flight> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(ArrayList<Flight> flightsList) {
		this.flightsList = flightsList;
	} 
	
}
