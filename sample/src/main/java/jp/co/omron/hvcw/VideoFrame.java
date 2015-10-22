/*-------------------------------------------------------------------*/
/*  Copyright(C) 2015 by OMRON Corporation                           */
/*  All Rights Reserved.                                             */
/*                                                                   */
/*   This source code is the Confidential and Proprietary Property   */
/*   of OMRON Corporation.  Any unauthorized use, reproduction or    */
/*   transfer of this software is strictly prohibited.               */
/*                                                                   */
/*-------------------------------------------------------------------*/
package jp.co.omron.hvcw;

/**
 * ビデオフレーム
 */
public final class VideoFrame {
	/** 輝度 */
	private byte[] y;
	/** B-Y */
	private byte[] u;
	/** R-Y */
	private byte[] v;
	/** 1ラインのバイト数 */
	private long[] stride;
	/** 幅 */
	private long width;
	/** 高さ */
	private long height;

	/**
	 * コンストラクタ
	 */
	public VideoFrame() {
		stride = new long[3];
		width = 0;
		height = 0;
	}

	/**
	 * 輝度の取得
	 * @return 輝度
	 */
	public byte[] getY() {
		return y;
	}

	/**
	 * B-Yの取得
	 * @return B-Y
	 */
	public byte[] getU() {
		return u;
	}

	/**
	 * R-Yの取得
	 * @return R-Y
	 */
	public byte[] getV() {
		return v;
	}

	/**
	 * 1ラインのバイト数の取得
	 * @return 1ラインのバイト数
	 */
	public long[] getStride() {
		return stride;
	}

	/**
	 * 幅の取得
	 * @return 幅
	 */
	public long getWidth() {
		return width;
	}

	/**
	 * 高さの取得
	 * @return 高さ
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * 輝度の設定
	 * @param y 輝度
	 */
	public void setY(byte[] y) {
		if (y == null) {
			return;
		}
		this.y = y;
	}

	/**
	 * B-Yの設定
	 * @param u B-Y
	 */
	public void setU(byte[] u) {
		if (u == null) {
			return;
		}
		this.u = u;
	}

	/**
	 * R-Yの設定
	 * @param v R-Y
	 */
	public void setV(byte[] v) {
		if (v == null) {
			return;
		}
		this.v = v;
	}

	/**
	 * 1ラインのバイト数の設定
	 * @param stride 1ラインのバイト数
	 */
	public void setStride(long stride[]) {
		if ((stride == null) || (stride.length < 3)) {
			return;
		}
		this.stride[0] = stride[0];
		this.stride[1] = stride[1];
		this.stride[2] = stride[2];
	}

	/**
	 * 幅の設定
	 * @param width 幅
	 */
	public void setWidth(long width) {
		this.width = width;
	}

	/**
	 * 高さの設定
	 * @param height 高さ
	 */
	public void setHeight(long height) {
		this.height = height;
	}
}
