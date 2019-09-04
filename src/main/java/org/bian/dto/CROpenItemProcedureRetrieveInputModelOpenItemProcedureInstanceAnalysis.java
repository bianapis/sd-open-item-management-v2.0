package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis
 */
public class CROpenItemProcedureRetrieveInputModelOpenItemProcedureInstanceAnalysis   {
  private String openItemProcedureInstanceAnalysisReference = null;

  private String openItemProcedureInstanceAnalysisReportType = null;

  private String openItemProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return openItemProcedureInstanceAnalysisReference
  **/

  public String getOpenItemProcedureInstanceAnalysisReference() {
    return openItemProcedureInstanceAnalysisReference;
  }

  public void setOpenItemProcedureInstanceAnalysisReference(String openItemProcedureInstanceAnalysisReference) {
    this.openItemProcedureInstanceAnalysisReference = openItemProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return openItemProcedureInstanceAnalysisReportType
  **/

  public String getOpenItemProcedureInstanceAnalysisReportType() {
    return openItemProcedureInstanceAnalysisReportType;
  }

  public void setOpenItemProcedureInstanceAnalysisReportType(String openItemProcedureInstanceAnalysisReportType) {
    this.openItemProcedureInstanceAnalysisReportType = openItemProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return openItemProcedureInstanceAnalysisParameters
  **/

  public String getOpenItemProcedureInstanceAnalysisParameters() {
    return openItemProcedureInstanceAnalysisParameters;
  }

  public void setOpenItemProcedureInstanceAnalysisParameters(String openItemProcedureInstanceAnalysisParameters) {
    this.openItemProcedureInstanceAnalysisParameters = openItemProcedureInstanceAnalysisParameters;
  }


}

