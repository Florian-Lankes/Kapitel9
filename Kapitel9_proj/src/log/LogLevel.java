package log;

public enum LogLevel {
	ERROR(2),WARNING(1),DEBUG(0);
	private int significance;
	
	LogLevel(int significance){
		this.significance = significance;
	}
	
	public int getSignificance() {
		return this.significance;
	}
	
	public boolean isGreaterThanOrEqual(LogLevel level) {
		return (this.significance >= level.getSignificance());
		//true W W
		//false W E
	}
}