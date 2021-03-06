/*
 * CSC 221 - Assignment 4
 * Library Database
 * by Klaudio Vito
 * 10/21/2015
 */
import java.util.Date;

public class Textbook extends Item {
	private String author;

	public Textbook(String id, String title, Date addedOn, String author) {
		super(id,title,addedOn);
		this.id = id;
		this.title = title;
		this.addedOn = addedOn;
		this.author = author;	
	}

	public void setAuthor(String author){ this.author = author; }
	
	@Override
	public String getAuthor(){ return author; }
	
	@Override
	public void setID(String id) { this.id = id; }
	
	@Override
	public String getID() { return this.id; }

	@Override
	public void setTitle(String title) { this.title = title; }

	@Override
	public String getTitle() { return this.title; }

	@Override
	public void setDate(Date addedOn) { this.addedOn = addedOn; }

	@Override
	public Date getDate() { return this.addedOn; }

	@Override
	public int compareTo(Item o) { return 0; }
	
	@Override
	public String getDirector() { return "Not applicable"; }
	
	@Override
	public String getArtist() { return "Not applicable"; }

	@Override
	public int getPlayingTime() { return 0; }
}
