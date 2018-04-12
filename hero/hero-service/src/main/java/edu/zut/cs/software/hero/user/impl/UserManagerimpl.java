package edu.zut.cs.software.hero.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.software.hero.user.UserManager;

@Component
public class UserManagerimpl implements UserManager {

	@Override
	public List<Object> getAll() {
		List<Object> result = new ArrayList<Object>();
		return result;
	}

}
