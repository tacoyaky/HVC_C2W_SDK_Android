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
 * 性別推定結果
 */
public final class ResultGender
{
	private int nGender;
	private int nConfidence;


	public ResultGender()
	{
		this.nGender     = 0;
		this.nConfidence = 0;
	}

	public ResultGender(int nGender, int nConfidence)
	{
		this.nGender     = nGender;
		this.nConfidence = nConfidence;
	}


	public int getGender()
	{
		return this.nGender;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}


	public void setGender(int nGender)
	{
		this.nGender = nGender;
	}

	public void setConfidence(int nConfidence)
	{
		this.nConfidence = nConfidence;
	}
}
