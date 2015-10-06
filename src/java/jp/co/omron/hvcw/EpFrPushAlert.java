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
 * 顔認証プッシュ通知
 */
public final class EpFrPushAlert
{
	private EpKnownuser[] knownUser;
	private EpPushAlert   unknownUser;


	public EpFrPushAlert()
	{
		this.knownUser = new EpKnownuser[20];
		for(int i=0; i<knownUser.length; i++)
		{
			this.knownUser[i] = new EpKnownuser();
		}
		this.unknownUser = new EpPushAlert();
	}

	public EpFrPushAlert(EpKnownuser[] knownUser, EpPushAlert unknownUser)
	{
		this.knownUser = new EpKnownuser[20];
		for(int i=0; i<knownUser.length; i++)
		{
			this.knownUser[i] = new EpKnownuser(knownUser[i].getUserID(), knownUser[i].getFileInfo());
		}
		this.unknownUser = new EpPushAlert(unknownUser.getEnable(), unknownUser.getFileInfo());
	}


	public EpKnownuser[] getEpKnownuser()
	{
		return this.knownUser;
	}

	public EpPushAlert getEpPushAlert()
	{
		return this.unknownUser;
	}


	public void setEpKnownuser(EpKnownuser[] knownUser)
	{
		this.knownUser = new EpKnownuser[20];
		for(int i=0; i<knownUser.length; i++)
		{
			this.knownUser[i] = new EpKnownuser(knownUser[i].getUserID(), knownUser[i].getFileInfo());
		}
	}

	public void setEpPushAlert(EpPushAlert unknownUser)
	{
		this.unknownUser = new EpPushAlert(unknownUser.getEnable(), unknownUser.getFileInfo());
	}
}
