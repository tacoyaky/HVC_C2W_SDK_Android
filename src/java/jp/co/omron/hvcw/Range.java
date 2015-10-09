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
 * 最小/最大値
 */
public final class Range
{
	private int nMin;
	private int nMax;


	public Range()
	{
		this.nMin = 0;
		this.nMax = 0;
	}

	public Range(int nMin, int nMax)
	{
		this.nMin = nMin;
		this.nMax = nMax;
	}


	public int getMin()
	{
		return this.nMin;
	}

	public int getMax()
	{
		return this.nMax;
	}


	public void setMin(int nMin)
	{
		this.nMin = nMin;
	}

	public void setMax(int nMax)
	{
		this.nMax = nMax;
	}
}
