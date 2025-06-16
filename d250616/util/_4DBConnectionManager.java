package d250616.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 반복되는 코드
// 1) 연결시 필요한정보들, 변경이 안되니, 상수로 선언해서, 재사용
// 2) 드라이버 로딩
// 3) 데이터베이스 연결 객체 얻기
// 4) 자원 해체
public class _4DBConnectionManager {
    // 반복되는 코드
    // 1) 연결시 필요한정보들, 변경이 안되니, 상수로 선언해서, 재사용String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 디비 서버 아이피, 포트, 서비스 이름
    // String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 디비 서버 아이피, 포트, 서비스 이름
    // String user = "scott"; // 접속할 유저
    // String password = "tiger"; // 패스워드
    // String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 위치
    private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String user = "scott";
    private static final String password = "tiger";
    private static final String driver = "oracle.jdbc.driver.OracleDriver"; 
    // 2) 드라이버 로딩
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 3) 데이터베이스 연결 객체 얻기
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    // 4) 자원 해체
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
