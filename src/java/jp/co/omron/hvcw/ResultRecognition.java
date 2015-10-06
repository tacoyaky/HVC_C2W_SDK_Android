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
 * 顔認証スコア
 */
public final class ResultRecognition
{
	private int nUID;
	private int nScore;


	public ResultRecognition()
	{
		this.nUID   = 0;
		this.nScore = 0;
	}

	public ResultRecognition(int nUID, int nScore)
	{
		this.nUID   = nUID;
		this.nScore = nScore;
	}


	public int getUID()
	{
		return this.nUID;
	}

	public int getScore()
	{
		return this.nScore;
	}


	public void setUID(int nUID)
	{
		this.nUID = nUID;
	}

	public void setScore(int nScore)
	{
		this.nScore = nScore;
	}
}
