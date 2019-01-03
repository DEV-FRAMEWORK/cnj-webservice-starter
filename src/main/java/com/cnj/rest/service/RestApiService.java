package com.cnj.rest.service;

import java.util.ArrayList;
import java.util.List;

import com.cnj.rest.domain.RestApi;
import com.cnj.rest.repository.RestApiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestApiService {

	@Autowired
	RestApiRepository restApiRepository;

	// public List<RestApi> getSampleUserList(String name) {
	// 	return restApiRepository.findByCustomQuery(name);
	// }
    public List<RestApi> getAllRestApi(){
        List<RestApi> rooms = new ArrayList<>();
        this.restApiRepository.findAll().forEach(rooms::add);
        return rooms;
    }
	// public int getSampleUserListSize(SampleUserVo paramVo) {
	// 	return userMapper.countSampleUserList(paramVo);
	// }

	// public SampleUserVo getSampleUser(SampleUserVo paramVo) {
	// 	return userMapper.selectSampleUser(paramVo);
	// }

// 	public int registerSampleUser(SampleUserVo paramVo) {
// //		org.apache.commons.lang3.StringUtils.isNotEmpty("11");
// 		return userMapper.insertSampleUser(paramVo);	
// 	}

	// public int modifySampleUser(SampleUserVo paramVo) {
	// 	return userMapper.updateSampleUser(paramVo);	
	// }
}
