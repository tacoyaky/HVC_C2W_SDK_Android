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
 * ペット検出結果
 */
public final class ResultPet
{
	private Point ptCenter;
	private int nSize;
	private int nConfidence;
	private int nPetType;


	public ResultPet()
	{
		this.ptCenter    = new Point();
		this.nSize       = 0;
		this.nConfidence = 0;
		this.nPetType    = 0;
	}

	public ResultPet(Point ptCenter, int nSize, int nConfidence, int nPetType)
	{
		this.ptCenter    = new Point(ptCenter.getX(), ptCenter.getY());
		this.nSize       = nSize;
		this.nConfidence = nConfidence;
		this.nPetType    = nPetType;
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

	public int getPetType()
	{
		return this.nPetType;
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

	public void setPetType(int nPetType)
	{
		this.nPetType = nPetType;
	}
}
