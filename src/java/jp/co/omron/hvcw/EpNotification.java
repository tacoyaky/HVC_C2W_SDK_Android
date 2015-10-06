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
 * プッシュ通知
 */
public final class EpNotification
{
	private EpPushAlert pushAlert;
	private EpSound     sound;


	public EpNotification()
	{
		this.pushAlert = new EpPushAlert();
		this.sound     = new EpSound();
	}

	public EpNotification(EpPushAlert pushAlert, EpSound sound)
	{
		this.pushAlert = new EpPushAlert(pushAlert.getEnable(), pushAlert.getFileInfo());
		this.sound     = new EpSound(sound.getEnable(), sound.getFileInfo());
	}


	public EpPushAlert getEpPushAlert()
	{
		return this.pushAlert;
	}

	public EpSound getEpSound()
	{
		return this.sound;
	}


	public void setEpPushAlert(EpPushAlert pushAlert)
	{
		this.pushAlert = new EpPushAlert(pushAlert.getEnable(), pushAlert.getFileInfo());
	}

	public void setEpSound(EpSound sound)
	{
		this.sound = new EpSound(sound.getEnable(), sound.getFileInfo());
	}
}
