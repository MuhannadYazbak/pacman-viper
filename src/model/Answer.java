package model;

public class Answer {
	private static int ID=1;
	private int id;
	private boolean isCorrect=false;
	private String answerText;
	private Question question;
	public Answer(boolean isCorrect, String answerText) {
		super();
		this.id=Answer.ID++;
		this.isCorrect = isCorrect;
		this.answerText = answerText;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", isCorrect=" + isCorrect + ", answerText=" + answerText + "]";
	}
	
	

}
