package com.eronapps.model;

public class Filme {

	private String Id;
	private String Rank;
	private String Title;
	private String FullTitle;
	private String Year;
	private String Image;
	private String Crew;
	private String ImDbRating;
	private String ImDbRatingCount;

	public Filme() {
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getFullTitle() {
		return FullTitle;
	}

	public void setFullTitle(String fullTitle) {
		FullTitle = fullTitle;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getCrew() {
		return Crew;
	}

	public void setCrew(String crew) {
		Crew = crew;
	}

	public String getImDbRating() {
		return ImDbRating;
	}

	public void setImDbRating(String iMDbRating) {
		ImDbRating = iMDbRating;
	}

	public String getImDbRatingCount() {
		return ImDbRatingCount;
	}

	public void setImDbRatingCount(String iMDbRatingCount) {
		ImDbRatingCount = iMDbRatingCount;
	}

	@Override
	public String toString() {
		return String.format(
				"Filme [Id=%s, Rank=%s, Title=%s, FullTitle=%s, Year=%s, Image=%s, Crew=%s, IMDbRating=%s, IMDbRatingCount=%s]",
				Id, Rank, Title, FullTitle, Year, Image, Crew, ImDbRating, ImDbRatingCount);
	}
	

}
