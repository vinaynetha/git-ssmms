package com.ssmms.ningw.common.base.dao;

import java.util.List;

public interface BaseDao<T> {

	List<T> queryList(Object id);
	
	T queryByUserName(Object userName);
}
