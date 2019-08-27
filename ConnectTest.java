import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DB操作クラス
 * 
 * <p>
 * 定義されたプロパティから接続情報を取得し、 DBの接続およびクローズを行う
 * </p>
 * 
 * @author ShoHorikawa
 */

public class ConnectTest {
	public static void main(String[] args) {
		/* 接続状態の初期化 */
		Connection conn = null;

		/* 接続状態を取得する */
		try {
			conn = DriverManager.getConnection(Properties.DBPRO.DB_URL.getPrp(), Properties.DBPRO.DB_USER_NAME.getPrp(),
					Properties.DBPRO.DB_PASSWORD.getPrp());

			/* クエリ発行 */
			

		} catch (SQLException sqle) {
			System.out.println("接続以上発生");
		} finally {
			/* DB処理終了のため接続をクローズする */
			dbClose(conn);
		}

	}

	/**
	 * DB接続状態解除
	 * <p>
	 * DBのコネクションの接続を 解消するメソッド
	 * </p>
	 * 
	 * @param conn
	 *            当該クラスのコネクション
	 * @throws SQLException
	 *             SQL例外
	 */
	public static void dbClose(Connection conn) {
		try {
			/* 接続状態をクローズする */
			conn.close();
		} catch (SQLException sqle) {
			System.out.println("クローズ例外");
		}
	}
}