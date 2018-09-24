package sprint1;

import java.time.LocalDateTime;
import java.util.*;

public class Answer extends Post{
	
	private Question question;
	
	public Answer(String text, LocalDateTime date){
		super(text, date);
	}
	public Answer(Question question, String text, LocalDateTime date) {
		super(text, date);
		this.question = question;	
	}
	public Question getQuestion(){
		return question;		
	}
	public String toString(){
		return "text: " + text + "date: " + date;
	}
}
