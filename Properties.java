
public class Properties {

	/**
	 * DB接続プロパティ
	 */
	public enum DBPRO {
		DB_URL(""), DB_USER_NAME(""), DB_PASSWORD(""),;

		/* プロパティに設定する文字列 */
		private String prp;

		DBPRO(final String prp) {
			this.prp = prp;
		}

		public String getPrp() {
			return this.prp;
		}
	}

	/**
	 * ファイル操作プロパティ
	 */
	public enum FILE_PROP {
		TARGT_CSV_PASS("C:/Users/ShoHorikawa/Desktop/csvtest/test.csv"),
		TARGET_JASON_PASS(""),;

		/*ファイルプロパティを扱う文字列*/
		private String filepro;

		FILE_PROP(String filepro) {
			this.filepro = filepro;
		}

		public String getFilepro() {
			return filepro;
		}
	}



	/**
	 * CSVファイルパラメータ
	 */
	public enum CSV_FILE_PARAM{
		NAME("name"),
		OLD("old"),
		SHUMI("shumi");



		/*CSVファイルパラメータを扱う文字列*/
		String csvparam = null;

		private CSV_FILE_PARAM(String csvparam) {
			this.csvparam = csvparam;
		}

		public String getCSVParam() {
			return csvparam;
		}
	}
	public enum CSV_FILE_COUNT{
		NAME(1),
		OLD(2),
		SHUMI(3);



		/*CSVファイルパラメータを扱う文字列*/
		int csvparam = 0;

		private CSV_FILE_COUNT(int csvparam) {
			this.csvparam = csvparam;
		}

		public int getCSVParam() {
			return csvparam;
		}
	}

}
