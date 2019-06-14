package com.example.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.domain.CRUDResponse;
import com.example.products.domain.CommonResponse;
import com.example.products.domain.Product;
import com.example.products.services.ProductServices;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServices productServices;
	
	
	/**
	 * Get the products
	 * @param productIds : ids of products.
	 * @return
	 */
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<CommonResponse> getProducts(@RequestParam(value="ids")List<Long> productIds) {
		
		return productServices.getProducts();
		
		
	}
	
	/**
	 * Add new Product
	 * @param product : request body of product
	 * @return
	 */
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public CRUDResponse addProduct(@RequestBody Product product) {
		
		return productServices.addNewProduct(product);
		
	}
	/**
	 * Update the product
	 * @param product
	 * @return
	 */
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public CRUDResponse updateProduct(@RequestBody(required = true) Product product) {
		
		return productServices.updateProduct(product);
		
	}
	
	/**
	 * Soft deleting. Status will be turned to Inactive.
	 * @param productId : productId to soft delete
	 * @return 
	 */
	@RequestMapping(value="/{productId}",method = RequestMethod.DELETE)
	@ResponseBody
	public CRUDResponse deleteProduct(@PathVariable(value="productId",required = true) Long productId) {
		
		return productServices.deleteProduct(productId);
		
	}

}
