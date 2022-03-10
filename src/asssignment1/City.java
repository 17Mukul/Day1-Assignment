package asssignment1;

public class City {
	
	public String getCityByCode(int num) {
		if (num == 1)
			return "DELHI";
		else if (num == 2)
			return "NOIDA";
		else if (num == 3)
			return "GURGAON";
		else if (num == 4)
			return "BANGALORE";
		else
			return "INVALIDCODE";

	}

}
