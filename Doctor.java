/**
 * 
 */

/**
 * @author Rohith
 *
 */
public class Doctor extends HospitalEmployee {
	String Specialty;

	public Doctor(String name, int number, String specialty) {
		super(name, number);
		Specialty = specialty;
	}

	@Override
	public String toString() {
		return "" + getName() + " " + getNumber() + " " + Specialty + ".";
	}

	public void work() {
		System.out.println(getName() + " works for the hospital. "+ getName() +" is a(n) Heart doctor.");
	}

}
