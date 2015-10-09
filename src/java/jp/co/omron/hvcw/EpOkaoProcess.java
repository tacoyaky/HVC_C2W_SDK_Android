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
 * OKAO処理
 */
public final class EpOkaoProcess
{
	private EpBody        body;
	private EpPet         pet;
	private EpFace        face;
	private EpAge         age;
	private EpGender      gender;
	private EpExpression  expression;
	private EpRecognition recognition;


	public EpOkaoProcess()
	{
		this.body        = new EpBody();
		this.pet         = new EpPet();
		this.face        = new EpFace();
		this.age         = new EpAge();
		this.gender      = new EpGender();
		this.expression  = new EpExpression();
		this.recognition = new EpRecognition();
	}

	public EpOkaoProcess(EpBody body, EpPet pet, EpFace face, EpAge age, EpGender gender,
							EpExpression expression, EpRecognition recognition)
	{
		this.body        = new EpBody(body.getEnable(), body.getCount());
		this.pet         = new EpPet(pet.getEnable(), pet.getCount());
		this.face        = new EpFace(face.getEnable(), face.getCount());
		this.age         = new EpAge(age.getEnable(), age.getRange(), age.getConfidence());
		this.gender      = new EpGender(gender.getEnable(), gender.getGender(), gender.getConfidence());
		this.expression  = new EpExpression(expression.getEnable(), expression.getExpression(),
											expression.getScore(), expression.getRange());
		this.recognition = new EpRecognition(recognition.getEnable());
	}


	public EpBody getEpBody()
	{
		return this.body;
	}

	public EpPet getEpPet()
	{
		return this.pet;
	}

	public EpFace getEpFace()
	{
		return this.face;
	}

	public EpAge getEpAge()
	{
		return this.age;
	}

	public EpGender getEpGender()
	{
		return this.gender;
	}

	public EpExpression getEpExpression()
	{
		return this.expression;
	}

	public EpRecognition getEpRecognition()
	{
		return this.recognition;
	}


	public void setEpBody(EpBody body)
	{
		this.body = new EpBody(body.getEnable(), body.getCount());
	}

	public void setEpPet(EpPet pet)
	{
		this.pet = new EpPet(pet.getEnable(), pet.getCount());
	}

	public void setEpFace(EpFace face)
	{
		this.face = new EpFace(face.getEnable(), face.getCount());
	}

	public void setEpAge(EpAge age)
	{
		this.age = new EpAge(age.getEnable(), age.getRange(), age.getConfidence());
	}

	public void setEpGender(EpGender gender)
	{
		this.gender = new EpGender(gender.getEnable(), gender.getGender(), gender.getConfidence());
	}

	public void setEpExpression(EpExpression expression)
	{
		this.expression = new EpExpression(expression.getEnable(), expression.getExpression(),
											expression.getScore(), expression.getRange());
	}

	public void setEpRecognition(EpRecognition recognition)
	{
		this.recognition = new EpRecognition(recognition.getEnable());
	}
}
