package com.ynov.biblio.com.ynov.biblio.bean.table;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
	private int id;
	private String myuser;
	private String email;
	private String webPage;
	private Date datum;
	private String summary;
	private String comments;
}
