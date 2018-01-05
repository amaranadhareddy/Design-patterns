package com.sap.service;

import java.util.List;

import com.sap.dao.Mydao;
import com.sap.vo.Category;
import com.sap.vo.Product;
import com.sap.vo.Pspec;

public class MyService {
   private Mydao dao = new Mydao();
   /**
    * composite pattern and facade
    * @return
    */
   public Category getCategory(){
	   Category cat = null;
	   cat = dao.getCategory();
	   List<Product> plist = dao.getProducts();
	   List<Pspec> slist1 = dao.getSpecs(1001);
	   List<Pspec> slist2 = dao.getSpecs(1002);
	  //compose list<pspec> to each product
	   plist.get(0).setPspecs(slist1);	
	   plist.get(1).setPspecs(slist2);
	   //compose list<product> to catgory
	   cat.setProducts(plist);
	   return cat;
   }
}




