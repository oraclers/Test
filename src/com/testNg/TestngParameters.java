package com.testNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters {
	// @Parameters注解内对应的参数名称和配置文件中的key必须是相同
	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String secondName) {
		System.err.println("Invoked testString " + secondName);
		assert "Cedric".equals(secondName);
	}

	@Parameters({ "count" })
	@Test
	public void testSingleInteger(Integer count) {
		System.err.println("Invoked count " + count);
		assert count.intValue() == 8;
	}

	private String m_dataSource;
	private String m_jdbcDriver;
	private int poolSize;

	/**
	 * <p>
	 * description:注:@Parameters定义的参数顺序必须和方法的参数顺序一致,配置文件中的参数只是和注解的参数名称一致
	 * </p>
	 * 
	 * @param ds
	 * @param driver
	 * @param poolSize
	 */
	@Parameters({ "datasource", "jdbcDriver", "poolSize" })
	@BeforeMethod
	public void beforeTest(String ds, String driver, int poolSize) {
		this.m_dataSource = ds;
		this.m_jdbcDriver = driver;
		this.poolSize = poolSize;
		System.err.println(getM_dataSource() + " --- " + getM_jdbcDriver()
				+ " --- " + getPoolSize());
	}

	public String getM_dataSource() {
		return m_dataSource;
	}

	public String getM_jdbcDriver() {
		return m_jdbcDriver;
	}

	public int getPoolSize() {
		return poolSize;
	}

	/**
	 * 如果在配置文件中没有指定参数db,那么参数值将使用默认值'mysql'
	 * 
	 * @param db
	 */
	@Parameters("db")
	@Test
	public void testNonExistentParameter(@Optional("mysql") String db) {
		System.err.println("db ..  " + db);
	}
}
