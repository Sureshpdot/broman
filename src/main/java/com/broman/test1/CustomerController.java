/**
 * @Project_Name broman 
 * @Package_Name com.broman.test1
 * @File_Name CustomerController.java
 * @Author Sankar
 * @Created_date_time Apr 7, 2018
 */
package com.broman.test1;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MC6
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerRepository cusRepository;
	
	@RequestMapping(value="/saveCustomer", method = RequestMethod.POST)
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		cusRepository.save(customer);
		return new ResponseEntity<String>("Saved", HttpStatus.OK);
	}
	@RequestMapping(value="/fetchCustomer", method = RequestMethod.POST)
	public ResponseEntity<Customer> fetchCustomer(@RequestBody String id) throws JSONException{
		JSONObject json = new JSONObject(id);
		String id1 = json.getString("id");
		Customer customer = cusRepository.findOne(id1);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@RequestMapping(value="/fetchAllCustomer", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> fetchAllCustomer(){
		List<Customer> listCus = (List<Customer>) cusRepository.findAll();
		return new ResponseEntity<List<Customer>>(listCus, HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateCustomer", method = RequestMethod.PUT)
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
		cusRepository.save(customer);
		return new ResponseEntity<String>("Updated", HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteCustomer(@RequestBody Customer customer){
		cusRepository.delete(customer);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
	
	@RequestMapping(value="/fetchEmailById", method = RequestMethod.POST)
	public ResponseEntity<String> fetchEmailById(@RequestBody String id) throws JSONException{
		JSONObject json = new JSONObject(id);
		String id1 = json.getString("id");
		Customer customer = cusRepository.findOne(id1);
		
		return new ResponseEntity<String>(customer.getEmailAddress().getValue(), HttpStatus.OK);
	}
}
