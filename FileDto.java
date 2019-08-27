
/**
 * ファイル情報格納クラス
 * <p>
 * ファイル情報を取得/設定するクラス
 * </p>
 *
 *
 * @author ShoHorikawa
 *
 */
public class FileDto {
	/**名前*/
	private String name = null;

	/**年齢*/
	private String old = null;

	/**趣味*/
	private String shumi = null;


	/***
	 * 名前ゲッター
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前セッター
	 *
	 * @param name 名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 年齢ゲッター
	 * @return old 年齢
	 */
	public String getOld() {
		return old;
	}

	/**
	 * 年齢セッター
	 * @param Old 年齢
	 */
	public void setOld(String old) {
		this.old = old;
	}

	/**
	 * 趣味ゲッター
	 *
	 * @return shumi 趣味
	 */
	public String getShumi() {
		return shumi;
	}

	/**
	 * 趣味セッター
	 *
	 * @param shumi 趣味
	 */
	public void setShumi(String shumi) {
		this.shumi = shumi;
	}




}
