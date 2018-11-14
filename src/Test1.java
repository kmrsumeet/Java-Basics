import java.util.Properties;

public class Test1 {
	private static String dbName = null;
	private static String JDBC_CONN_STRING = null;
	private static String USERNAME = null;
	private static String PASSWORD = null;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String dbName = args[0];////prop.getProperty("dbName");
		String JDBC_CONN_STRING = args[1];//"jdbc:vertica://analytics.pxoe-app.247-inc.net:5433/vertica247";//prop.getProperty("jdbcConnectionString");
		String USERNAME = args[2];//"bdpsimod";//prop.getProperty("username");
		String PASSWORD = args[3];//"bdpsimod@247";//prop.getProperty("password");
*/		Properties prop = new Properties();
		prop.put(dbName, args[0]);
		prop.put(JDBC_CONN_STRING, args[1]);
		prop.put(USERNAME, args[2]);
		prop.put(PASSWORD, args[3]);
		//System.out.println(dbName+"+"+JDBC_CONN_STRING+"+"+USERNAME+"+"+PASSWORD);

	}

	

}
