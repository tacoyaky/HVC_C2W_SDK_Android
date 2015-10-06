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
 * タイマーイベント
 */
public final class EpTimerEvent
{
	private int nInterval;


	public EpTimerEvent()
	{
		this.nInterval = 0;
	}

	public EpTimerEvent(int nInterval)
	{
		this.nInterval = nInterval;
	}


	public int getInterval()
	{
		return this.nInterval;
	}


	public void setInterval(int nInterval)
	{
		this.nInterval = nInterval;
	}
}
