package kr.or.fineapple.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Food {

	int foodNo;
	String foodCd;
	int foodIntoStt;
	String foodName;
	double servingSize;
	double foodKcal;
	double foodCarb;
	double foodProtein;
	double foodFat;
	double foodSaturatedFattyAcid;
	double foodUnsaturatedFattyAcid;
	double foodCholesterol;
	double foodTransFat;
	double foodSodium;
	double foodSugar;
	int price;
	String foodImg;
	String purchaseConnLink;
	String storeName;
	String makerName;
	int isAPI;
	String Category;

	public Food() {
	
	}

	


}
