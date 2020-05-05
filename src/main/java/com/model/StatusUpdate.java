package com.model;

public class StatusUpdate {

	// COMMENTS: You need to declare private
	String description = "";
	String user_title = "";
	String created_at = "";

	public StatusUpdate(String description, String user_title, String created_at) {
		super();
		this.description = description;
		this.user_title = user_title;
		this.created_at = created_at;
	}

	public StatusUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser_title() {
		return user_title;
	}

	public void setUser_title(String user_title) {
		this.user_title = user_title;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

}
