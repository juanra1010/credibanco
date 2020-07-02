package com.spring.boot.credibanco.model;


import java.util.Calendar;

import com.spring.boot.credibanco.soapWs.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserModelo {
	
	private String address;
    private String birthdate;
    private String cellphone;
    private String city;
    private String confirmacionClave;
    private Integer countInvalid;
    private String country;
    private String documentNumber;
    private String email;
    private String enableQ;
    private String expDocumentDate;
    private String firstName;
    private String gender;
    private Boolean interestAuto;
    private Boolean interestBeauty;
    private Boolean interestClothes;
    private Boolean interestElectronics;
    private Boolean interestHome;
    private String interestOther;
    private Boolean interestTelco;
    private Boolean interestTravel;
    private String lastName;
    private String locked;
    private String maritalStatus;
    private int openSession;
    private String otp;
    private String otpExpiration;
    private String otpLogin;
    private String otpLoginExpiration;
    private int otpLoginTries;
    private int otpTries;
    private String password;
    private String passwordDate;
    private String registerDate;
    private String registerEnable;
    private String secondLastName;
    private String secondName;
    private String sessionid;
    private int trxVal;
    private String tyc;
    private String userType;
    
	
    
	public UserModelo(User user) {
		super();
		this.address = user.getAddress();
		this.birthdate = String.valueOf(user.getBirthdate());
		this.cellphone = user.getCellphone();
		this.city = user.getCity();
		this.confirmacionClave = user.getConfirmacionClave();
		this.countInvalid = user.getCountInvalid();
		this.country = user.getCountry();
		this.documentNumber = user.getDocumentNumber();
		this.email = user.getEmail();
		this.enableQ = user.getEnableQ();
		this.expDocumentDate = user.getExpDocumentDate();
		this.firstName = user.getFirstName();
		this.gender = user.getGender();
		this.interestAuto = user.isInterestAuto();
		this.interestBeauty = user.isInterestBeauty();
		this.interestClothes = user.isInterestClothes();
		this.interestElectronics = user.isInterestElectronics();
		this.interestHome = user.isInterestHome();
		this.interestOther = user.getInterestOther();
		this.interestTelco = user.isInterestTelco();
		this.interestTravel = user.isInterestTravel();
		this.lastName = user.getLastName();
		this.locked = user.getLocked();
		this.maritalStatus = user.getMaritalStatus();
		this.openSession = user.getOpenSession();
		this.otp = user.getOtp();
		this.otpExpiration = String.valueOf(user.getOtpExpiration());
		this.otpLogin = user.getOtpLogin();
		this.otpLoginExpiration = String.valueOf(user.getOtpLoginExpiration());
		this.otpLoginTries = user.getOtpLoginTries();
		this.otpTries = user.getOtpTries();
		this.password = user.getPassword();
		this.passwordDate = String.valueOf(user.getPasswordDate());
		this.registerDate = String.valueOf(user.getRegisterDate());
		this.registerEnable = user.getRegisterEnable();
		this.secondLastName = user.getSecondLastName();
		this.secondName = user.getSecondName();
		this.sessionid = user.getSessionid();
		this.trxVal = user.getTrxVal();
		this.tyc = user.getTyc();
		this.userType = user.getUserType();
	}
    
}
