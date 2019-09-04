/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class OpenItemManagementApiServiceImpl implements OpenItemManagementApiService {

	public SDOpenItemManagementActivateOutputModel activate(SDOpenItemManagementActivateInputModel request){
		return JsonReader.read("activate-SDOpenItemManagementActivateOutputModel.json",new TypeReference<SDOpenItemManagementActivateOutputModel>(){});
	}
	
	public SDOpenItemManagementConfigureOutputModel configure(String sdReferenceId, SDOpenItemManagementConfigureInputModel request){
		return JsonReader.read("configure-SDOpenItemManagementConfigureOutputModel.json",new TypeReference<SDOpenItemManagementConfigureOutputModel>(){});
	}
	
	public CROpenItemProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CROpenItemProcedureControlInputModel request){
		return JsonReader.read("control-CROpenItemProcedureControlOutputModel.json",new TypeReference<CROpenItemProcedureControlOutputModel>(){});
	}
	
	public BQRepaymentExchangeOutputModel exchangeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExchangeInputModel request){
		return JsonReader.read("exchange-BQRepaymentExchangeOutputModel.json",new TypeReference<BQRepaymentExchangeOutputModel>(){});
	}
	
	public BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request){
		return JsonReader.read("execute-BQRepaymentExecuteOutputModel.json",new TypeReference<BQRepaymentExecuteOutputModel>(){});
	}
	
	public SDOpenItemManagementFeedbackOutputModel feedback(String sdReferenceId, SDOpenItemManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDOpenItemManagementFeedbackOutputModel.json",new TypeReference<SDOpenItemManagementFeedbackOutputModel>(){});
	}
	
	public CROpenItemProcedureInitiateOutputModel initiate(String sdReferenceId, CROpenItemProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CROpenItemProcedureInitiateOutputModel.json",new TypeReference<CROpenItemProcedureInitiateOutputModel>(){});
	}
	
	public BQRepaymentInitiateOutputModel initiateRepayment(String sdReferenceId, String crReferenceId, BQRepaymentInitiateInputModel request){
		return JsonReader.read("initiate-BQRepaymentInitiateOutputModel.json",new TypeReference<BQRepaymentInitiateOutputModel>(){});
	}
	
	public CROpenItemProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CROpenItemProcedureRequestInputModel request){
		return JsonReader.read("request-CROpenItemProcedureRequestOutputModel.json",new TypeReference<CROpenItemProcedureRequestOutputModel>(){});
	}
	
	public CROpenItemProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CROpenItemProcedureRetrieveOutputModel.json",new TypeReference<CROpenItemProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRepaymentRetrieveOutputModel.json",new TypeReference<BQRepaymentRetrieveOutputModel>(){});
	}
	
	public BQTrackingRetrieveOutputModel retrieveTracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTrackingRetrieveOutputModel.json",new TypeReference<BQTrackingRetrieveOutputModel>(){});
	}
	
	public SDOpenItemManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDOpenItemManagementRetrieveOutputModel.json",new TypeReference<SDOpenItemManagementRetrieveOutputModel>(){});
	}
	
	public CROpenItemProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CROpenItemProcedureUpdateInputModel request){
		return JsonReader.read("update-CROpenItemProcedureUpdateOutputModel.json",new TypeReference<CROpenItemProcedureUpdateOutputModel>(){});
	}
	
	public BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request){
		return JsonReader.read("update-BQRepaymentUpdateOutputModel.json",new TypeReference<BQRepaymentUpdateOutputModel>(){});
	}
	
}
