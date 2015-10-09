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
 * 顔認証音声出力
 */
public final class EpFrSound
{
	private EpKnownuser[] knownUser;
	private EpSound       unknownUser;


	public EpFrSound()
	{
		this.knownUser = new EpKnownuser[20];
		for(int i=0; i<knownUser.length; i++)
		{
			this.knownUser[i] = new EpKnownuser();
		}
		this.unknownUser = new EpSound();
	}

	public EpFrSound(EpKnownuser[] knownUser, EpSound unknownUser)
	{
		this.knownUser = new EpKnownuser[20];
		for(int i=0; i<knownUser.length; i++)
		{
			this.knownUser[i] = new EpKnownuser(knownUser[i].getUserID(), knownUser[i].getFileInfo());
		}
		this.unknownUser = new EpSound(unknownUser.getEnable(), unknownUser.getFileInfo());
	}


	public EpKnownuser[] getEpKnownuser()
	{
		return this.knownUser;
	}

	public EpSound getEpSound()
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

	public void setEpSound(EpSound unknownUser)
	{
		this.unknownUser = new EpSound(unknownUser.getEnable(), unknownUser.getFileInfo());
	}
}
