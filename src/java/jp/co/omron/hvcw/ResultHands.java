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
 * 手検出結果
 */
public final class ResultHands
{
	private int nCount;
	private ResultDetection[] hand;


	public ResultHands()
	{
		this.nCount = 0;
		this.hand   = new ResultDetection[35];
		for(int i=0; i<hand.length; i++)
		{
			this.hand[i] = new ResultDetection();
		}
	}

	public ResultHands(int nCount, ResultDetection[] hand)
	{
		this.nCount = nCount;
		this.hand   = new ResultDetection[35];
		for(int i=0; i<this.hand.length; i++)
		{
			this.hand[i] = new ResultDetection(hand[i].getCenter(),
												hand[i].getSize(),
												hand[i].getConfidence());
		}
	}


	public int getCount()
	{
		return this.nCount;
	}

	public ResultDetection[] getResultDetection()
	{
		return this.hand;
	}


	public void setCount(int nCount)
	{
		this.nCount = nCount;
	}

	public void setResultDetection(ResultDetection[] hand)
	{
		this.hand = new ResultDetection[35];
		for(int i=0; i<this.hand.length; i++)
		{
			this.hand[i] = new ResultDetection(hand[i].getCenter(),
												hand[i].getSize(),
												hand[i].getConfidence());
		}
	}
}
