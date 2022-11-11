package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.travel.entity.Profile;
import com.travel.repository.ProfileRepository;

public class ProfileServiceImpl implements ProfileService{

	
	@Autowired
	ProfileRepository profileRepository;
	
	@Override
	public Profile addProfile(Profile profile) {
		// TODO Auto-generated method stub
        Profile savedProfile = profileRepository.save(profile);
		
		return savedProfile;
	}

}
