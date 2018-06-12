package The17Task2;

public class Score {
	private int maths;
	private int chinese;
	private int english;
	private int zonghe;
	private int totalScore;
	Score(int maths,int chinese,int english,int zonghe){
		this.maths = maths;
		this.chinese = chinese;
		this.english = english;
		this.zonghe = zonghe;
		this.totalScore = maths+chinese+english+zonghe;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getZonghe() {
		return zonghe;
	}
	public void setZonghe(int zonghe) {
		this.zonghe = zonghe;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
}
