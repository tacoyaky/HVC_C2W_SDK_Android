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
public final class EpPushAlert
{
	private int      booleanEnable;
	private FileInfo fileInfo;


	public EpPushAlert()
	{
		this.booleanEnable = 0;
		this.fileInfo      = new FileInfo();
	}

	public EpPushAlert(int booleanEnable, FileInfo fileInfo)
	{
		this.booleanEnable = booleanEnable;
		this.fileInfo      = new FileInfo(fileInfo.getName(), fileInfo.getSize(), fileInfo.getReserved());
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}

	public FileInfo getFileInfo()
	{
		return this.fileInfo;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}

	public void setFileInfo(FileInfo fileInfo)
	{
		this.fileInfo = new FileInfo(fileInfo.getName(), fileInfo.getSize(), fileInfo.getReserved());
	}
}
