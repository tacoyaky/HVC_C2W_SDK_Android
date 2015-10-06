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
 * 人体検出
 */
public final class EpBody
{
	private int booleanEnable;
	private int nCount;


	public EpBody()
	{
		this.booleanEnable = 0;
		this.nCount        = 0;
	}

	public EpBody(int booleanEnable, int nCount)
	{
		this.booleanEnable = booleanEnable;
		this.nCount        = nCount;
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}

	public int getCount()
	{
		return this.nCount;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}

	public void setCount(int nCount)
	{
		this.nCount = nCount;
	}
}
