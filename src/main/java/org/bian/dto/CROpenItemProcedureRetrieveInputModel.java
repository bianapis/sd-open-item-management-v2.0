package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis;
import org.bian.dto.CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveInputModel
 */
public class CROpenItemProcedureRetrieveInputModel   {
  private Object openItemProcedureRetrieveActionTaskRecord = null;

  private String openItemProcedureRetrieveActionRequest = null;

  private CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord openItemProcedureInstanceReportRecord = null;

  private CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis openItemProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return openItemProcedureRetrieveActionTaskRecord
  **/

  public Object getOpenItemProcedureRetrieveActionTaskRecord() {
    return openItemProcedureRetrieveActionTaskRecord;
  }

  public void setOpenItemProcedureRetrieveActionTaskRecord(Object openItemProcedureRetrieveActionTaskRecord) {
    this.openItemProcedureRetrieveActionTaskRecord = openItemProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return openItemProcedureRetrieveActionRequest
  **/

  public String getOpenItemProcedureRetrieveActionRequest() {
    return openItemProcedureRetrieveActionRequest;
  }

  public void setOpenItemProcedureRetrieveActionRequest(String openItemProcedureRetrieveActionRequest) {
    this.openItemProcedureRetrieveActionRequest = openItemProcedureRetrieveActionRequest;
  }


  /**
   * Get openItemProcedureInstanceReportRecord
   * @return openItemProcedureInstanceReportRecord
  **/

  public CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord getOpenItemProcedureInstanceReportRecord() {
    return openItemProcedureInstanceReportRecord;
  }

  public void setOpenItemProcedureInstanceReportRecord(CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord openItemProcedureInstanceReportRecord) {
    this.openItemProcedureInstanceReportRecord = openItemProcedureInstanceReportRecord;
  }


  /**
   * Get openItemProcedureInstanceAnalysis
   * @return openItemProcedureInstanceAnalysis
  **/

  public CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis getOpenItemProcedureInstanceAnalysis() {
    return openItemProcedureInstanceAnalysis;
  }

  public void setOpenItemProcedureInstanceAnalysis(CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis openItemProcedureInstanceAnalysis) {
    this.openItemProcedureInstanceAnalysis = openItemProcedureInstanceAnalysis;
  }


}

