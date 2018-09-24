package sprint1;

import java.time.LocalDateTime;
import java.util.*;

class Membership {
	public Group group;
	public Member member;
	private LocalDateTime dateJoined;
	private int points;
	private ArrayList<Question> questions;
	private ArrayList<Answer> answers;
	
	void setDateJoined(LocalDateTime date) {
		this.dateJoined = date;
	}
	
	LocalDateTime getDateJoined() {
		return dateJoined;
	}
	public String toString(){
		return " ";
	}
}
