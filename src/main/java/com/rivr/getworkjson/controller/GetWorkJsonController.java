package com.rivr.getworkjson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetWorkJsonController {

	@GetMapping("/cotiviti/getworkjson") 
	public String getworkjson() {
		String jsonInput = "{ \"CaseSeq\": 11111111, \"ClientName\": \"DemoTest\", \"TermDte\": \"2024-09-24\", \"CASE_REVIEW_REASON\": [ { \"ReviewReasonId\": 2, \"REVIEW_REASON\": [ { \"ReviewReasonId\": 2 } ] } ], \"CLIENT_ELIGIBILITY\": [ { \"RRE\": \"1234\", \"MedicareAcct5Digits\": \"33664\" } ], \"VERIFICATION\": [ { \"VerificationSeq\": 33333333, \"INQUIRY_TYPE\": [ { \"InquiryTypeId\": 1, \"InquiryTypeName\": \"IVR\" } ] } ], \"CASE_MEMBER\": [ { \"CaseMemberSeq\": 22222222, \"CaseSeq\": 11111111, \"SSN\": \"123456789\", \"MedicareIdPrefix\": \"\", \"MedicareIdSuffix\": \"\", \"FirstNm\": \"JOHN\", \"MiddleNm\": \"H\", \"LastNm\": \"DOE\", \"Suffix\": \"\", \"Gender\": \"M\", \"DeathDte\": \"1900-01-01\", \"DOB\": \"1972-02-02\", \"PlanName\": \"\", \"RelationshipCd\": \"SUB\", \"MedicareEntitlementAgeInd\": false, \"MedicareEntitlementAgeIndSuspected\": \"\", \"MedicareEntitlementDisabilityInd\": false, \"MEMBER_ADDRESS\": [ { \"MemberAddressSeq\": 1234567890, \"CustMemberId\": \"TEST0000000001\", \"CaseMemberSeq\": 22222222, \"Address1\": \"123 Anywhere Street\", \"Address2\": \"\", \"Address3\": \"\", \"City\": \"MiddleOfNowhere\", \"StateCd\": \"IA\" } ], \"MEMBER_ADDRESSES_EXTRA\": [ { \"ZipCd\": \"12345\" } ] } ] }";

		return jsonInput; // Return the response string
	}

}
