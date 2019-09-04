package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord
 */
public class CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceReportRecord   {
  private String openItemProcedureInstanceReportReference = null;

  private String openItemProcedureInstanceReportType = null;

  private String openItemProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return openItemProcedureInstanceReportReference
  **/

  public String getOpenItemProcedureInstanceReportReference() {
    return openItemProcedureInstanceReportReference;
  }

  public void setOpenItemProcedureInstanceReportReference(String openItemProcedureInstanceReportReference) {
    this.openItemProcedureInstanceReportReference = openItemProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return openItemProcedureInstanceReportType
  **/

  public String getOpenItemProcedureInstanceReportType() {
    return openItemProcedureInstanceReportType;
  }

  public void setOpenItemProcedureInstanceReportType(String openItemProcedureInstanceReportType) {
    this.openItemProcedureInstanceReportType = openItemProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return openItemProcedureInstanceReportParameters
  **/

  public String getOpenItemProcedureInstanceReportParameters() {
    return openItemProcedureInstanceReportParameters;
  }

  public void setOpenItemProcedureInstanceReportParameters(String openItemProcedureInstanceReportParameters) {
    this.openItemProcedureInstanceReportParameters = openItemProcedureInstanceReportParameters;
  }


}

