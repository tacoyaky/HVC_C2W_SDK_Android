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
 * 目つむり推定結果
 */
public final class ResultBlink
{
	private int nLeftEye;
	private int nRightEye;


	public ResultBlink()
	{
		this.nLeftEye  = 0;
		this.nRightEye = 0;
	}

	public ResultBlink(int nLeftEye, int nRightEye)
	{
		this.nLeftEye  = nLeftEye;
		this.nRightEye = nRightEye;
	}


	public int getLeftEye()
	{
		return this.nLeftEye;
	}

	public int getRightEye()
	{
		return this.nRightEye;
	}


	public void setLeftEye(int nLeftEye)
	{
		this.nLeftEye = nLeftEye;
	}

	public void setRightEye(int nRightEye)
	{
		this.nRightEye = nRightEye;
	}
}
