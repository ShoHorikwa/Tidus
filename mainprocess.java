import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * メイン処理を実行するクラス
 * <p>
 * 当該クラスから各メソッドを呼び出し、
 * 処理を実行する。
 * <p>
 *
 * @author ShoHorikawa
 *
 */


public class mainprocess {
	ppublic String a = "";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String [] args) {
		/*ファイル操作クラス*/
		FileUtil fu = new FileUtil();
		/*取得結果情報*/
		List<FileDto> fileResult = new ArrayList<>();


		/*ファイル情報を取得する*/
		List<Map<String,String>> csvRecordList = fu.getCSVRecord();

		/*取得したファイルをFileDtoに格納する*/
		for (Map<String,String> record : csvRecordList) {
		FileDto fileDto = setFileParam(record);
		fileResult.add(fileDto);
		}

		/*取得したファイル情報を出力する*/
		int i = 1;
		for(FileDto result : fileResult) {
			System.out.println("レコード："+ i + "件名");
			System.out.println("名前；"+ result.getName());
			System.out.println("年齢；"+ result.getOld());
			System.out.println("趣味；"+ result.getShumi());

			i++;
			System.out.println("");
			System.out.println("");
		}


		System.out.println("ファイル読み込み完了");

	}




	/**
	 * CSVパラメータ設定処理
	 * <p>
	 * 取得したパラメータをDtoクラスに格納する。
	 * <p>
	 *
	 * @param record csvレコード
	 *
	 */


	public static FileDto setFileParam(Map<String,String> record) {
		/*Dtoクラスの初期化*/
		FileDto fileDto = new FileDto();


		/*各パラメータをチェックする*/
		if (record.get(Properties.CSV_FILE_PARAM.NAME.getCSVParam())== null) {
			System.out.println("パラメータ異常");
			return null;
		}

		/*Dtoクラスにパラメータを設定する*/
		fileDto.setName(record.get(Properties.CSV_FILE_PARAM.NAME.getCSVParam()));
		fileDto.setOld(record.get(Properties.CSV_FILE_PARAM.OLD.getCSVParam()));
		fileDto.setShumi(record.get(Properties.CSV_FILE_PARAM.SHUMI.getCSVParam()));

		return fileDto;
	}


}
