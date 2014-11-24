
import java.util.ArrayList;

public class Room {

	private String id; // west, center, east, north1, north2
	private boolean isDark; //is the room dark
	private boolean isLocked; //is there a locked door in the room
	private String description; //room description
	private ArrayList<Items> itemsList; //ArrayList of all items in the room

	/**
	 * 
	 * @param id
	 * @param objects
   	 * @param hasLight
	 * @param isLocked
	 * @param description
	 */
	public Room(String id, Items objects, boolean hasLight, boolean isLocked, String description) {
	}

	public boolean getIsDark() {
            return this.isDark;
	}

	/**
	 * 
	 * @param isLight
	 */
	public void setIsDark(boolean isLight) { //can use method to light room if boolean is set to false
		this.isDark = isDark;
	}

	public boolean getIsLocked() {
		return this.isLocked;
	}

	/**
	 * 
	 * @param isLocked
	 */
	public void setIsLocked(boolean isLocked) { //can use method to unlock room if boolean is set to false
		this.isLocked = isLocked;
	}

	public void ifNoFlashlight() {
            //enter room but return text for no light and do not return items ArrayList for the room
	}

	public void ifNoKey() {
            //return text for no key and do not enter room
	}

	public String getDescription() { //return room description
		return this.description;
	}

	public ArrayList<Items> getItemsList() { //return items in room
		return this.itemsList;
	}

}
