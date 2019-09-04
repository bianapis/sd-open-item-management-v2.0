package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CROpenItemProcedureRetrieveOutputModelCROpenItemProcedureInstanceRecord;
import org.bian.dto.CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis;
import org.bian.dto.CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveOutputModel
 */
public class CROpenItemProcedureRetrieveOutputModel   {
  private CROpenItemProcedureRetrieveOutputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord = null;

  private String openItemProcedureRetrieveActionTaskReference = null;

  private Object openItemProcedureRetrieveActionTaskRecord = null;

  private String openItemProcedureRetrieveActionResponse = null;

  private CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord openItemProcedureInstanceReportRecord = null;

  private CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis openItemProcedureInstanceAnalysis = null;


  /**
   * Get cROpenItemProcedureInstanceRecord
   * @return cROpenItemProcedureInstanceRecord
  **/

  public CROpenItemProcedureRetrieveOutputModelCROpenItemProcedureInstanceRecord getCROpenItemProcedureInstanceRecord() {
    return cROpenItemProcedureInstanceRecord;
  }

  @JsonProperty("cROpenItemProcedureInstanceRecord")
  public void setCROpenItemProcedureInstanceRecord(CROpenItemProcedureRetrieveOutputModelCROpenItemProcedureInstanceRecord cROpenItemProcedureInstanceRecord) {
    this.cROpenItemProcedureInstanceRecord = cROpenItemProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Open Item Procedure instance retrieve service call 
   * @return openItemProcedureRetrieveActionTaskReference
  **/

  public String getOpenItemProcedureRetrieveActionTaskReference() {
    return openItemProcedureRetrieveActionTaskReference;
  }

  public void setOpenItemProcedureRetrieveActionTaskReference(String openItemProcedureRetrieveActionTaskReference) {
    this.openItemProcedureRetrieveActionTaskReference = openItemProcedureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return openItemProcedureRetrieveActionResponse
  **/

  public String getOpenItemProcedureRetrieveActionResponse() {
    return openItemProcedureRetrieveActionResponse;
  }

  public void setOpenItemProcedureRetrieveActionResponse(String openItemProcedureRetrieveActionResponse) {
    this.openItemProcedureRetrieveActionResponse = openItemProcedureRetrieveActionResponse;
  }


  /**
   * Get openItemProcedureInstanceReportRecord
   * @return openItemProcedureInstanceReportRecord
  **/

  public CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord getOpenItemProcedureInstanceReportRecord() {
    return openItemProcedureInstanceReportRecord;
  }

  public void setOpenItemProcedureInstanceReportRecord(CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceReportRecord openItemProcedureInstanceReportRecord) {
    this.openItemProcedureInstanceReportRecord = openItemProcedureInstanceReportRecord;
  }


  /**
   * Get openItemProcedureInstanceAnalysis
   * @return openItemProcedureInstanceAnalysis
  **/

  public CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis getOpenItemProcedureInstanceAnalysis() {
    return openItemProcedureInstanceAnalysis;
  }

  public void setOpenItemProcedureInstanceAnalysis(CROpenItemProcedureRetrieveOutputModelOpenItemProcedureInstanceAnalysis openItemProcedureInstanceAnalysis) {
    this.openItemProcedureInstanceAnalysis = openItemProcedureInstanceAnalysis;
  }


}

