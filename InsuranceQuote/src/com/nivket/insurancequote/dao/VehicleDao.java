package com.nivket.insurancequote.dao;

import com.nivket.insurancequote.entity.VehicleInfo;

public class VehicleDao {

	String vin;
	
	public VehicleInfo getVehicleInfo(String vin){
		VehicleInfo vehicleinfo= new VehicleInfo();
		String manufacture=null;
		String type;
		
		int number= vin.length()-5;
		for(int i =0; i<number; i++){
			manufacture	+=vin.charAt(i);
			if(manufacture=="Benz"||manufacture=="BMW"){
				type="Good";}
			else {
				
				type="Not Good";
			}
			
			vehicleinfo.setType(type);
			vehicleinfo.setManufacture(manufacture);
			vehicleinfo.setVin(vin);
			
			return vehicleinfo;
			
			
			
			}
		return vehicleinfo;
			
		}
		
	}

