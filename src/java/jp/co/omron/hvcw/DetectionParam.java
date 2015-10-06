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

public final class DetectionParam
{
	private Rect rect;
	private int  sensitivity;


	public DetectionParam()
	{
		this.rect        = new Rect();
		this.sensitivity = 0;
	}

	public DetectionParam(Rect rect, int nSensitivity)
	{
		this.rect        = new Rect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
		this.sensitivity = nSensitivity;
	}


	public Rect getRect()
	{
		return this.rect;
	}

	public int getSensitivity()
	{
		return this.sensitivity;
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
		this.sensitivity = nSensitivity;
	}
}
