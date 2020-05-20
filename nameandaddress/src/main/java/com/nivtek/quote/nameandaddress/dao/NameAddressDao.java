package com.nivtek.quote.nameandaddress.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.nivtek.quote.nameandaddress.exception.NameAddressNotFoundException;
import com.nivtek.quote.nameandaddress.model.MailingInfo;
import com.nivtek.quote.nameandaddress.model.NameAndAddress;

@Component
public class NameAddressDao implements InitializingBean {

	private static List<NameAndAddress> store = new ArrayList<>();

	private static final String DATA_FILE_PATH = "datafilepath";

	public NameAndAddress addNameAndAddress(NameAndAddress nameAndAddress) {

		nameAndAddress.setId(UUID.randomUUID().toString());

		store.add(nameAndAddress);

		return nameAndAddress;

	}

	public NameAndAddress updateNameAddress(String Id, NameAndAddress nameAddress) {

		for (int index = 0; index < store.size(); index++) {
			NameAndAddress nmd = store.get(index);
			if (nmd.getId().equals(nameAddress.getId())) {

				return store.set(index, nameAddress);

			}

		}
		throw new NameAddressNotFoundException();
	}

	public NameAndAddress fetchNameAddress(String Id) {

		for (int index = 0; index < store.size(); index++) {
			NameAndAddress nmd = store.get(index);
			if (nmd.getId().equals(Id)) {
				return nmd;
			}
		}

		throw new NameAddressNotFoundException();
	}
	
	public List<NameAndAddress> fetchAllNameAddress() {

		return store;
		
	
	}
	@Override
	public void afterPropertiesSet() throws Exception {

		String filePath = System.getProperty(DATA_FILE_PATH);
		
		System.out.println("File path "+ filePath);

		BufferedReader bfr = new BufferedReader(new FileReader(filePath));

//		StringBuliber br = new StringBuilder("");

		String line = null;

		while ((line = bfr.readLine()) != null) {
			String tokens[] = line.split(",");

			NameAndAddress nmd = new NameAndAddress();

			nmd.setFirstName(tokens[0]);
			nmd.setLastName(tokens[1]);
			nmd.setDOB(tokens[2]);

			MailingInfo mailInfo = new MailingInfo();

			mailInfo.setStreet(tokens[3]);
			mailInfo.setCity(tokens[4]);
			mailInfo.setState(tokens[5]);
			mailInfo.setZip(tokens[6]);

			nmd.setMailingInfo(mailInfo);
			addNameAndAddress(nmd);
		}

		bfr.close();
	}

}