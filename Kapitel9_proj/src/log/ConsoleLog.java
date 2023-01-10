package log;

public class ConsoleLog implements LogInterface {

	LogLevel level;
	
	public ConsoleLog(LogLevel level) {
		this.level = level;
	}
	
	@Override
	public void setLogLevel(LogLevel level) {
		// TODO Auto-generated method stub
		this.level = level;
		
	}

	@Override
	public void error(String msg) {
		// TODO Auto-generated method stub
		//ONLY for DEBUG and WARNING and ERROR
		if(!LogLevel.ERROR.isGreaterThanOrEqual(level)) {
			return;
		}
		System.out.println(msg);
	}

	@Override
	public void warning(String msg) {
		// TODO Auto-generated method stub
		//ONLY for DEBUG and WARNING
		if(!LogLevel.WARNING.isGreaterThanOrEqual(level)) {
			return;
		}
		System.out.println(msg);
		
	}

	@Override
	public void debug(String msg) {
		// TODO Auto-generated method stub
		//ONLY for DEBUG
		if(!LogLevel.DEBUG.isGreaterThanOrEqual(level)) {
			return;
		}
		System.out.println(msg);
		
	}
	
	public static void main(String args[]) {
		ConsoleLog c1 = new ConsoleLog(LogLevel.DEBUG);
		c1.debug("test 1 debug");
		c1.warning("test 1 warning");
		c1.error("test 1 error");
		
		c1.setLogLevel(LogLevel.WARNING);
		c1.debug("test 2 debug");
		c1.warning("test 2 warning");
		c1.error("test 2 error");
		
		c1.setLogLevel(LogLevel.ERROR);
		c1.debug("test 3 debug");
		c1.warning("test 3 warning");
		c1.error("test 3 error");
	}

}
