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
 * 人体検出結果
 */
public final class ResultBodys
{
	private int nCount;
	private ResultDetection[] body;


	public ResultBodys()
	{
		this.nCount = 0;
		this.body   = new ResultDetection[35];
		for(int i=0; i<body.length; i++)
		{
			this.body[i] = new ResultDetection();
		}
	}

	public ResultBodys(int nCount, ResultDetection[] body)
	{
		this.nCount = nCount;
		this.body   = new ResultDetection[35];
		for(int i=0; i<this.body.length; i++)
		{
			this.body[i] = new ResultDetection(body[i].getCenter(),
												body[i].getSize(),
												body[i].getConfidence());
		}
	}


	public int getCount()
	{
		return this.nCount;
	}

	public ResultDetection[] getResultDetection()
	{
		return this.body;
	}


	public void setCount(int nCount)
	{
		this.nCount = nCount;
	}

	public void setResultDetection(ResultDetection[] body)
	{
		this.body = new ResultDetection[35];
		for(int i=0; i<this.body.length; i++)
		{
			this.body[i] = new ResultDetection(body[i].getCenter(),
												body[i].getSize(),
												body[i].getConfidence());
		}
	}
}
