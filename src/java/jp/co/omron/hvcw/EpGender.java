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
 * 性別推定
 */
public final class EpGender
{
	private int booleanEnable;
	private int nGender;
	private int nConfidence;


	public EpGender()
	{
		this.booleanEnable = 0;
		this.nGender       = 0;
		this.nConfidence   = 0;
	}

	public EpGender(int booleanEnable, int nGender, int nConfidence)
	{
		this.booleanEnable = booleanEnable;
		this.nGender       = nGender;
		this.nConfidence   = nConfidence;
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}

	public int getGender()
	{
		return this.nGender;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
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
