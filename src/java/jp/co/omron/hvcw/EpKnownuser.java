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
 * ユーザー
 */
public final class EpKnownuser
{
	private int      nUserID;
	private FileInfo fileInfo;


	public EpKnownuser()
	{
		this.nUserID  = 0;
		this.fileInfo = new FileInfo();
	}

	public EpKnownuser(int nUserID, FileInfo fileInfo)
	{
		this.nUserID  = nUserID;
		this.fileInfo = new FileInfo(fileInfo.getName(), fileInfo.getSize(), fileInfo.getReserved());
	}


	public int getUserID()
	{
		return this.nUserID;
	}

	public FileInfo getFileInfo()
	{
		return this.fileInfo;
	}


	public void setUserID(int nUserID)
	{
		this.nUserID = nUserID;
	}

	public void setFileInfo(FileInfo fileInfo)
	{
		this.fileInfo = new FileInfo(fileInfo.getName(), fileInfo.getSize(), fileInfo.getReserved());
	}
}
