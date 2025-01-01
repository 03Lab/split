package com.example.split.beans;

/**
 * 割り勘Beans
 */

public class SplitPeople {
	/** 割り勘の人ID */
	private int splitPeopleId;
	
	/** 割り勘する人の名前 */
	private String splitPeopleName;
	
	/** 割り勘の比率 */
	private int splitRate;
	
	/**  */

	/**
	 * @return 割り勘する人IDを取得します.
	 */
	public int getSplitPeopleId() {
		return splitPeopleId;
	}

	/**
	 * @param 割り勘する人IDを設定します.
	 */
	public void setSplitPeopleId(int splitPeopleId) {
		this.splitPeopleId = splitPeopleId;
	}

	/**
	 * @return 割り勘する人の名前を取得します.
	 */
	public String getSplitPeopleName() {
		return splitPeopleName;
	}

	/**
	 * @param 割り勘する人の名前を設定します.
	 */
	public void setSplitPeopleName(String splitPeopleName) {
		this.splitPeopleName = splitPeopleName;
	}

	/**
	 * @return 割り勘比率を取得します.
	 */
	public int getSplitRate() {
		return splitRate;
	}

	/**
	 * @param 割り勘比率を設定します.
	 */
	public void setSplitRate(int splitRate) {
		this.splitRate = splitRate;
	}
	
	/**
	 * 入力内容のチェックを行います.
	 * @return split 入力データを保持したモデル
	 */
	
	// バリデーション
//	public boolean isValid() {
//		if (this.splitPeopleName == null || this.splitPeopleName.isEmpty()) {
//			return false;
//		}
//		return true;
//	}
}
