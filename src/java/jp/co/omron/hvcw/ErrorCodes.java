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

public interface ErrorCodes
{
	public static final int HVCW_SUCCESS				= 1;  /* 処理成功                         */
	public static final int HVCW_INVALID_PARAM			= 2;  /* パラメータが不正                 */
	public static final int HVCW_NOT_READY				= 3;  /* 処理準備が出来ていない           */
	public static final int HVCW_BUSY					= 4;  /* 処理を受け付け出来ない           */
	public static final int HVCW_NOT_SUPPORT			= 5;  /* 要求された処理はサポートされない */
	public static final int HVCW_TIMEOUT				= 6;  /* 通信タイムアウト                 */
	public static final int HVCW_NOT_FOUND				= 7;  /* 処理対象が見つからない           */
	public static final int HVCW_FAILURE				= 8;  /* その他エラー（上記エラー以外）   */
	public static final int HVCW_NOT_INITIALIZE			= 11; /* SDKが初期化されていない          */
	public static final int HVCW_DISCONNECTED			= 12; /* カメラとの接続が切断されている   */
	public static final int HVCW_NOHANDLE				= 20; /* ハンドルエラー                   */
	public static final int HVCW_NO_FACE				= 30; /* 顔検出結果が0                    */
	public static final int HVCW_PLURAL_FACES			= 31; /* 顔検出結果が複数存在する         */
	public static final int HVCW_INVALID_RECEIVEDATA	= 40; /* 受信データが不正                 */
}
