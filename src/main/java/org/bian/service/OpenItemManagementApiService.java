/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface OpenItemManagementApiService {

	SDOpenItemManagementActivateOutputModel activate(SDOpenItemManagementActivateInputModel request);
	
	SDOpenItemManagementConfigureOutputModel configure(String sdReferenceId, SDOpenItemManagementConfigureInputModel request);
	
	CROpenItemProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CROpenItemProcedureControlInputModel request);
	
	BQRepaymentExchangeOutputModel exchangeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExchangeInputModel request);
	
	BQRepaymentExecuteOutputModel executeRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentExecuteInputModel request);
	
	SDOpenItemManagementFeedbackOutputModel feedback(String sdReferenceId, SDOpenItemManagementFeedbackInputModel request);
	
	CROpenItemProcedureInitiateOutputModel initiate(String sdReferenceId, CROpenItemProcedureInitiateInputModel request);
	
	BQRepaymentInitiateOutputModel initiateRepayment(String sdReferenceId, String crReferenceId, BQRepaymentInitiateInputModel request);
	
	CROpenItemProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CROpenItemProcedureRequestInputModel request);
	
	CROpenItemProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQRepaymentRetrieveOutputModel retrieveRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTrackingRetrieveOutputModel retrieveTracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDOpenItemManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CROpenItemProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CROpenItemProcedureUpdateInputModel request);
	
	BQRepaymentUpdateOutputModel updateRepayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRepaymentUpdateInputModel request);
	
}
