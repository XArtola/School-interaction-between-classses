package com.zubiri.school;

public class Administrative extends Worker {

	private String[] languages = new String[5];

	private int numberOfLanguages = 0;

	private String administrativeID = "";

	public String[] getLanguages() {

		return languages;

	}

	public void setLanguages(String[] languages) {

		this.languages = languages;

	}
	
	/**
	 * 
	 * @return the number of languages already saved in the array of languages
	 */
	public int getNumberOfLanguages() {

		return numberOfLanguages;
	}

	/**
	 * 
	 * @return the id of the administrative
	 * <p>This ID is only used when you use a School class object</p>
	 */
	public String getAdministrativeID() {

		return administrativeID;

	}
	
	public void setAdministrativeID(String administrativeID) {

		this.administrativeID = administrativeID;
	}
	
	/**
	 * 
	 * @param string - language
	 * @return true if the language has not been inserted before
	 */
	public boolean repeatedLanguage(String language) {
		if(numberOfLanguages>0) {
			for (int i = 0; i < languages.length; i++)
				if (languages[i].equals(language)) {
					return false;
				}
		}
		
		return true;
	}
	
	/**
	 * 
	 * @param language you want to add
	 */
	public void addLanguages(String language) {
			languages[numberOfLanguages] = language;
			numberOfLanguages++;
	}
	
	/**
	 * 
	 * @param index of the language you want to delete
	 */
	public void removeLanguage(int index) {

		languages[index] = "";
	}
	
	/**
	 * 
	 * @param language you want the index of
	 * @return
	 */
	public int findLanguage(String language) {

		for (int i = 0; i < languages.length; i++) {

			if (languages[i].matches(language))

				return i;
		}

		return -1;

	}
}
