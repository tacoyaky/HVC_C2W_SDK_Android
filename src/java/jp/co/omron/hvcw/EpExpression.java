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
 * 表情推定
 */
public final class EpExpression
{
	private int   booleanEnable;
	private int   nExpression;
	private int   nScore;
	private Range degreeRange;


	public EpExpression()
	{
		this.booleanEnable = 0;
		this.nExpression   = 0;
		this.nScore        = 0;
		this.degreeRange   = new Range();
	}

	public EpExpression(int booleanEnable, int nExpression, int nScore, Range degreeRange)
	{
		this.booleanEnable = booleanEnable;
		this.nExpression   = nExpression;
		this.nScore        = nScore;
		this.degreeRange   = new Range(degreeRange.getMin(), degreeRange.getMax());
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}

	public int getExpression()
	{
		return this.nExpression;
	}

	public int getScore()
	{
		return this.nScore;
	}

	public Range getRange()
	{
		return this.degreeRange;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}

	public void setExpression(int nExpression)
	{
		this.nExpression = nExpression;
	}

	public void setScore(int nScore)
	{
		this.nScore = nScore;
	}

	public void setRange(Range degreeRange)
	{
		this.degreeRange = new Range(degreeRange.getMin(), degreeRange.getMax());
	}
}
