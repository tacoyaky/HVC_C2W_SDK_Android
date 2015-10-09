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
public final class OkaoResult
{
	private ResultBodys bodys;
	private ResultHands hands;
	private ResultPets  pets;
	private ResultFaces faces;


	public OkaoResult()
	{
		this.bodys = new ResultBodys();
		this.hands = new ResultHands();
		this.pets  = new ResultPets();
		this.faces = new ResultFaces();
	}

	public OkaoResult(ResultBodys bodys, ResultHands hands, ResultPets pets, ResultFaces faces)
	{
		this.bodys = new ResultBodys(bodys.getCount(), bodys.getResultDetection());
		this.hands = new ResultHands(hands.getCount(), hands.getResultDetection());
		this.pets  = new ResultPets(pets.getCount(), pets.getResultPet());
		this.faces = new ResultFaces(faces.getCount(), faces.getResultFace());
	}


	public ResultBodys getResultBodys()
	{
		return this.bodys;
	}

	public ResultHands getResultHands()
	{
		return this.hands;
	}

	public ResultPets getResultPets()
	{
		return this.pets;
	}

	public ResultFaces getResultFaces()
	{
		return this.faces;
	}


	public void setResultBodys(ResultBodys bodys)
	{
		this.bodys = new ResultBodys(bodys.getCount(), bodys.getResultDetection());
	}

	public void setResultHands(ResultHands hands)
	{
		this.hands = new ResultHands(hands.getCount(), hands.getResultDetection());
	}

	public void setResultPets(ResultPets pets)
	{
		this.pets = new ResultPets(pets.getCount(), pets.getResultPet());
	}

	public void setResultFaces(ResultFaces faces)
	{
		this.faces = new ResultFaces(faces.getCount(), faces.getResultFace());
	}
}
