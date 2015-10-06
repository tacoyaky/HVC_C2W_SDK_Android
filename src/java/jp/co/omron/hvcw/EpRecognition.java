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
 * 顔認証
 */
public final class EpRecognition
{
	private int booleanEnable;


	public EpRecognition()
	{
		this.booleanEnable = 0;
	}

	public EpRecognition(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}


	public int getEnable()
	{
		return this.booleanEnable;
	}


	public void setEnable(int booleanEnable)
	{
		this.booleanEnable = booleanEnable;
	}
}
