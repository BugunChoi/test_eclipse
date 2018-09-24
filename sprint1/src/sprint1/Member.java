package sprint1;

import java.util.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member{
	
	private LocalDateTime dateCreated;
	private String firstname;
	private String lastname;
	private String screenName;
	private String emailAddress;
	private ArrayList<Membership> memberships = new ArrayList<>();

	public Member(String firstname, String lastname, String screenName, String emailAddress, LocalDateTime dateCreated){
		this.firstname=firstname;
		this.lastname=lastname;
		this.screenName=screenName;
		this.emailAddress=emailAddress;
		this.dateCreated=dateCreated;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public LocalDateTime getDateCreated(){
		return dateCreated;
	}
	public String getFirstName(){
		return firstname;
	}
	public String getLastName(){
		return lastname;
	}
	public String getScreenName(){
		return screenName;
	}
	public void joinGroup(Group group, LocalDateTime dateJoined){
		
	}
	public int getNumberGroups(){
		return memberships.size();
	}
	public Group getGroup(String groupID){
		Group gr = null;
		for( Membership m: memberships) {
			if(groupID.equals(m.group.getTitle())) {
				gr = m.group;
			}
		}
		return gr;
	}
	public List<Group> getGroups(){
		ArrayList<Group> groups = new ArrayList<>();	
		for(Membership m : memberships) {
			groups.add(m.group);
		}
		
		return groups;
	}
	public void addQuestion(Group group, Question question, LocalDateTime date){
		for(Membership m : memberships) {
			if(group == m.group) {
				m.group.questions.add(question);
				question.date = date;
			}
		}
	}
	public LocalDateTime getDateJoined(Group group){
		LocalDateTime dateJoined = null;
		
		for(Membership m : memberships) {
			if(m.group == group) {
				
				dateJoined = m.getDateJoined();
			}
		}
		
		return dateJoined;
	}
	public void addAnswer(Group group, Question question, Answer answer, LocalDateTime date){
		for(Membership m : memberships) {
			if(group == m.group) {
				question.addAnswer(answer);  
				answer.date = date;
			}
		}
	}
	public List<Question> getQuestions(Group group){
		List<Question> questions = new ArrayList<>();
		for(Membership m : memberships) {
			if (m.group == group) {
				questions = m.group.getQuestion();
			}
		}
		return questions;
	}
	public List<Answer> getAnswers(Group group){
		List<Answer> answers = new ArrayList<>();
		for(Membership m : memberships) {
			if (m.group == group) {
				answers = m.group.getAnswer();
			}
		}
		return answers;
	}
	public String toString() {
		return "Firstname : "+ firstname + "lasname: " +lastname + "ScreenName: " + screenName +"\n"+"Email Address : " + emailAddress + " Date Created: " + dateCreated + ".";	
		}
}
