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
 * 視線推定結果
 */
public final class ResultGaze
{
	private int nLR;
	private int nUD;


	public ResultGaze()
	{
		this.nLR = 0;
		this.nUD = 0;
	}

	public ResultGaze(int nLR, int nUD)
	{
		this.nLR = nLR;
		this.nUD = nUD;
	}


	public int getLR()
	{
		return this.nLR;
	}

	public int getUD()
	{
		return this.nUD;
	}


	public void setLR(int nLR)
	{
		this.nLR = nLR;
	}

	public void setUD(int nUD)
	{
		this.nUD = nUD;
	}
}
