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
 * 顔検出結果
 */
public final class ResultFaces
{
	private int nCount;
	private ResultFace[] face;


	public ResultFaces()
	{
		this.nCount = 0;
		this.face   = new ResultFace[35];
		for(int i=0; i<face.length; i++)
		{
			this.face[i] = new ResultFace();
		}
	}

	public ResultFaces(int nCount, ResultFace[] face)
	{
		this.nCount = nCount;
		this.face   = new ResultFace[35];
		for(int i=0; i<this.face.length; i++)
		{
			this.face[i] = new ResultFace(face[i].getCenter(),
											face[i].getSize(),
											face[i].getConfidence(),
											face[i].getDirection(),
											face[i].getAge(),
											face[i].getGender(),
											face[i].getGaze(),
											face[i].getBlink(),
											face[i].getExpression(),
											face[i].getRecognition());
		}
	}


	public int getCount()
	{
		return this.nCount;
	}

	public ResultFace[] getResultFace()
	{
		return this.face;
	}


	public void setCount(int nCount)
	{
		this.nCount = nCount;
	}

	public void setResultFace(ResultFace[] face)
	{
		this.face = new ResultFace[35];
		for(int i=0; i<this.face.length; i++)
		{
			this.face[i] = new ResultFace(face[i].getCenter(),
											face[i].getSize(),
											face[i].getConfidence(),
											face[i].getDirection(),
											face[i].getAge(),
											face[i].getGender(),
											face[i].getGaze(),
											face[i].getBlink(),
											face[i].getExpression(),
											face[i].getRecognition());
		}
	}
}
