package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentRetrieveInputModelRepaymentInstanceAnalysis;
import org.bian.dto.BQRepaymentRetrieveInputModelRepaymentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveInputModel
 */
public class BQRepaymentRetrieveInputModel   {
  private Object repaymentRetrieveActionTaskRecord = null;

  private String repaymentRetrieveActionRequest = null;

  private BQRepaymentRetrieveInputModelRepaymentInstanceReport repaymentInstanceReport = null;

  private BQRepaymentRetrieveInputModelRepaymentInstanceAnalysis repaymentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return repaymentRetrieveActionTaskRecord
  **/

  public Object getRepaymentRetrieveActionTaskRecord() {
    return repaymentRetrieveActionTaskRecord;
  }

  public void setRepaymentRetrieveActionTaskRecord(Object repaymentRetrieveActionTaskRecord) {
    this.repaymentRetrieveActionTaskRecord = repaymentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return repaymentRetrieveActionRequest
  **/

  public String getRepaymentRetrieveActionRequest() {
    return repaymentRetrieveActionRequest;
  }

  public void setRepaymentRetrieveActionRequest(String repaymentRetrieveActionRequest) {
    this.repaymentRetrieveActionRequest = repaymentRetrieveActionRequest;
  }


  /**
   * Get repaymentInstanceReport
   * @return repaymentInstanceReport
  **/

  public BQRepaymentRetrieveInputModelRepaymentInstanceReport getRepaymentInstanceReport() {
    return repaymentInstanceReport;
  }

  public void setRepaymentInstanceReport(BQRepaymentRetrieveInputModelRepaymentInstanceReport repaymentInstanceReport) {
    this.repaymentInstanceReport = repaymentInstanceReport;
  }


  /**
   * Get repaymentInstanceAnalysis
   * @return repaymentInstanceAnalysis
  **/

  public BQRepaymentRetrieveInputModelRepaymentInstanceAnalysis getRepaymentInstanceAnalysis() {
    return repaymentInstanceAnalysis;
  }

  public void setRepaymentInstanceAnalysis(BQRepaymentRetrieveInputModelRepaymentInstanceAnalysis repaymentInstanceAnalysis) {
    this.repaymentInstanceAnalysis = repaymentInstanceAnalysis;
  }


}

