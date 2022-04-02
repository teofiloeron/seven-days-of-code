package com.eronapps.model;

public class Filme {

	public String Id;
	public String Rank;
	public String Title;
	public String FullTitle;
	public String Year;
	public String Image;
	public String Crew;
	public String ImDbRating;
	public String ImDbRatingCount;

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
	
//	public class Builder {
//		
//		private Filme filme = null;
//		
//		public Builder() {
//			filme = new Filme();
//		}
//		
//		public Filme setId				(String string) {return this.filme;};
//		public Filme setRank			(String string) {return this.filme;};
//		public Filme setTitle			(String string) {return this.filme;};
//		public Filme setFullTitle		(String string) {return this.filme;};
//		public Filme setYear			(String string) {return this.filme;};
//		public Filme setImage			(String string) {return this.filme;};
//		public Filme setCrew			(String string) {return this.filme;};
//		public Filme setImDbRating		(String string) {return this.filme;};
//		public Filme setImDbRatingCount (String string) {return this.filme;};
//		
//		public Filme build() {
//			return this.filme;
//		}
//	}

}
