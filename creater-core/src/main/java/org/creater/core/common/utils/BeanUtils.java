package org.creater.core.common.utils;

import java.util.List;

import org.apache.dubbo.common.utils.CollectionUtils;

public class BeanUtils extends org.springframework.beans.BeanUtils{

	
	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void copyListPoperties(List sourceList , List targetList, Class targetClass){
		if(CollectionUtils.isNotEmpty(sourceList)) {
//			targetList = new ArrayList<>();
			for (Object source : sourceList) {
				try {
					Object target = targetClass.newInstance();
					copyProperties(source, target);
					targetList.add(target);
				} catch (Exception e) {
					throw new RuntimeException(e);
				} 
			}
		}
	}
}
