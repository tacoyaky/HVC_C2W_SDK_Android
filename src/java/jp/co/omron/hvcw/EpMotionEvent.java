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
 * 動体検知イベント
 */
public final class EpMotionEvent
{
	private Rect rect;
	private int nSensitivity;
	private int nDuration;
	private int nRatio;
	private int nOffPeriod;


	public EpMotionEvent()
	{
		this.rect         = new Rect();
		this.nSensitivity = 0;
		this.nDuration    = 0;
		this.nRatio       = 0;
		this.nOffPeriod   = 0;
	}

	public EpMotionEvent(Rect rect, int nSensitivity, int nDuration, int nRatio, int nOffPeriod)
	{
		this.rect         = new Rect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		this.nSensitivity = nSensitivity;
		this.nDuration    = nDuration;
		this.nRatio       = nRatio;
		this.nOffPeriod   = nOffPeriod;
	}


	public Rect getRect()
	{
		return this.rect;
	}

	public int getSensitivity()
	{
		return this.nSensitivity;
	}

	public int getDuration()
	{
		return this.nDuration;
	}

	public int getRatio()
	{
		return this.nRatio;
	}

	public int getOffPeriod()
	{
		return this.nOffPeriod;
	}


	public void setRect(Rect rect)
	{
		this.rect.setX(rect.getX());
		this.rect.setY(rect.getY());
		this.rect.setWidth(rect.getWidth());
		this.rect.setHeight(rect.getHeight());
	}

	public void setSensitivity(int nSensitivity)
	{
		this.nSensitivity = nSensitivity;
	}

	public void setDuration(int nDuration)
	{
		this.nDuration = nDuration;
	}

	public void setRatio(int nRatio)
	{
		this.nRatio = nRatio;
	}

	public void setOffPeriod(int nOffPeriod)
	{
		this.nOffPeriod = nOffPeriod;
	}
}
