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
 * 年齢推定
 */
public final class EpAge
{
	private int   booleanEnable;
	private Range ageRange;
	private int   nConfidence;


	public EpAge()
	{
		this.booleanEnable = 0;
		this.ageRange      = new Range();
		this.nConfidence   = 0;
	}

	public EpAge(int booleanEnable, Range ageRange, int nConfidence)
	{
		this.booleanEnable = booleanEnable;
		this.ageRange      = new Range(ageRange.getMin(), ageRange.getMax());
		this.nConfidence   = nConfidence;
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}

	public Range getRange()
	{
		return this.ageRange;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}

	public void setRange(Range ageRange)
	{
		this.ageRange = new Range(ageRange.getMin(), ageRange.getMax());
	}

	public void setConfidence(int nConfidence)
	{
		this.nConfidence = nConfidence;
	}
}
