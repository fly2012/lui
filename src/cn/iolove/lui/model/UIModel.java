package cn.iolove.lui.model;

import cn.iolove.domain.LuaData;

public class UIModel extends AbstractModel {



public UIModel(LuaData data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

public String getValueByKey(String key)
{
	return (String) hm.get(key);
	
}

}
