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
 * 角度
 */
public final class ResultDirection
{
	private int nLR;
	private int nUD;
	private int nRoll;


	public ResultDirection()
	{
		this.nLR   = 0;
		this.nUD   = 0;
		this.nRoll = 0;
	}

	public ResultDirection(int nLR, int nUD, int nRoll)
	{
		this.nLR   = nLR;
		this.nUD   = nUD;
		this.nRoll = nRoll;
	}


	public int getLR()
	{
		return this.nLR;
	}

	public int getUD()
	{
		return this.nUD;
	}

	public int getRoll()
	{
		return this.nRoll;
	}


	public void setLR(int nLR)
	{
		this.nLR = nLR;
	}

	public void setUD(int nUD)
	{
		this.nUD = nUD;
	}

	public void setRoll(int nRoll)
	{
		this.nRoll = nRoll;
	}
}
