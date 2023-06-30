package com.maan.eway.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.JsonObject;
import com.maan.eway.req.PaymentSaveReq;
import com.maan.eway.res.SuccessRes;
import com.maan.eway.service.PaymentService;
import com.maan.eway.utils.ApigwClient;
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Override
	public SuccessRes PaymentSave(PaymentSaveReq req) {
		String apiKey = "ALLINSU-8Ylj0rPnRhVUkUSa";
		String apiSecret = "65KJ4ABHl-5JU86L7D-2J254AG-0P636D5P";
		String baseUrl = "https://apigw.selcommobile.com";



		// initalize a new Client instace with values of the base url, api key and api secret
		ApigwClient client = new ApigwClient(baseUrl,apiKey,apiSecret);

		// path relatiive to base url
		String orderPath = "/v1/checkout/create-order";

		// data
		JsonObject orderDict = new JsonObject();
		orderDict.addProperty("vendor","VENDORTILL");
		orderDict.addProperty("order_id","1218d00Y");
		orderDict.addProperty("buyer_email", "john@example.com");
		orderDict.addProperty("buyer_name", "John Joh");
		orderDict.addProperty("buyer_userid", "");
		orderDict.addProperty("buyer_phone", "255xxxxxxxxxx");
		orderDict.addProperty("gateway_buyer_uuid", "");
		orderDict.addProperty("amount",  8000);
		orderDict.addProperty("currency","TZS");
		orderDict.addProperty("payment_methods","ALL");
		orderDict.addProperty("redirect_url","aHR0cHM6Ly9leGFtcGxlLmNvbS8=");
		orderDict.addProperty("cancel_url","aHR0cHM6Ly9leGFtcGxlLmNvbS8=");
		orderDict.addProperty("webhook","aHR0cHM6Ly9leGFtcGxlLmNvbS8=");
		orderDict.addProperty("billing.firstname" , "John");
		orderDict.addProperty("billing.lastname" , "Doe");
		orderDict.addProperty("billing.address_1" , "969 Market");
		orderDict.addProperty("billing.address_2" , "");
		orderDict.addProperty("billing.city" , "San Francisco");
		orderDict.addProperty("billing.state_or_region" , "CA");
		orderDict.addProperty("billing.postcode_or_pobox" , "94103");
		orderDict.addProperty("billing.country" , "US");
		orderDict.addProperty("billing.phone" , "255xxxxxxxxx");
		orderDict.addProperty("shipping.firstname" , "John");
		orderDict.addProperty("shipping.lastname" , "Doe");
		orderDict.addProperty("shipping.address_1" , "969 Market");
		orderDict.addProperty("shipping.address_2" , "");
		orderDict.addProperty("shipping.city" , "San Francisco");
		orderDict.addProperty("shipping.state_or_region" , "CA");
		orderDict.addProperty("shipping.postcode_or_pobox" , "94103");
		orderDict.addProperty("shipping.country" , "US");
		orderDict.addProperty("shipping.phone" , "255xxxxxxxxx");
		orderDict.addProperty("buyer_remarks","None");
		orderDict.addProperty("merchant_remarks","None");
		orderDict.addProperty("no_of_items",  3);


		//post data
		JsonObject response = client.postFunc(orderPath ,orderDict);
		return null;
	}

	 public static void main(String[] args){
		 String apiKey = "ALLINSU-8Ylj0rPnRhVUkUSa";
			String apiSecret = "65KJ4ABHl-5JU86L7D-2J254AG-0P636D5P";
			String baseUrl = "https://apigw.selcommobile.com";
			//String baseUrl = "https://apigw.selcommobile.com";


			// initalize a new Client instace with values of the base url, api key and api secret
			ApigwClient client = new ApigwClient(baseUrl,apiKey,apiSecret);

			// path relatiive to base url
			//String orderPath = "/v1/checkout/create-order";
			String orderStatusPath = "/v1/checkout/order-status";

			// data
			JsonObject orderStatusDict = new JsonObject();
			orderStatusDict.addProperty("order_id","9200708467");


			//get order status
			JsonObject response = client.getFunc(orderStatusPath ,orderStatusDict);
			// data
			/*JsonObject orderDict = new JsonObject();
			orderDict.addProperty("vendor","ALLIANCEINSU");
			orderDict.addProperty("order_id","985624317");
			orderDict.addProperty("buyer_email", "john@example.com");
			orderDict.addProperty("buyer_name", "John Joh");
			orderDict.addProperty("buyer_userid", "");
			orderDict.addProperty("buyer_phone", "255xxxxxxxxxx");
			orderDict.addProperty("gateway_buyer_uuid", "");
			orderDict.addProperty("amount",  8000);
			orderDict.addProperty("currency","TZS");
			orderDict.addProperty("payment_methods","ALL");
			orderDict.addProperty("redirect_url","aHR0cHM6Ly9leGFtcGxlLmNvbS8=");
			orderDict.addProperty("cancel_url","aHR0cHM6Ly9kaWdpZ29hbGxpYW5jZS5jb20vaW5kZXhMb2dpbi5kbw==");
			orderDict.addProperty("webhook","aHR0cHM6Ly9leGFtcGxlLmNvbS8=");
			orderDict.addProperty("billing.firstname" , "John");
			orderDict.addProperty("billing.lastname" , "Doe");
			orderDict.addProperty("billing.address_1" , "969 Market");
			orderDict.addProperty("billing.address_2" , "");
			orderDict.addProperty("billing.city" , "San Francisco");
			orderDict.addProperty("billing.state_or_region" , "CA");
			orderDict.addProperty("billing.postcode_or_pobox" , "94103");
			orderDict.addProperty("billing.country" , "US");
			orderDict.addProperty("billing.phone" , "255xxxxxxxxx");
			orderDict.addProperty("shipping.firstname" , "John");
			orderDict.addProperty("shipping.lastname" , "Doe");
			//orderDict.addProperty("shipping.address_1" , "969 Market");
			orderDict.addProperty("shipping.address_2" , "");
			orderDict.addProperty("shipping.city" , "San Francisco");
			orderDict.addProperty("shipping.state_or_region" , "CA");
			orderDict.addProperty("shipping.postcode_or_pobox" , "94103");
			orderDict.addProperty("shipping.country" , "US");
			orderDict.addProperty("shipping.phone" , "255xxxxxxxxx");
			orderDict.addProperty("buyer_remarks","None");
			orderDict.addProperty("merchant_remarks","None");
			orderDict.addProperty("no_of_items",  3);*/


			//post data
			//JsonObject response = client.postFunc(orderPath ,orderDict);
			System.out.println(response.get("result"));
			System.out.println(response.get("message"));
	    };
	
	
	
	
	
}
