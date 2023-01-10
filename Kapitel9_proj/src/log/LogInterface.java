package log;

//import java.util.ArrayList;

public interface LogInterface {
	
	//ArrayList<String> error = new ArrayList<String>();
	//ArrayList<String> warning = new ArrayList<String>();
	//ArrayList<String> debug = new ArrayList<String>();
	
	void setLogLevel(LogLevel level);
	void error(String msg);
	void warning(String msg);
	void debug(String msg);
}