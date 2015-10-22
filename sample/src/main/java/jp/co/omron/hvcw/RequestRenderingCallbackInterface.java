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
 * レンダリング要求コールバック
 */
public interface RequestRenderingCallbackInterface
{
	/**
	 * レンダリング要求コールバック
	 * @param isVideo ビデオ描画要求（HVCW_TRUE : ビデオ描画要求, HVCW_FALSE : 音声データ再生要求）
	 * @param userParam ユーザーパラメータ
	 * @param renderInfo ビデオフレーム、又は音声データ
	 * @param lInfoLen renderInfoサイズ
	 * @param lTimeStamp タイムスタンプ
	 * @return HVCW_SUCCESS 正常終了
	 */
	public int requestRenderingCallback(int isVideo, long userParam, long renderInfo, long lInfoLen, long lTimeStamp);
}
