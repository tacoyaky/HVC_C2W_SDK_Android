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


public class HvcwApi
{
	public final static int		HVCW_FALSE = 0;
	public final static int		HVCW_TRUE  = 1;

	/* NightVisionモード */
	public final static int		HVCW_NightVisionMode_Auto   = 0;
	public final static int		HVCW_NightVisionMode_Manual = 1;
	/* NightVisionステータス */
	public final static int		HVCW_NightVisionStatus_Off  = 0;
	public final static int		HVCW_NightVisionStatus_On   = 1;
	/* イベント */
	public final static int		HVCW_Event_ConnectionNum     = 0;
	public final static int		HVCW_Event_StreamingNum      = 1;
	public final static int		HVCW_Event_NightVisionMode   = 6;
	public final static int		HVCW_Event_NightVisionStatus = 7;
	public final static int		HVCW_Event_SpeakerVolume     = 9;
	public final static int		HVCW_Event_Disconnected      = 13;
	public final static int		HVCW_Event_Reconnected       = 14;
	public final static int		HVCW_Event_StorageStatus     = 18;
	/* ストレージステータス */
	public final static int		HVCW_StorageStatus_NotInsert  = 0;
	public final static int		HVCW_StorageStatus_NotReady   = 1;
	public final static int		HVCW_StorageStatus_NeedFormat = 2;
	public final static int		HVCW_StorageStatus_Normal     = 3;
	public final static int		HVCW_StorageStatus_Error      = 4;
	public final static int		HVCW_StorageStatus_Formatting = 6;
	public final static int		HVCW_StorageStatus_NotSupport = 7;
	/* ストレージフォーマット結果 */
	public final static int		HVCW_StorageFormatResultCode_Success           = 0;
	public final static int		HVCW_StorageFormatResultCode_RemovedStorage    = 1;
	public final static int		HVCW_StorageFormatResultCode_NotSupportStorage = 2;
	public final static int		HVCW_StorageFormatResultCode_Timeout           = 3;
	public final static int		HVCW_StorageFormatResultCode_AlreadyRunning    = 4;
	public final static int		HVCW_StorageFormatResultCode_CheckDisk         = 5;
	public final static int		HVCW_StorageFormatResultCode_FatalError        = 6;
	/* 接続種別 */
	public final static int		HVCW_ConnectionType_Disconnect = 0;
	public final static int		HVCW_ConnectionType_P2P        = 1;
	public final static int		HVCW_ConnectionType_Relay      = 2;
	public final static int		HVCW_ConnectionType_Local      = 3;
	/* ライブストリーミングビデオ解像度 */
	public final static int		HVCW_VideoResolution_High   = 0;
	public final static int		HVCW_VideoResolution_Middle = 1;
	public final static int		HVCW_VideoResolution_Low    = 2;
	/* ファイル拡張子 */
	public final static int		HVCW_FileExt_Log               = 2;
	public final static int		HVCW_FileExt_MessageText       = 3;
	public final static int		HVCW_FileExt_Sound             = 4;
	public final static int		HVCW_FileExt_JpgImage          = 6;
	public final static int		HVCW_FileExt_YUVImage          = 7;
	public final static int		HVCW_FileExt_ThumbnailJpgImage = 8;
	/*  */
	public final static int		HVCW_ScheduleType_OneTime = 0;
	public final static int		HVCW_ScheduleType_Repeat  = 1;
	public final static int		HVCW_ScheduleType_Max     = 2;
	/* イベントタイプ */
	public final static int		HVCW_EventProgramType_Sound  = 0;
	public final static int		HVCW_EventProgramType_Motion = 1;
	public final static int		HVCW_EventProgramType_Timer  = 2;
	public final static int		HVCW_EventProgramType_Max    = 3;
	/* 画像サイズ */
	public final static int		HVCW_ImageSize_FullHD = 0;
	public final static int		HVCW_ImageSize_HD     = 1;
	public final static int		HVCW_ImageSize_WVGA   = 2;
	public final static int		HVCW_ImageSize_WQVGA  = 3;
	public final static int		HVCW_ImageSize_Max    = 4;
	/*  */
	public final static int		HVCW_ScheduleFrequency_Once    = 0;
	public final static int		HVCW_ScheduleFrequency_Daily   = 1;
	public final static int		HVCW_ScheduleFrequency_Weekday = 2;
	public final static int		HVCW_ScheduleFrequency_Max     = 3;
	/*  */
	public final static int		HVCW_SaveResult_None      = 0;
	public final static int		HVCW_SaveResult_All       = 1;
	public final static int		HVCW_SaveResult_Detection = 2;
	public final static int		HVCW_SaveResult_Max       = 3;
	/*  */
	public final static int		HVCW_FRSaveResult_None    = 0;
	public final static int		HVCW_FRSaveResult_All     = 1;
	public final static int		HVCW_FRSaveResult_Known   = 2;
	public final static int		HVCW_FRSaveResult_Unknown = 3;
	public final static int		HVCW_FRSaveResult_Max     = 4;



	/* Roll Angle Definitions */
	public static final int		ROLL_ANGLE_0  = 0x00001001; /* Upward    Front +/- 15 degree */
	public static final int		ROLL_ANGLE_1  = 0x00002002; /* Upward    Left  +/- 15 degree */
	public static final int		ROLL_ANGLE_2  = 0x00004004; /* Rightward Right +/- 15 degree */
	public static final int		ROLL_ANGLE_3  = 0x00008008; /* Rightward Front +/- 15 degree */
	public static final int		ROLL_ANGLE_4  = 0x00010010; /* Rightward Left  +/- 15 degree */
	public static final int		ROLL_ANGLE_5  = 0x00020020; /* Downward  Right +/- 15 degree */
	public static final int		ROLL_ANGLE_6  = 0x00040040; /* Downward  Front +/- 15 degree */
	public static final int		ROLL_ANGLE_7  = 0x00080080; /* Downward  Left  +/- 15 degree */
	public static final int		ROLL_ANGLE_8  = 0x00100100; /* Leftward  Right +/- 15 degree */
	public static final int		ROLL_ANGLE_9  = 0x00200200; /* Leftward  Front +/- 15 degree */
	public static final int		ROLL_ANGLE_10 = 0x00400400; /* Leftward  Left  +/- 15 degree */
	public static final int		ROLL_ANGLE_11 = 0x00800800; /* Upward    Right +/- 15 degree */

	public static final int		ROLL_ANGLE_ALL  = 0x00ffffff;   /* All angles are detected                   */
	public static final int		ROLL_ANGLE_NONE = 0x00000000;   /* None of the angles will be detected       */
	public static final int		ROLL_ANGLE_U15  = ROLL_ANGLE_0; /* Up    +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_R15  = ROLL_ANGLE_3; /* Right +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_D15  = ROLL_ANGLE_6; /* Down  +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_L15  = ROLL_ANGLE_9; /* Left  +/- 15 degree only will be detected */

	public static final int		ROLL_ANGLE_UP    = ROLL_ANGLE_U15; /* Up    +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_RIGHT = ROLL_ANGLE_R15; /* Right +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_DOWN  = ROLL_ANGLE_D15; /* Down  +/- 15 degree only will be detected */
	public static final int		ROLL_ANGLE_LEFT  = ROLL_ANGLE_L15; /* Left  +/- 15 degree only will be detected */
	/* 実行機能フラグ */
	public final static int		HVCW_OkaoFunction_Body        = 0;
	public final static int		HVCW_OkaoFunction_Hand        = 1;
	public final static int		HVCW_OkaoFunction_Pet         = 2;
	public final static int		HVCW_OkaoFunction_Face        = 3;
	public final static int		HVCW_OkaoFunction_Direction   = 4;
	public final static int		HVCW_OkaoFunction_Age         = 5;
	public final static int		HVCW_OkaoFunction_Gender      = 6;
	public final static int		HVCW_OkaoFunction_Gaze        = 7;
	public final static int		HVCW_OkaoFunction_Blink       = 8;
	public final static int		HVCW_OkaoFunction_Expression  = 9;
	public final static int		HVCW_OkaoFunction_Recognition = 10;
	public final static int		HVCW_OkaoFunction_Max         = 11;
	/* 表情 */
	public final static int		HVCW_Expression_Ignore        = -1;
	public final static int		HVCW_Expression_Neutral       = 0;
	public final static int		HVCW_Expression_Happiness     = 1;
	public final static int		HVCW_Expression_Surprise      = 2;
	public final static int		HVCW_Expression_Anger         = 3;
	public final static int		HVCW_Expression_Sadness       = 4;
	public final static int		HVCW_Expression_Max           = 5;





	private long handle = 0;

//	public long getHandle()
//	{
//		return handle;
//	}



	/**
	 * コンストラクタ
	 */
	private HvcwApi()
	{
	}


	/**
	 * SDKバージョン取得
	 */
	public native static int getVersion(Int Major, Int Minor, Int Release);


	/**
	 * ハンドル作成
	 */
	private native long createHandleNative();

	public static HvcwApi createHandle()
	{
		HvcwApi hvcwapi = new HvcwApi();
		hvcwapi.handle = hvcwapi.createHandleNative();
		if(hvcwapi.handle == 0)
		{
			hvcwapi = null;
		}

		return hvcwapi;
	}


	/**
	 * ハンドル削除
	 */
	private native int deleteHandle(long hHVC);

	public int deleteHandle()
	{
		return deleteHandle(handle);
	}


	/**
	 * カメラハンドルの設定
	 */
	private native int setCameraHandle(long hHVC, long hCameraHandle);

	public int setCameraHandle(long hCameraHandle)
	{
		return setCameraHandle(handle, hCameraHandle);
	}


	/**
	 * カメラに接続
	 */
	private native int connect(long hHVC, String stCameraId, String stAccessToken);

	public int connect(String stCameraId, String stAccessToken)
	{
		return connect(handle, stCameraId, stAccessToken);
	}


	/**
	 * カメラとの接続を切断
	 */
	private native int disconnect(long hHVC);

	public int disconnect()
	{
		return disconnect(handle);
	}


	/**
	 * カメラのファームウェアバージョンの取得
	 */
	private native int getCameraVersion(long hHVC, StringBuffer sbVersion);

	public int getCameraVersion(StringBuffer sbVersion)
	{
		return getCameraVersion(handle, sbVersion);
	}


	/**
	 * カメラにファームウェア更新を指示
	 */
	private native int updateFirmware(long hHVC);

	public int updateFirmware()
	{
		return updateFirmware(handle);
	}


	/**
	 * カメラの NightVision モード（手動・自動）を設定
	 */
	private native int setNightVisionMode(long hHVC, int nMode);

	public int setNightVisionMode(int nMode)
	{
		return setNightVisionMode(handle, nMode);
	}


	/**
	 * カメラの NightVision モード（手動・自動）を取得
	 */
	private native int getNightVisionMode(long hHVC, Int mode);

	public int getNightVisionMode(Int mode)
	{
		return getNightVisionMode(handle, mode);
	}


	/**
	 * カメラの NightVision ステータス（有効・無効）を設定
	 */
	private native int setNightVisionStatus(long hHVC, int nStatus);

	public int setNightVisionStatus(int nStatus)
	{
		return setNightVisionStatus(handle, nStatus);
	}


	/**
	 * カメラの NightVision ステータス（有効・無効）を取得
	 */
	private native int getNightVisionStatus(long hHVC, Int status);

	public int getNightVisionStatus(Int status)
	{
		return getNightVisionStatus(handle, status);
	}


	/**
	 * イベントの受信開始
	 */
	private native int enableEventMonitor(long hHVC, Object userParam, EventCallbackInterface callbackFunc);

	public int enableEventMonitor(Object userParam, EventCallbackInterface callbackFunc)
	{
		return enableEventMonitor(handle, userParam, callbackFunc);
	}


	/**
	 * イベントの受信停止
	 */
	private native int disableEventMonitor(long hHVC);

	public int disableEventMonitor()
	{
		return disableEventMonitor(handle);
	}


	/**
	 * カメラのスピーカーボリュームを設定
	 */
	private native int setSpeakerVolume(long hHVC, int nVolume);

	public int setSpeakerVolume(int nVolume)
	{
		return setSpeakerVolume(handle, nVolume);
	}


	/**
	 * カメラのスピーカーボリュームを取得
	 */
	private native int getSpeakerVolume(long hHVC, Int volume);

	public int getSpeakerVolume(Int volume)
	{
		return getSpeakerVolume(handle, volume);
	}


	/**
	 * カメラのマイク感度を設定
	 */
	private native int setMicSensitivity(long hHVC, int nSensitivity);

	public int setMicSensitivity(int nSensitivity)
	{
		return setMicSensitivity(handle, nSensitivity);
	}


	/**
	 * カメラのマイク感度を取得
	 */
	private native int getMicSensitivity(long hHVC, Int sensitivity);

	public int getMicSensitivity(Int sensitivity)
	{
		return getMicSensitivity(handle, sensitivity);
	}


	/**
	 * カメラの WiFi-RSSI 値を取得
	 */
	private native int getWiFiRSSI(long hHVC, Int wifiRssi);

	public int getWiFiRSSI(Int wifiRssi)
	{
		return getWiFiRSSI(handle, wifiRssi);
	}


	/**
	 * ネットワーク設定用音声ファイル作成
	 */
	public native static int generateDataSoundFile(String stTargetFile, String stSSID, String stPassword, String stAccessToken);


	/**
	 * カメラのストレージフォーマットを指示
	 */
	private native int requestStorageFormat(long hHVC, Int resultCode);

	public int requestStorageFormat(Int resultCode)
	{
		return requestStorageFormat(handle, resultCode);
	}


	/**
	 * カメラとの接続種別を取得
	 */
	private native int getConnectionType(long hHVC, Int connType);

	public int getConnectionType(Int connType)
	{
		return getConnectionType(handle, connType);
	}


	/**
	 * ライブストリーミングを開始
	 */
	private native int startLive(long hHVC, Object userParam, int nVideoResolution,
									RequestRenderingCallbackInterface renderingCallback,
									LiveEventCallbackInterface eventCallback);

	public int startLive(Object userParam, int nVideoResolution,
									RequestRenderingCallbackInterface renderingCallback,
									LiveEventCallbackInterface eventCallback)
	{
		return startLive(handle, userParam, nVideoResolution, renderingCallback, eventCallback);
	}


	/**
	 * ライブストリーミングを停止
	 */
	private native int stopLive(long hHVC);

	public int stopLive()
	{
		return stopLive(handle);
	}


	/**
	 * ビデオフレームバッファーの解放
	 */
	private native int freeDecodedVideoBuffer(long hHVC, long buffer);

	public int freeDecodedVideoBuffer(long buffer)
	{
		return freeDecodedVideoBuffer(handle, buffer);
	}


	/**
	 * 音声データの解放
	 */
	private native int freeDecodedAudioBuffer(long hHVC, long buffer);

	public int freeDecodedAudioBuffer(long buffer)
	{
		return freeDecodedAudioBuffer(handle, buffer);
	}


	/**
	 * トークモードを開始
	 */
	private native int enterTalkMode(long hHVC);

	public int enterTalkMode()
	{
		return enterTalkMode(handle);
	}


	/**
	 * トークモードを終了
	 */
	private native int exitTalkMode(long hHVC);

	public int exitTalkMode()
	{
		return exitTalkMode(handle);
	}


	/**
	 * 端末マイクからの入力音声をカメラに転送し、カメラ側にて再生
	 */
	private native int transferSoundData(long hHVC, byte[] byTargetFile, int nSoundLen);

	public int transferSoundData(byte[] byTargetFile, int nSoundLen)
	{
		return transferSoundData(handle, byTargetFile, nSoundLen);
	}


	/**
	 * ライブストリーミングの解像度を変更
	 */
	private native int setVideoResolution(long hHVC, int nVideoResolution);

	public int setVideoResolution(int nVideoResolution)
	{
		return setVideoResolution(handle, nVideoResolution);
	}


	/**
	 * ライブストリーミングの解像度を取得
	 */
	private native int getVideoResolution(long hHVC, Int videoResolution);

	public int getVideoResolution(Int videoResolution)
	{
		return getVideoResolution(handle, videoResolution);
	}


	/**
	 * カメラの音声検知を開始
	 */
	private native int enableSoundDetection(long hHVC, int nSensitivity);

	public int enableSoundDetection(int nSensitivity)
	{
		return enableSoundDetection(handle, nSensitivity);
	}


	/**
	 * カメラの音声検知を停止
	 */
	private native int disableSoundDetection(long hHVC);

	public int disableSoundDetection()
	{
		return disableSoundDetection(handle);
	}


	/**
	 * カメラの音声検知設定を取得
	 */
	private native int getSoundDetection(long hHVC, Int booleanOn, Int sensitivity);

	public int getSoundDetection(Int booleanOn, Int sensitivity)
	{
		return getSoundDetection(handle, booleanOn, sensitivity);
	}


	/**
	 * カメラの動体検知を開始
	 */
	private native int enableMotionDetection(long hHVC, int nDetectionParamsCount, DetectionParam[] aDetectionParams);

	public int enableMotionDetection(int nDetectionParamsCount, DetectionParam[] aDetectionParams)
	{
		return enableMotionDetection(handle, nDetectionParamsCount, aDetectionParams);
	}


	/**
	 * カメラの動体検知を停止
	 */
	private native int disableMotionDetection(long hHVC);

	public int disableMotionDetection()
	{
		return disableMotionDetection(handle);
	}


	/**
	 * カメラの動体検知設定を取得
	 */
	private native int getMotionDetection(long hHVC, Int booleanOn, Int detectionParamsCount, DetectionParam[] aDetectionParams);

	public int getMotionDetection(Int booleanOn, Int detectionParamsCount, DetectionParam[] aDetectionParams)
	{
		return getMotionDetection(handle, booleanOn, detectionParamsCount, aDetectionParams);
	}


	/**
	 * カメラの MAC アドレスを取得
	 */
	private native int getCameraMacAddress(long hHVC, StringBuffer sbMACAddress);

	public int getCameraMacAddress(StringBuffer sbMACAddress)
	{
		return getCameraMacAddress(handle, sbMACAddress);
	}


	/**
	 * カメラFWアップデートを確認
	 */
	private native int checkNewFirmware(long hHVC, StringBuffer sbVersion);

	public int checkNewFirmware(StringBuffer sbVersion)
	{
		return checkNewFirmware(handle, sbVersion);
	}


	/**
	 * ストレージ情報取得
	 */
	private native int getStorageInfo(long hHVC, StorageInfo storageInfo);

	public int getStorageInfo(StorageInfo storageInfo)
	{
		return getStorageInfo(handle, storageInfo);
	}



	/********************/
	/*     OKAO API     */
	/********************/

	/**
	 * アプリケーションID設定
	 */
	private native int setAppID(long hHVC, int nAppID, Int returnStatus);

	public int setAppID(int nAppID, Int returnStatus)
	{
		return setAppID(handle, nAppID, returnStatus);
	}


	/**
	 * アプリケーションID取得
	 */
	private native int getAppID(long hHVC, Int appID, Int returnStatus);

	public int getAppID(Int appID, Int returnStatus)
	{
		return getAppID(handle, appID, returnStatus);
	}


	/**
	 * OKAOモード設定
	 */
	private native int setOkaoMode(long hHVC, int booleanOkaoMode, Int returnStatus);

	public int setOkaoMode(int booleanOkaoMode, Int returnStatus)
	{
		return setOkaoMode(handle, booleanOkaoMode, returnStatus);
	}


	/**
	 * OKAOモード取得
	 */
	private native int getOkaoMode(long hHVC, Int booleanOkaoMode, Int returnStatus);

	public int getOkaoMode(Int booleanOkaoMode, Int returnStatus)
	{
		return getOkaoMode(handle, booleanOkaoMode, returnStatus);
	}


	/**
	 * ファイル数取得
	 */
	private native int getFileCount(long hHVC, int nFileExt, Int fileCount, Int returnStatus);

	public int getFileCount(int nFileExt, Int fileCount, Int returnStatus)
	{
		return getFileCount(handle, nFileExt, fileCount, returnStatus);
	}


	/**
	 * ファイル情報取得
	 */
	private native int getFileInfo(long hHVC, int nFileExt, int nFileIndex, FileInfo fileInfo, Int returnStatus);

	public int getFileInfo(int nFileExt, int nFileIndex, FileInfo fileInfo, Int returnStatus)
	{
		return getFileInfo(handle, nFileExt, nFileIndex, fileInfo, returnStatus);
	}


	/**
	 * ファイルダウンロード
	 */
	private native int downloadFile(long hHVC, FileInfo fileInfo, byte[] byBuffer, Int returnStatus);

	public int downloadFile(FileInfo fileInfo, byte[] byBuffer, Int returnStatus)
	{
		return downloadFile(handle, fileInfo, byBuffer, returnStatus);
	}


	/**
	 * ファイルアップロード
	 */
	private native int uploadFile(long hHVC, String stFileName, int nBufferSize, byte[] byBuffer, Int returnStatus);

	public int uploadFile(String stFileName, int nBufferSize, byte[] byBuffer, Int returnStatus)
	{
		return uploadFile(handle, stFileName, nBufferSize, byBuffer, returnStatus);
	}


	/**
	 * ファイルの削除
	 */
	private native int deleteFile(long hHVC, FileInfo fileInfo, Int returnStatus);

	public int deleteFile(FileInfo fileInfo, Int returnStatus)
	{
		return deleteFile(handle, fileInfo, returnStatus);
	}


	/**
	 * OKAO実行画像サイズ取得
	 */
	private native int getLastOkaoImageSize(long hHVC, Int imageSize, Int returnStatus);

	public int getLastOkaoImageSize(Int imageSize, Int returnStatus)
	{
		return getLastOkaoImageSize(handle, imageSize, returnStatus);
	}


	/**
	 * OKAO実行画像の取得
	 */
	private native int getLastOkaoImage(long hHVC, int nImgBufSize, byte[] byImage, Int returnStatus);

	public int getLastOkaoImage(int nImgBufSize, byte[] byImage, Int returnStatus)
	{
		return getLastOkaoImage(handle, nImgBufSize, byImage, returnStatus);
	}


	/**
	 * 撮影
	 */
	private native int takePicture(long hHVC, FileInfo fileInfo, Int returnStatus);

	public int takePicture(FileInfo fileInfo, Int returnStatus)
	{
		return takePicture(handle, fileInfo, returnStatus);
	}


	/**
	 * しきい値設定
	 */
	private native int setThreshold(long hHVC, int nBody, int nHand, int nPet, int nFace, int nRecognition, Int returnStatus);

	public int setThreshold(int nBody, int nHand, int nPet, int nFace, int nRecognition, Int returnStatus)
	{
		return setThreshold(handle, nBody, nHand, nPet, nFace, nRecognition, returnStatus);
	}


	/**
	 * しきい値取得
	 */
	private native int getThreshold(long hHVC, Int body, Int hand, Int pet, Int face, Int recognition, Int returnStatus);

	public int getThreshold(Int body, Int hand, Int pet, Int face, Int recognition, Int returnStatus)
	{
		return getThreshold(handle, body, hand, pet, face, recognition, returnStatus);
	}


	/**
	 * 検出サイズ設定
	 */
	private native int setSizeRange(long hHVC, int nMinBody, int nMaxBody, int nMinHand, int nMaxHand,
									int nMinPet, int nMaxPet, int nMinFace, int nMaxFace, Int returnStatus);

	public int setSizeRange(int nMinBody, int nMaxBody, int nMinHand, int nMaxHand,
									int nMinPet, int nMaxPet, int nMinFace, int nMaxFace, Int returnStatus)
	{
		return setSizeRange(handle, nMinBody, nMaxBody, nMinHand, nMaxHand,
									nMinPet, nMaxPet, nMinFace, nMaxFace, returnStatus);
	}


	/**
	 * 検出サイズ取得
	 */
	private native int getSizeRange(long hHVC, Int minBody, Int maxBody, Int minHand, Int maxHand,
									Int minPet, Int maxPet, Int minFace, Int maxFace, Int returnStatus);

	public int getSizeRange(Int minBody, Int maxBody, Int minHand, Int maxHand,
									Int minPet, Int maxPet, Int minFace, Int maxFace, Int returnStatus)
	{
		return getSizeRange(handle, minBody, maxBody, minHand, maxHand,
									minPet, maxPet, minFace, maxFace, returnStatus);
	}


	/**
	 * 検出角度設定
	 */
	private native int setDetectionAngle(long hHVC, int nBody, int nHand, int nPet, int nFacePose, int nFaceAngle, Int returnStatus);

	public int setDetectionAngle(int nBody, int nHand, int nPet, int nFacePose, int nFaceAngle, Int returnStatus)
	{
		return setDetectionAngle(handle, nBody, nHand, nPet, nFacePose, nFaceAngle, returnStatus);
	}


	/**
	 * 検出角度取得
	 */
	private native int getDetectionAngle(long hHVC, Int body, Int hand, Int pet, Int facePose, Int faceAngle, Int returnStatus);

	public int getDetectionAngle(Int body, Int hand, Int pet, Int facePose, Int faceAngle, Int returnStatus)
	{
		return getDetectionAngle(handle, body, hand, pet, facePose, faceAngle, returnStatus);
	}


	/**
	 * OKAO実行
	 */
	private native int okaoExecute(long hHVC, int[] aBooleanUseFunction, OkaoResult result, Int returnStatus);

	public int okaoExecute(int[] aBooleanUseFunction, OkaoResult result, Int returnStatus)
	{
		return okaoExecute(handle, aBooleanUseFunction, result, returnStatus);
	}


	/**
	 * アルバム登録
	 */
	private native int albumRegister(long hHVC, int nUserID, int nDataID, ResultDetection faceResult, FileInfo fileInfo, Int returnStatus);

	public int albumRegister(int nUserID, int nDataID, ResultDetection faceResult, FileInfo fileInfo, Int returnStatus)
	{
		return albumRegister(handle, nUserID, nDataID, faceResult, fileInfo, returnStatus);
	}


	/**
	 * 登録者名変更
	 */
	private native int albumSetUserName(long hHVC, int nUserID, String stName, Int returnStatus);

	public int albumSetUserName(int nUserID, String stName, Int returnStatus)
	{
		return albumSetUserName(handle, nUserID, stName, returnStatus);
	}


	/**
	 * 登録者名取得
	 */
	private native int albumGetUserName(long hHVC, int nUserID, StringBuffer sbName, Int returnStatus);

	public int albumGetUserName(int nUserID, StringBuffer sbName, Int returnStatus)
	{
		return albumGetUserName(handle, nUserID, sbName, returnStatus);
	}


	/**
	 * 登録データ削除
	 */
	private native int albumDeleteData(long hHVC, int nUserID, int nDataID, Int returnStatus);

	public int albumDeleteData(int nUserID, int nDataID, Int returnStatus)
	{
		return albumDeleteData(handle, nUserID, nDataID, returnStatus);
	}


	/**
	 * すべての登録情報をクリア
	 */
	private native int albumDeleteAllData(long hHVC, Int returnStatus);

	public int albumDeleteAllData(Int returnStatus)
	{
		return albumDeleteAllData(handle, returnStatus);
	}


	/**
	 * 登録状態取得
	 */
	private native int albumGetRegistrationStatus(long hHVC, int nUserID, int[] aBooleanExist, Int returnStatus);

	public int albumGetRegistrationStatus(int nUserID, int[] aBooleanExist, Int returnStatus)
	{
		return albumGetRegistrationStatus(handle, nUserID, aBooleanExist, returnStatus);
	}


	/**
	 * アルバムサイズ取得
	 */
	private native int albumGetSize(long hHVC, Int nAlbumSize, Int returnStatus);

	public int albumGetSize(Int nAlbumSize, Int returnStatus)
	{
		return albumGetSize(handle, nAlbumSize, returnStatus);
	}


	/**
	 * アルバムのダウンロード
	 */
	private native int albumDownload(long hHVC, byte[] byAlbum, Int returnStatus);

	public int albumDownload(byte[] byAlbum, Int returnStatus)
	{
		return albumDownload(handle, byAlbum, returnStatus);
	}


	/**
	 * アルバムのアップロード
	 */
	private native int albumUpload(long hHVC, int nAlbumSize, byte[] byAlbum, Int returnStatus);

	public int albumUpload(int nAlbumSize, byte[] byAlbum, Int returnStatus)
	{
		return albumUpload(handle, nAlbumSize, byAlbum, returnStatus);
	}


	/**
	 * アルバムのFlash書き込み
	 */
	private native int albumSave(long hHVC, Int returnStatus);

	public int albumSave(Int returnStatus)
	{
		return albumSave(handle, returnStatus);
	}


	/**
	 * スケジュール設定
	 */
	private native int setScheduler(long hHVC, int nSchedulerType, int booleanEnable, ScheduleInfo schedule, Int returnStatus);

	public int setScheduler(int nSchedulerType, int booleanEnable, ScheduleInfo schedule, Int returnStatus)
	{
		return setScheduler(handle, nSchedulerType, booleanEnable, schedule, returnStatus);
	}


	/**
	 * スケジュール取得
	 */
	private native int getScheduler(long hHVC, int nSchedulerType, Int booleanEnable, ScheduleInfo schedule, Int returnStatus);

	public int getScheduler(int nSchedulerType, Int booleanEnable, ScheduleInfo schedule, Int returnStatus)
	{
		return getScheduler(handle, nSchedulerType, booleanEnable, schedule, returnStatus);
	}


	/**
	 * イベントプログラム設定(音声検知)
	 */
	private native int setSoundEventProgram(long hHVC, int booleanEnable, EventProgramSound eventProgram, Int returnStatus);

	public int setSoundEventProgram(int booleanEnable, EventProgramSound eventProgram, Int returnStatus)
	{
		return setSoundEventProgram(handle, booleanEnable, eventProgram, returnStatus);
	}


	/**
	 * イベントプログラム設定(動体検知)
	 */
	private native int setMotionEventProgram(long hHVC, int booleanEnable, int nIndex, EventProgramMotion eventProgram, Int returnStatus);

	public int setMotionEventProgram(int booleanEnable, int nIndex, EventProgramMotion eventProgram, Int returnStatus)
	{
		return setMotionEventProgram(handle, booleanEnable, nIndex, eventProgram, returnStatus);
	}


	/**
	 * イベントプログラム設定(タイマー)
	 */
	private native int setTimerEventProgram(long hHVC, int booleanEnable, EventProgramTimer eventProgram, Int returnStatus);

	public int setTimerEventProgram(int booleanEnable, EventProgramTimer eventProgram, Int returnStatus)
	{
		return setTimerEventProgram(handle, booleanEnable, eventProgram, returnStatus);
	}


	/**
	 * イベントプログラム取得(音声検知)
	 */
	private native int getSoundEventProgram(long hHVC, Int booleanEnable, EventProgramSound eventProgram, Int returnStatus);

	public int getSoundEventProgram(Int booleanEnable, EventProgramSound eventProgram, Int returnStatus)
	{
		return getSoundEventProgram(handle, booleanEnable, eventProgram, returnStatus);
	}


	/**
	 * イベントプログラム取得(動体検知)
	 */
	private native int getMotionEventProgram(long hHVC, Int booleanEnable, int nIndex, EventProgramMotion eventProgram, Int returnStatus);

	public int getMotionEventProgram(Int booleanEnable, int nIndex, EventProgramMotion eventProgram, Int returnStatus)
	{
		return getMotionEventProgram(handle, booleanEnable, nIndex, eventProgram, returnStatus);
	}


	/**
	 * イベントプログラム取得(タイマー)
	 */
	private native int getTimerEventProgram(long hHVC, Int booleanEnable, EventProgramTimer eventProgram, Int returnStatus);

	public int getTimerEventProgram(Int booleanEnable, EventProgramTimer eventProgram, Int returnStatus)
	{
		return getTimerEventProgram(handle, booleanEnable, eventProgram, returnStatus);
	}
}
