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

public final class FileInfo
{
	private String stName;
	private int    nSize;
	private int    Reserved;


	public FileInfo()
	{
		this.stName   = "";
		this.nSize    = 0;
		this.Reserved = 0;
	}

	public FileInfo(String stName, int nSize, int Reserved)
	{
		this.stName   = new String(stName);
		this.nSize    = nSize;
		this.Reserved = Reserved;
	}


	public String getName()
	{
		return this.stName;
	}

	public int getSize()
	{
		return this.nSize;
	}

	public int getReserved()
	{
		return this.Reserved;
	}


	public void setName(String stName)
	{
		this.stName = new String(stName);
	}

	public void setSize(int nSize)
	{
		this.nSize = nSize;
	}

	public void setReserved(int Reserved)
	{
		this.Reserved = Reserved;
	}
}
