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
public final class ResultPets
{
	private int nCount;
	private ResultPet[] pet;


	public ResultPets()
	{
		this.nCount = 0;
		this.pet    = new ResultPet[10];
		for(int i=0; i<pet.length; i++)
		{
			this.pet[i] = new ResultPet();
		}
	}

	public ResultPets(int nCount, ResultPet[] pet)
	{
		this.nCount = nCount;
		this.pet    = new ResultPet[10];
		for(int i=0; i<this.pet.length; i++)
		{
			this.pet[i] = new ResultPet(pet[i].getCenter(),
										pet[i].getSize(),
										pet[i].getConfidence(),
										pet[i].getPetType());
		}
	}


	public int getCount()
	{
		return this.nCount;
	}

	public ResultPet[] getResultPet()
	{
		return this.pet;
	}


	public void setCount(int nCount)
	{
		this.nCount = nCount;
	}

	public void setResultPet(ResultPet[] pet)
	{
		this.pet   = new ResultPet[10];
		for(int i=0; i<this.pet.length; i++)
		{
			this.pet[i] = new ResultPet(pet[i].getCenter(),
										pet[i].getSize(),
										pet[i].getConfidence(),
										pet[i].getPetType());
		}
	}
}
