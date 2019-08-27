import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ファイル操作を実行するクラス
 * <p>
 * ファイル操作処理を行う際に、 当該クラスを呼び出し、各メソッドを実行する。
 * <p>
 *
 *
 * @author ShoHorikawa
 *
 */
public class FileUtil {

	/**
	 * CSVファイル情報取得
	 * <p>
	 * プロパティに定義されたファイルレコードを取得する。
	 * <p>
	 */
	public List<Map<String,String>> getCSVRecord() {


		/*ファイル情報格納リスト*/
		List<Map<String,String>> recordList = new ArrayList<>();

		/* ファイルパスの取得 */
		final String pass = Properties.FILE_PROP.TARGT_CSV_PASS.getFilepro();


		/* ファイル取り込みを行う */
		try (BufferedReader bfr = new BufferedReader(new FileReader( new File(pass)));) {
			/* レコード情報 */
			String line;
			/* 1行ずつレコードを取得する */
			while ((line = bfr.readLine()) != null) {

				/* ファイル内パラメータ */
				String[] fparam = line.split(",");

				/* ファイル1行を各レコード内に格納する */
				Map<String, String> paramMap = new HashMap<>();
				paramMap.put(Properties.CSV_FILE_PARAM.NAME.getCSVParam(), fparam[Properties.CSV_FILE_COUNT.NAME.getCSVParam()]);
				paramMap.put(Properties.CSV_FILE_PARAM.OLD.getCSVParam(), fparam[1]);
				paramMap.put(Properties.CSV_FILE_PARAM.SHUMI.getCSVParam(), fparam[2]);

				/*レコード1件をリストに格納する*/
				recordList.add(paramMap);

			}
		} catch (IOException ioe) {
			System.out.println("ファイル操作エラー");
		}
		return recordList;
	}
}
