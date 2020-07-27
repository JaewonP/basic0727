package basic_0727;

public class Green {
	private int saveData;
	private int saveEng;
	private int saveMath;
	
	
	//getter setter
	int getSaveData() { //멤버변수의 앞글자 대문자로 하고 get 붙인다.
		return this.saveData; 
	}
	void setSaveData(int saveData) { //멤버변수의 앞글자 대문자로 하고 set 붙인다. 
		this.saveData = saveData; //반환타입이 없음 파라미터로 전달된 데이터의 값을 멤버 변수에 저장(대입)
	}
	int getSaveEng() {
		return this.saveEng;
	}
	void setSaveEng(int saveEng) {
		this.saveEng = saveEng;
	}
	int getSaveMath() {
		return this.saveMath;
	}
	void setSaveMath(int saveMath) {
		this.saveMath = saveMath;
	}
	
	
}
