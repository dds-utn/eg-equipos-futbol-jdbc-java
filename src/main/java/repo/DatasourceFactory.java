package repo;

import org.apache.commons.dbcp2.BasicDataSource;

public class DatasourceFactory {

	public static BasicDataSource createDatasource(String db) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("mysql");
		dataSource.setUrl("jdbc:mysql://localhost/" + db);
		dataSource.setMaxTotal(10);
		dataSource.setMaxIdle(5);
		dataSource.setInitialSize(5);
		dataSource.setValidationQuery("SELECT 1");
		return dataSource;
	}

}
