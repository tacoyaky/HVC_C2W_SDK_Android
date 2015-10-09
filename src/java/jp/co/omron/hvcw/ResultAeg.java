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
 * 年齢推定結果
 */
public final class ResultAeg
{
	private int nAge;
	private int nConfidence;


	public ResultAeg()
	{
		this.nAge        = 0;
		this.nConfidence = 0;
	}

	public ResultAeg(int nAge, int nConfidence)
	{
		this.nAge        = nAge;
		this.nConfidence = nConfidence;
	}


	public int getAge()
	{
		return this.nAge;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}


	public void setAge(int nAge)
	{
		this.nAge = nAge;
	}

	public void setConfidence(int nConfidence)
	{
		this.nConfidence = nConfidence;
	}
}
