package se_project.entity;

import java.io.Serializable;

public class AccountId implements Serializable {
    private int id;

    private int courseId;

	public AccountId(int id, int courseId) {
		super();
		this.id = id;
		this.courseId = courseId;
	}

    // default constructor

}