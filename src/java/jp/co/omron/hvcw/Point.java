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
 * 座標点
 */
public final class Point
{
	private int x;
	private int y;


	public Point()
	{
		x = 0;
		y = 0;
	}

	public Point(int nX, int nY)
	{
		x = nX;
		y = nY;
	}


	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}


	public void setX(int nX)
	{
		this.x = nX;
	}

	public void setY(int nY)
	{
		this.y = nY;
	}
}
