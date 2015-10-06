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
 * 検出結果
 */
public final class ResultDetection
{
	private Point ptCenter;
	private int nSize;
	private int nConfidence;


	public ResultDetection()
	{
		this.ptCenter    = new Point();
		this.nSize       = 0;
		this.nConfidence = 0;
	}

	public ResultDetection(Point ptCenter, int nSize, int nConfidence)
	{
		this.ptCenter    = new Point(ptCenter.getX(), ptCenter.getY());
		this.nSize       = nSize;
		this.nConfidence = nConfidence;
	}


	public Point getCenter()
	{
		return this.ptCenter;
	}

	public int getSize()
	{
		return this.nSize;
	}

	public int getConfidence()
	{
		return this.nConfidence;
	}


	public void setCenter(Point ptCenter)
	{
		this.ptCenter = new Point(ptCenter.getX(), ptCenter.getY());
	}

	public void setSize(int nSize)
	{
		this.nSize = nSize;
	}

	public void setConfidence(int nConfidence)
	{
		this.nConfidence = nConfidence;
	}
}
