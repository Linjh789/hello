package hello;

/**
 * 常量接口
 *
 * @author Administrator
 */
public interface Constants {

    /**
     * 项目配置相关的常量
     */
	
	//mysql相关
	String JDBC_TYPE = "jdbc.type";
	String JDBC_DRIVER = "jdbc.driver";
	
    String JDBC_URL = "jdbc.url";
    String JDBC_USER = "jdbc.user";
    String JDBC_PASSWORD = "jdbc.password";
   
    //kdc认证相关
    String HADOOP_DIR = "hadoop.dir";
    String HADOOP_KRB = "hadoop.krb";
    String KEYTAB_FILE = "keytab.File";
    String KEYTAB_USER = "keytab.User";
    
    
    
    String COLLECT_JDBC_URL = "collect.jdbc.url";
    String COLLECT_JDBC_USER = "collect.jdbc.user";
    String COLLECT_JDBC_PASSWORD = "collect.jdbc.password";

    String ZK_SESSION_TIMEOUT = "zk.session.timeout";
    String ZK_CONNECTION_TIMEOUT = "zk.connection.timeout";


    String MACHINE_IP = "machine.ip";
    String MACHINE_PORT = "machine.port";
    String MACHINE_USER = "machine.user";
    String MACHINE_PASSWORD = "machine.password";

    String PRODUCER_INTERVAL = "producer.interval";

    String KRB_FILE = "krb.file";
    String SERVER_JAAS_FILE = "server.jaas.file";


}