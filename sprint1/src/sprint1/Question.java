package sprint1;

import java.time.LocalDateTime;
import java.util.*;

public class Question extends Post{

	private String title;
	public ArrayList<Answer> answers;

	public Question(String title,String text, LocalDateTime date){
		super(text,date);
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void addAnswer(Answer answer){
		answers.add(answer);
	}
	public List<Answer> getAnswer(){
		return answers;
	}
	public String toString(){
		return "The title is : " + title + " and the answer is "+ getAnswer();
	}
}
