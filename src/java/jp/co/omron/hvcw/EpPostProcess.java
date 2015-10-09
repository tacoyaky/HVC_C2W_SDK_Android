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
 * ポスト処理
 */
public final class EpPostProcess
{
	private int            nSaveLog;
	private int            nSaveImage;
	private EpNotification notification;


	public EpPostProcess()
	{
		this.nSaveLog     = 0;
		this.nSaveImage   = 0;
		this.notification = new EpNotification();
	}

	public EpPostProcess(int nSaveLog, int nSaveImage, EpNotification notification)
	{
		this.nSaveLog     = nSaveLog;
		this.nSaveImage   = nSaveImage;
		this.notification = new EpNotification(notification.getEpPushAlert(), notification.getEpSound());
	}


	public int getSaveLog()
	{
		return this.nSaveLog;
	}

	public int getSaveImage()
	{
		return this.nSaveImage;
	}

	public EpNotification getEpNotification()
	{
		return this.notification;
	}


	public void setSaveLog(int nSaveLog)
	{
		this.nSaveLog = nSaveLog;
	}

	public void setSaveImage(int nSaveImage)
	{
		this.nSaveImage = nSaveImage;
	}

	public void setEpNotification(EpNotification notification)
	{
		this.notification = new EpNotification(notification.getEpPushAlert(), notification.getEpSound());
	}
}
