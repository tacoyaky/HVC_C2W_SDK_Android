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
 * ストレージ情報
 */
public final class StorageInfo
{
	private int nTotalSize;		/* total_size ストレージ総容量（単位:バイト）     */
	private int nUsedSize;		/* used_size 使用済みストレージ容量（単位:バイト）*/
	private int nFreeSize;		/* free_size 空きストレージ容量（単位:バイト）    */
	private int nStorageStatus;	/* storage_status ストレージステータス            */


	public StorageInfo()
	{
		this.nTotalSize     = 0;
		this.nUsedSize      = 0;
		this.nFreeSize      = 0;
		this.nStorageStatus = 0;
	}

	public StorageInfo(int nTotalSize, int nUsedSize, int nFreeSize, int nStorageStatus)
	{
		this.nTotalSize     = nTotalSize;
		this.nUsedSize      = nUsedSize;
		this.nFreeSize      = nFreeSize;
		this.nStorageStatus = nStorageStatus;
	}


	public int getTotalSize()
	{
		return this.nTotalSize;
	}

	public int getUsedSize()
	{
		return this.nUsedSize;
	}

	public int getFreeSize()
	{
		return this.nFreeSize;
	}

	public int getStorageStatus()
	{
		return this.nStorageStatus;
	}


	public void setTotalSize(int nTotalSize)
	{
		this.nTotalSize = nTotalSize;
	}

	public void setUsedSize(int nUsedSize)
	{
		this.nUsedSize = nUsedSize;
	}

	public void setFreeSize(int nFreeSize)
	{
		this.nFreeSize = nFreeSize;
	}

	public void setStorageStatus(int nStorageStatus)
	{
		this.nStorageStatus = nStorageStatus;
	}
}
