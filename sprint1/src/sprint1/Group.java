package sprint1;

import java.time.LocalDateTime;
import java.util.*;
import java.util.ArrayList;

public class Group{
	private LocalDateTime dateCreated;
	private String title;
	private String description;
	public ArrayList<Membership> memberships;
	public ArrayList<Question> questions;
	public ArrayList<Answer> answers;
	
	public Group(String title, String description, LocalDateTime dateCreated){
		this.title= title;
		this.description= description;
		this.dateCreated= dateCreated;
	}
	public LocalDateTime getDateCreated(){
		return dateCreated;
	}
	public String getTitle(){
		return title;
	}
	public String getDescription(){
		return description;
	}
	public int getNumMembers() {
		return memberships.size();
	}
	public Member getMember(String emailAddress){
		
		Member mem = null;
		for(Membership m : memberships) {
			if(m.member.getEmailAddress().equals(emailAddress)) {
				mem = m.member;
			}
		}
		return mem;
	}
	public List<Member> getMembers() {
		ArrayList<Member> members = new ArrayList<>();
		
		for(Membership m : memberships) {
			members.add(m.member);
		}
		return members;
	}
	public List<Question> getQuestion(){
		return questions;
	}
	public List<Answer> getAnswer(){
		return answers;
	}
	public String toString(){
		return "Title: "+ title + "Description: " + description + " Date Created: " + dateCreated + ".";
	}
}
