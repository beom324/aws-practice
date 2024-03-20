package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.MemberVO;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Repository
public class MemberDAO {
	
	
	
	public List<MemberVO> listMember(){
		return DBManager.list();
	}

}
