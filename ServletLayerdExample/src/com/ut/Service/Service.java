package com.ut.Service;

import com.ut.BO.StudentBO;
import com.ut.Dto.StudentDto;
import com.ut.Vo.StudentVO;
import com.ut.dao.StudentDao;

public class Service
{
	public String generateString(StudentDto dto)
	{
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		StudentDao dao=null;
		int cnt=0;
		total=dto.getM1();
		avg=total/3.0f;
		if(avg<35)
		{
			result="Fail";
		}
		else
		{
			result="Pass";
		}
		bo=new StudentBO();
		 bo.setSno(dto.getSno());
		 bo.setSname(dto.getSname());
		 bo.setTotal(total);
		 bo.setAvg(avg);
		 bo.setResult(result);
		 //UseDao
		 dao=new StudentDao();
		 cnt=dao.insert(bo);
		// cnt=dao.insert();
		 if(cnt==0)
		 {
			 return"Registration Failed";
		 }
		 else
		 {
			 return"Registration succeded and Result"+result;
		 }		
	}
}