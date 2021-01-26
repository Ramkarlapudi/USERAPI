package com.ramkarlapudi.UserAPI.model;

import java.util.Date;

public class PlayerProfile {

	// players Profile Variables

	public String lastName;
	public Date t20DebutDate;
	public String battingStyle;
	public String fullName;
	public String bio;
	public String didYouKnow;
	public String bowlingStyle;
	public String firstName;
	public Date testDebutDate;
	public Date dob;
	public Date odiDebutDate;
	public String imageURL;
	public String playerType;
	public int playerId;
	public String height;

	public PlayerProfile() {
		super();
	}

	@Override
	public String toString() {
		return "PlayerProfile [lastName=" + lastName + ", t20DebutDate=" + t20DebutDate + ", battingStyle="
				+ battingStyle + ", fullName=" + fullName + ", bio=" + bio + ", didYouKnow=" + didYouKnow
				+ ", bowlingStyle=" + bowlingStyle + ", firstName=" + firstName + ", testDebutDate=" + testDebutDate
				+ ", dob=" + dob + ", odiDebutDate=" + odiDebutDate + ", imageURL=" + imageURL + ", playerType="
				+ playerType + ", playerId=" + playerId + ", height=" + height + "]";
	}

	public PlayerProfile(String lastName, Date t20DebutDate, String battingStyle, String fullName, String bio,
			String didYouKnow, String bowlingStyle, String firstName, Date testDebutDate, Date dob, Date odiDebutDate,
			String imageURL, String playerType, int playerId, String height) {
		super();
		this.lastName = lastName;
		this.t20DebutDate = t20DebutDate;
		this.battingStyle = battingStyle;
		this.fullName = fullName;
		this.bio = bio;
		this.didYouKnow = didYouKnow;
		this.bowlingStyle = bowlingStyle;
		this.firstName = firstName;
		this.testDebutDate = testDebutDate;
		this.dob = dob;
		this.odiDebutDate = odiDebutDate;
		this.imageURL = imageURL;
		this.playerType = playerType;
		this.playerId = playerId;
		this.height = height;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getT20DebutDate() {
		return t20DebutDate;
	}

	public void setT20DebutDate(Date t20DebutDate) {
		this.t20DebutDate = t20DebutDate;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getDidYouKnow() {
		return didYouKnow;
	}

	public void setDidYouKnow(String didYouKnow) {
		this.didYouKnow = didYouKnow;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getTestDebutDate() {
		return testDebutDate;
	}

	public void setTestDebutDate(Date testDebutDate) {
		this.testDebutDate = testDebutDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getOdiDebutDate() {
		return odiDebutDate;
	}

	public void setOdiDebutDate(Date odiDebutDate) {
		this.odiDebutDate = odiDebutDate;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
