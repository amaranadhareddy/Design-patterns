package com.sapient.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionFactory {

	private static Map<String, String> cmap;
	
	static{
		cmap = new HashMap<>();
		cmap.put("al", "java.util.ArrayList");
		cmap.put("v", "java.util.Vector");
		cmap.put("ll", "java.util.LinkedList");
		cmap.put("hs", "java.util.HashSet");
		cmap.put("lhs", "java.util.LinkedHashSet");
		cmap.put("ts", "java.util.TreeSet");
	}
	public static Collection<String> getCollection(String type) throws Exception{
		Collection<String> col = null;
		if(!cmap.containsKey(type))
			throw new Exception("Factory can't crate instance for your type");
		col = (Collection)Class.forName(cmap.get(type)).newInstance();
		return col;
	}
}
