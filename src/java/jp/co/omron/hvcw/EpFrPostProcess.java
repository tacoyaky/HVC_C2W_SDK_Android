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
 * 顔認証ポスト処理
 */
public final class EpFrPostProcess
{
	private int              nSaveImage;
	private EpFrNotification notification;


	public EpFrPostProcess()
	{
		this.nSaveImage   = 0;
		this.notification = new EpFrNotification();
	}

	public EpFrPostProcess(int nSaveImage, EpFrNotification notification)
	{
		this.nSaveImage   = nSaveImage;
		this.notification = new EpFrNotification(notification.getEpFrPushAlert(), notification.getEpFrSound());
	}


	public int getSaveImage()
	{
		return this.nSaveImage;
	}

	public EpFrNotification getEpFrNotification()
	{
		return this.notification;
	}


	public void setSaveImage(int nSaveImage)
	{
		this.nSaveImage = nSaveImage;
	}

	public void setEpFrNotification(EpFrNotification notification)
	{
		this.notification = new EpFrNotification(notification.getEpFrPushAlert(), notification.getEpFrSound());
	}
}
