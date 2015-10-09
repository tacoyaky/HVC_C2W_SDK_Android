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

import java.util.Arrays;

/**
 * 表情推定結果
 */
public final class ResultExpression
{
	private int[] anScore;
	private int nDegree;


	public ResultExpression()
	{
		this.anScore = new int[HvcwApi.HVCW_Expression_Max];
		this.nDegree = 0;
	}

	public ResultExpression(int[] anScore, int nDegree)
	{
		this.anScore = Arrays.copyOf(anScore, anScore.length);
		this.nDegree = nDegree;
	}


	public int[] getScore()
	{
		return this.anScore;
	}

	public int getDegree()
	{
		return this.nDegree;
	}


	public void setScore(int[] anScore)
	{
		this.anScore = Arrays.copyOf(anScore, anScore.length);
	}

	public void setDegree(int nDegree)
	{
		this.nDegree = nDegree;
	}
}
