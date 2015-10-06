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
 * Rect Class : Sets/Gets Rectangle Co-ordinates.
 */
public final class Rect
{
	/** Left value */
	private int x;
	/** Top value */
	private int y;
	/** Right value */
	private int width;
	/** Bottom value */
	private int height;


	/**
	 * Rect Class Constructor
	 */
	public Rect()
	{
		this.x      = 0;
		this.y      = 0;
		this.width  = 0;
		this.height = 0;
	}

	public Rect(int nX, int nY, int nWidth, int nHeight)
	{
		this.x      = nX;
		this.y      = nY;
		this.width  = nWidth;
		this.height = nHeight;
	}


	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public int getWidth()
	{
		return this.width;
	}

	public int getHeight()
	{
		return this.height;
	}


	public void setX(int nX)
	{
		this.x = nX;
	}

	public void setY(int nY)
	{
		this.y = nY;
	}

	public void setWidth(int nWidth)
	{
		this.width = nWidth;
	}

	public void setHeight(int nHeight)
	{
		this.height = nHeight;
	}
}
