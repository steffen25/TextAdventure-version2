package TextAdventure;

public class Items {

	private String id;
	private String description;
        

	/**
	 * 
	 * @param id
	 * @param description
	 */
	public Items(String id, String description) {
            this.id = id;
            this.description = description;
	}

	public void canUnlock() { //can be used to unlock
            
        }

	public void canLight() { //can be used to light
	}

	public String getDescription() {
            return this.description;
	}
        
        public String getId() {
            return this.id;
        }
}
