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
 * 顔認証通知設定
 */
public final class EpFrNotification
{
	private EpFrPushAlert pushAlert;
	private EpFrSound     sound;


	public EpFrNotification()
	{
		this.pushAlert = new EpFrPushAlert();
		this.sound     = new EpFrSound();
	}

	public EpFrNotification(EpFrPushAlert pushAlert, EpFrSound sound)
	{
		this.pushAlert = new EpFrPushAlert(pushAlert.getEpKnownuser(), pushAlert.getEpPushAlert());
		this.sound     = new EpFrSound(sound.getEpKnownuser(), sound.getEpSound());
	}


	public EpFrPushAlert getEpFrPushAlert()
	{
		return this.pushAlert;
	}

	public EpFrSound getEpFrSound()
	{
		return this.sound;
	}


	public void setEpFrPushAlert(EpFrPushAlert pushAlert)
	{
		this.pushAlert = new EpFrPushAlert(pushAlert.getEpKnownuser(), pushAlert.getEpPushAlert());
	}

	public void setEpFrSound(EpFrSound sound)
	{
		this.sound = new EpFrSound(sound.getEpKnownuser(), sound.getEpSound());
	}
}
